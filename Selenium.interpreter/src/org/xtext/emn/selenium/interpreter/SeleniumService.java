package org.xtext.emn.selenium.interpreter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.xtext.emn.selenium.sel.Condition;
import org.xtext.emn.selenium.sel.GetCheckbox;
import org.xtext.emn.selenium.sel.GetLink;
import org.xtext.emn.selenium.sel.Verify;

public class SeleniumService {

	
		public WebDriver getDriver(String browserName) {
			if(browserName.equalsIgnoreCase("firefox")) {
				return new FirefoxDriver();
			} else if(browserName.equalsIgnoreCase("chrome")) {
				return new ChromeDriver();
			} else if(browserName.equalsIgnoreCase("ie")) {
				return new InternetExplorerDriver();
			} else 
				throw new RuntimeException("unknown browser : " + browserName);
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
			/*String s = getOne(cb.getVar().getName(), cb.getValue(), "" );
			WebElement e = driver.findElement(By.tagName("input").name(s));
			return true; *///TODO;
			return true;
		}

		public static String RULE_GetLink(WebDriver driver, GetLink gl) {
			/*String s = getOne(gl.getVar().getName(), gl.getValue(), "" );
			WebElement e = driver.findElement(By.tagName("a").linkText(s));
			return e.getAttribute("href"); */
			return "";
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
