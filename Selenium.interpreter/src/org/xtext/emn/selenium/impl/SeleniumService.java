package org.xtext.emn.selenium.impl;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.xtext.emn.selenium.ISeleniumService;

public class SeleniumService implements ISeleniumService {

	//Singleton pattern
	private SeleniumService(){}
	private static class SeleniumServiceHandler {
		private final static ISeleniumService instance = new SeleniumService();
	}
	public static ISeleniumService getInstance() {
		return SeleniumServiceHandler.instance;
	}

	private WebDriver driver;

	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#setDriver(java.lang.String)
	 */
	@Override
	public void setDriver(String browserName) {
		if("firefox".equalsIgnoreCase(browserName)) {
			driver = new FirefoxDriver();
		} else if("chrome".equalsIgnoreCase(browserName)) {
			driver = new ChromeDriver();
		} else if("ie".equalsIgnoreCase(browserName)) {
			driver = new InternetExplorerDriver();
		} else 
			throw new RuntimeException("unknown browser : " + browserName);
	}


	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#gotoLink(java.lang.String)
	 */
	@Override
	public void gotoLink(String url) {
		driver.get(url);
	}
	
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#fillInput(org.openqa.selenium.WebElement, java.lang.String)
	 */
	@Override
	public void fillInput(WebElement e, String str) {
		//TODO
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#clickButton(org.openqa.selenium.WebElement)
	 */
	@Override
	public void clickButton(WebElement e) {
		e.click();
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#isChecked(org.openqa.selenium.WebElement)
	 */
	@Override
	public boolean isChecked(WebElement e) {
		return true; //TODO
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#isEnabled(org.openqa.selenium.WebElement)
	 */
	@Override
	public boolean isEnabled(WebElement e) {
		return true; //TODO
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#exists(org.openqa.selenium.WebElement)
	 */
	@Override
	public boolean exists(WebElement e) {
		return true; //TODO
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#contains(org.openqa.selenium.WebElement, java.lang.String)
	 */
	@Override
	public boolean contains(WebElement e, String s) {
		return true; //TODO
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#equals(org.openqa.selenium.WebElement, java.lang.String)
	 */
	@Override
	public boolean equals(WebElement e, String s) {
		return true; //TODO
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#getButton(java.lang.String)
	 */
	@Override
	public WebElement getButton(String id) {
		return null; //TODO
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#getLink(java.lang.String)
	 */
	@Override
	public WebElement getLink(String id) {
		return null; //TODO
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#getCheckbox(java.lang.String)
	 */
	@Override
	public WebElement getCheckbox(String id) {
		return null; //TODO
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#getText(java.lang.String)
	 */
	@Override
	public String getText(String id) {
		return null; //TODO
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#getInput(java.lang.String)
	 */
	@Override
	public WebElement getInput(String id) {
		return null; //TODO
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#getButtons(java.lang.String)
	 */
	@Override
	public List<WebElement> getButtons(String id) {
		return null; //TODO
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#getLinks(java.lang.String)
	 */
	@Override
	public List<WebElement> getLinks(String id) {
		return null; //TODO
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#getCheckboxes(java.lang.String)
	 */
	@Override
	public List<WebElement> getCheckboxes(String id) {
		return null; //TODO
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.emn.selenium.interpreter.ISeleniumService#getInputs(java.lang.String)
	 */
	@Override
	public List<WebElement> getInputs(String id) {
		return null; //TODO
	}

}