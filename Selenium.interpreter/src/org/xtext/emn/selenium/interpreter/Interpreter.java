package org.xtext.emn.selenium.interpreter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.xtext.emn.selenium.sel.Condition;
import org.xtext.emn.selenium.sel.Exec;
import org.xtext.emn.selenium.sel.GetCheckbox;
import org.xtext.emn.selenium.sel.GetLink;
import org.xtext.emn.selenium.sel.Instruction;
import org.xtext.emn.selenium.sel.Program;
import org.xtext.emn.selenium.sel.Sequence;
import org.xtext.emn.selenium.sel.Test;
import org.xtext.emn.selenium.sel.Verify;

public class Interpreter {

	Map<String, Object> environment = new HashMap<String, Object>();

	private EList<Sequence> progSequences;
	private EList<Test> progTests;
	
	private SeleniumService service = new SeleniumService();


	public void execute(Program program) {
		progSequences = program.getSequences();
		progTests = program.getTests();

		for(Test t : progTests) {
			this.execTest(t);
		}
	}

	
	private void execTest(Test t) {
		
		String browserStr = t.getBrowser();
		WebDriver driver = service.getDriver(browserStr);

		EList<Exec> sequencesToExec = t.getBody();
		for(Exec e : sequencesToExec) {
			this.execSequence(driver, e.getSequence(), e.getParams());
		}
	}

	private void execSequence(WebDriver driver, Sequence seq, EList<String> params) {
		
	}
	
	

}
