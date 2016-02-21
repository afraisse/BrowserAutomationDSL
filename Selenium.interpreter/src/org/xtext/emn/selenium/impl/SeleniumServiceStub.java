package org.xtext.emn.selenium.impl;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.xtext.emn.selenium.ISeleniumService;

public class SeleniumServiceStub implements ISeleniumService {
	
	private WebElement stub = new WebElement() {
		
		@Override
		public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void submit() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void sendKeys(CharSequence... arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean isSelected() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isDisplayed() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public String getText() {
			// TODO Auto-generated method stub
			return "element";
		}
		
		@Override
		public String getTagName() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Dimension getSize() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Rectangle getRect() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Point getLocation() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getCssValue(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getAttribute(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<WebElement> findElements(By arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public WebElement findElement(By arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void click() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
	};

	@Override
	public void setDriver(String browserName) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void setDriver(String browserName, String binaryPath) {
		// TODO Auto-generated method stub

	}

	@Override
	public void gotoLink(WebElement link) {
		System.out.println("gotolink : " + link.getText());
	}

	@Override
	public void fillInput(WebElement e, String str) {
		System.out.println("fillInput : " + str);

	}

	@Override
	public void clickButton(WebElement e) {
		System.out.println("clickButton : " + e.getText());

	}

	@Override
	public boolean isChecked(WebElement e) {
		System.out.println("isChecked : " + e.getText());
		return true;
	}

	@Override
	public boolean isEnabled(WebElement e) {
		System.out.println("isEnabled : " + e.getText());
		return false;
	}

	@Override
	public boolean exists(WebElement e) {
		System.out.println("exists: " + e.getText());
		return true;
	}

	@Override
	public boolean contains(WebElement e, String s) {
		System.out.println("contains : " + s);
		return true;
	}

	@Override
	public boolean equals(WebElement e, String s) {
		System.out.println("equals : " + s);
		return false;
	}

	@Override
	public WebElement getButton(String id) {
		System.out.println("getButton : "+id);
		return this.stub;
	}

	@Override
	public WebElement getLink(String id) {
		System.out.println("getLink : " + id);
		return this.stub;
	}

	@Override
	public WebElement getCheckbox(String id) {
		System.out.println("getCheckBox : "+id);
		return this.stub;
	}

	@Override
	public String getText(String id) {
		System.out.println("getText : "+id);
		return "stub";
	}

	@Override
	public WebElement getInput(String id) {
		System.out.println("getInput : "+id);
		return this.stub;
	}

	@Override
	public List<WebElement> getButtons(String id) {
		List<WebElement> list = new ArrayList<WebElement>();
		list.add(this.stub);
		list.add(this.stub);
		return list;
	}

	@Override
	public List<WebElement> getLinks(String id) {
		List<WebElement> list = new ArrayList<WebElement>();
		list.add(this.stub);
		list.add(this.stub);
		return list;
	}

	@Override
	public List<WebElement> getCheckboxes(String id) {
		List<WebElement> list = new ArrayList<WebElement>();
		list.add(this.stub);
		list.add(this.stub);
		return list;
	}

	@Override
	public List<WebElement> getInputs(String id) {
		List<WebElement> list = new ArrayList<WebElement>();
		list.add(this.stub);
		list.add(this.stub);
		return list;
	}

	@Override
	public void tickCheckbox(WebElement e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gotoLink(String link) {
		// TODO Auto-generated method stub
		
	}

}
