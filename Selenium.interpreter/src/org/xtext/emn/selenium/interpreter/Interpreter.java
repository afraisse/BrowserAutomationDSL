package org.xtext.emn.selenium.interpreter;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.xtext.emn.selenium.ISeleniumService;
import org.xtext.emn.selenium.impl.SeleniumService;
import org.xtext.emn.selenium.sel.Exec;
import org.xtext.emn.selenium.sel.Program;
import org.xtext.emn.selenium.sel.Sequence;
import org.xtext.emn.selenium.sel.Test;

public class Interpreter {

	Map<String, Object> environment = new HashMap<String, Object>();

	private EList<Sequence> progSequences;
	private EList<Test> progTests;
	
	private ISeleniumService service = SeleniumService.getInstance();


	public void execute(Program program) {
		progTests = program.getTests();

		for(Test t : progTests) {
			this.execTest(t);
		}
	}

	
	private void execTest(Test t) {
		service.setDriver(t.getBrowser());

		EList<Exec> sequencesToExec = t.getBody();
		for(Exec e : sequencesToExec) {
			this.execSequence(e.getSequence(), e.getParams());
		}
	}

	private void execSequence(Sequence seq, EList<String> params) {
		
	}
	
	

}
