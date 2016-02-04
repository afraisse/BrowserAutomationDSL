package org.xtext.emn.selenium.interpreter;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.xtext.emn.selenium.ISeleniumService;
import org.xtext.emn.selenium.impl.SeleniumService;
import org.xtext.emn.selenium.sel.Affectation;
import org.xtext.emn.selenium.sel.Check;
import org.xtext.emn.selenium.sel.Exec;
import org.xtext.emn.selenium.sel.Expression;
import org.xtext.emn.selenium.sel.Fill;
import org.xtext.emn.selenium.sel.GoTo;
import org.xtext.emn.selenium.sel.Instruction;
import org.xtext.emn.selenium.sel.Program;
import org.xtext.emn.selenium.sel.Sequence;
import org.xtext.emn.selenium.sel.Test;
import org.xtext.emn.selenium.sel.Value;
import org.xtext.emn.selenium.sel.Variable;
import org.xtext.emn.selenium.sel.Verify;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Interpreter {

	Map<String, Sequence> seqs = new HashMap<>();
	Map<String, Map<String, Expression>> env = new HashMap<>();
	
	private ISeleniumService service = SeleniumService.getInstance();

	public void execute(Program program) {
		EList<Test> tests = program.getTests();
		
		// We store sequences for later execution
		for (Sequence s : program.getSequences()) {
			seqs.put(s.getName(), s);
		}
		
		// We roll out the tests
		for (Test t : tests) {
			this.execTest(t);
		}
	}

	private void execTest(Test t) {
		// Each test happens in a specific browser
		service.setDriver(t.getBrowser());

		EList<Exec> body = t.getBody();
		for (Exec e : body) {
			execInstr(e);
		}
	}
	
	private void execInstr(Instruction instr) {
		if (instr instanceof Sequence) {
			// Store the seq for further execution
			Sequence seq = (Sequence) instr;
			seqs.put(seq.getName(), seq);
		} else if (instr instanceof Affectation) {
			Affectation aff = (Affectation) instr;
			// Retrieve affectation environment - which is always a Seq
			Sequence parent = (Sequence) aff.eContainer();
			env.get(parent.getName()).put(aff.getVariable().getName(), aff.getValue());
		} else if (instr instanceof Exec){
			Exec exec = (Exec) instr;
			Sequence seq = seqs.get(exec.getSequence().getName());
			
			// Environment creation			
			HashMap<String, Expression> seqEnv = new HashMap<>();
			
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
				this.execInstr(seqInstr);
			}
		} else if (instr instanceof Fill) {
			
		} else if (instr instanceof Check) {
			
		} else if (instr instanceof Click) {
			
		} else if (instr instanceof Verify) {
			
		} else if (instr instanceof GoTo) {
			
		} else {
			System.err.println("Unrecognized instruction : " + instr.toString());
		}
		
	}

}
