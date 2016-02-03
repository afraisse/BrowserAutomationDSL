package org.xtext.emn.selenium.interpreter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.xtext.emn.selenium.sel.Condition;
import org.xtext.emn.selenium.sel.GetCheckbox;
import org.xtext.emn.selenium.sel.GetLink;
import org.xtext.emn.selenium.sel.Instruction;
import org.xtext.emn.selenium.sel.Program;
import org.xtext.emn.selenium.sel.Sequence;
import org.xtext.emn.selenium.sel.Test;
import org.xtext.emn.selenium.sel.Verify;

public class Interpreter {
	
	Map<String, Object> environment = new HashMap<String, Object>();

	public void execute(Program program) {
		Iterator<Sequence> itSeq = program.getSequences().iterator();
		Iterator<Test> itTests = program.getTests().iterator();
		
		Sequence seq;
		do {
			seq = itSeq.next();
			this.step(seq);
		} while (itSeq.hasNext());
		
	}
	
	private void step(Instruction i) {
		
	}

	public static void project() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}

	public static void RULE_goto(WebDriver driver, String url) {
		driver.get(url);
	}
	public static void RULE_click(WebDriver driver, WebElement e) {
		e.click();
	}
	public static void RULE_verify(WebDriver driver, Verify v ) {
		 Condition c = v.getCondition();
	}
	
	public static void RULE_getLinks(WebDriver driver, Verify v ) {
		 Condition c = v.getCondition();
		
	}
	
	public static boolean RULE_GetCheckbox(WebDriver driver, GetCheckbox cb) {
		String s = getOne(cb.getVar().getName(), cb.getValue(), "" );
		WebElement e = driver.findElement(By.tagName("input").name(s));
		return true; //TODO;
	}
	
	public static String RULE_GetLink(WebDriver driver, GetLink gl) {
		String s = getOne(gl.getVar().getName(), gl.getValue(), "" );
		WebElement e = driver.findElement(By.tagName("a").linkText(s));
		return e.getAttribute("href"); 
	}
	
	public static String getOne(String a, String b, String defaultStr) {
		if(a != null) {
			return a;
		} else {
			if(b != null) {
				return b;
			} else
				return defaultStr;
		}
	}
}
