package org.xtext.emn.selenium.interpreter;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.openqa.selenium.WebElement;
import org.xtext.emn.selenium.ISeleniumService;
import org.xtext.emn.selenium.impl.SeleniumServiceStub;
import org.xtext.emn.selenium.sel.Affectation;
import org.xtext.emn.selenium.sel.Check;
import org.xtext.emn.selenium.sel.Click;
import org.xtext.emn.selenium.sel.Exec;
import org.xtext.emn.selenium.sel.Expression;
import org.xtext.emn.selenium.sel.Fill;
import org.xtext.emn.selenium.sel.GetButton;
import org.xtext.emn.selenium.sel.GetCheckbox;
import org.xtext.emn.selenium.sel.GetInput;
import org.xtext.emn.selenium.sel.GetLink;
import org.xtext.emn.selenium.sel.GoTo;
import org.xtext.emn.selenium.sel.Instruction;
import org.xtext.emn.selenium.sel.Program;
import org.xtext.emn.selenium.sel.Sequence;
import org.xtext.emn.selenium.sel.Test;
import org.xtext.emn.selenium.sel.Value;
import org.xtext.emn.selenium.sel.Variable;
import org.xtext.emn.selenium.sel.Verify;

public class Interpreter {

	Map<String, Sequence> seqs = new HashMap<>();
	Map<String, Map<String, Object>> env = new HashMap<>();

	private ISeleniumService service = new SeleniumServiceStub();

	public void run(Program program) {
		EList<Test> tests = program.getTests();

		// We store sequences for later execution
		for (Sequence s : program.getSequences()) {
			seqs.put(s.getName(), s);
		}

		// We roll out the tests
		for (Test t : tests) {
			this.test(t);
		}
	}

	private void test(Test t) {
		// Each test happens in a specific browser
		service.setDriver(t.getBrowser());

		EList<Exec> body = t.getBody();
		for (Exec e : body) {
			execute(e);
		}
	}

	private void execute(Instruction instr) {
		if (instr instanceof Sequence) {
			// Store the seq for further execution
			Sequence seq = (Sequence) instr;
			seqs.put(seq.getName(), seq);
		} else if (instr instanceof Affectation) {
			Affectation aff = (Affectation) instr;
			// Retrieve affectation environment - which is always a Sequence
			Sequence parent = (Sequence) aff.eContainer();
			// We evaluate the expression stored in the variable
			if (aff.getValue() instanceof Value) {
				env.get(parent.getName()).put(aff.getVariable().getName(), evaluateValue((Value) aff.getValue()));
			} else {
				env.get(parent.getName()).put(aff.getVariable().getName(), evaluateExpression(aff.getValue()));
			}
		} else if (instr instanceof Exec) {
			Exec exec = (Exec) instr;
			Sequence seq = seqs.get(exec.getSequence().getName());

			// Environment creation
			HashMap<String, Object> seqEnv = new HashMap<>();

			// We pass the sequence parameters to the environment
			EList<Variable> parameters = seq.getParameters();
			EList<Value> values = exec.getParams();
			int i = 0;
			while (i++ < parameters.size()) {
				seqEnv.put(parameters.get(i).getName(), values.get(i));
			}
			env.put(seq.getName(), seqEnv);

			// Roll out the sequence
			for (Instruction seqInstr : seq.getBody()) {
				this.execute(seqInstr);
			}
		} else if (instr instanceof Fill) {
			Fill fill = (Fill) instr;
			Value value = fill.getValue();
			
			WebElement field = this.evaluateExpression((Expression) fill.getField());
			this.service.fillInput(field, (String) this.evaluateValue(value));
		} else if (instr instanceof Check) {
			Check check = (Check) instr;
			
			WebElement checkbox = this.evaluateExpression((Expression) check.getCheckbox());
			this.service.tickCheckbox(checkbox);
		} else if (instr instanceof Click) {
			Click click = (Click) instr;
			
			WebElement button = this.evaluateExpression((Expression) click.getButton());
			this.service.clickButton(button);
		} else if (instr instanceof Verify) {

		} else if (instr instanceof GoTo) {
			GoTo goTo = (GoTo) instr;
			
			WebElement link = this.evaluateExpression((Expression) goTo.getLink());
			this.service.gotoLink(link);
		} else {
			System.err.println("Unrecognized instruction : " + instr.toString());
		}

	}
	
	/**
	 * Evaluate the given expression 
	 * 
	 * @param expr the expression
	 * @return the evaluated expression as a WebElement 
	 */
	private WebElement evaluateExpression(Expression expr) {
		Value value = null;
		if (expr instanceof GetButton) {
			value = ((GetButton) expr).getValue();
			return this.service.getButton((String) this.evaluateValue(value));
		} else if (expr instanceof GetLink) {
			value = ((GetLink) expr).getValue();
			return this.service.getLink((String) this.evaluateValue(value));
		} else if (expr instanceof GetCheckbox) {
			value = ((GetCheckbox) expr).getValue();
			return this.service.getCheckbox((String) this.evaluateValue(value));
		} else if (expr instanceof GetInput) {
			value = ((GetInput) expr).getValue();
			return this.service.getInput((String) this.evaluateValue(value));
		} else if (expr instanceof Variable) {
			Variable var = (Variable) expr;
			// Retrieve the var context
			return (WebElement) this.env.get(((Sequence) var.eContainer()).getName()).get(var.getName()); 	
		} else {
			System.err.println("Unrecognized expression : " + expr.toString());
			return null;
		}
	}

	/**
	 * Evaluate the given value
	 * 
	 * @param val a value
	 * @return the evaluated value
	 */
	private Object evaluateValue(Value value) {
		if (value.getVar() == null)
			return value.getStr();
		else
			return this.env.get(((Sequence) value.eContainer()).getName()).get(value.getVar().getName());
	}

}
