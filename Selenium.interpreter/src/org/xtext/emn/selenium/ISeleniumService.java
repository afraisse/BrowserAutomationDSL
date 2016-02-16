package org.xtext.emn.selenium;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface ISeleniumService {

	void setDriver(String browserName);
	
	void closeDriver();

	void gotoLink(WebElement link);

	void fillInput(WebElement e, String str);

	void clickButton(WebElement e);
	
	void tickCheckbox(WebElement e);

	boolean isChecked(WebElement e);

	boolean isEnabled(WebElement e);

	boolean exists(WebElement e);

	boolean contains(WebElement e, String s);

	boolean equals(WebElement e, String s);

	WebElement getButton(String id);

	WebElement getLink(String id);

	WebElement getCheckbox(String id);

	String getText(String id);

	WebElement getInput(String id);

	List<WebElement> getButtons(String id);

	List<WebElement> getLinks(String id);

	List<WebElement> getCheckboxes(String id);

	List<WebElement> getInputs(String id);

}