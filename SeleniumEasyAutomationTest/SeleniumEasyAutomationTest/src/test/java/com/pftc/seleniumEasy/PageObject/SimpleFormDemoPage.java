package com.pftc.seleniumEasy.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormDemoPage extends Base {

	public SimpleFormDemoPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Input Forms")
	public WebElement inputForms;
	@FindBy(linkText = "Simple Form Demo")
	public WebElement simpleFormDemo;
	@FindBy(xpath = "//*[@id=\"user-message\"]")
	public WebElement enterMessageBox;
	@FindBy(xpath = "//*[@id=\"get-input\"]/button")
	public WebElement showMessage;
	@FindBy(xpath = "//*[@id=\"display\"]")
	public WebElement displayMessage;
	@FindBy(xpath = "//*[@id=\"sum1\"]")
	public WebElement enterA;
	@FindBy(xpath = "//*[@id=\"sum2\"]")
	public WebElement enterB;
	@FindBy(xpath = "//*[@id=\"gettotal\"]/button")
	public WebElement getTotal;
	@FindBy(xpath = "//*[@id=\"displayvalue\"]")
	public WebElement totalAPlusB;
	
	public void inputFormsButton() {
		inputForms.click();
	}

	public void simpleFormDemoButton() {
		simpleFormDemo.click();
	}

	public void enterMessageTextBox() {
		enterMessageBox.sendKeys("Testing Simple Form Demo Single Input Field");

	}

	public void showMessageButton() {
		showMessage.click();
	}

	public String yourMessage() {
		return displayMessage.getText();
	}
	public void enterATextBox() {
		enterA.sendKeys("25");
	}

	public void enterBTextBox() {
		enterB.sendKeys("35");
	}

	public void getTotalButton() {
		getTotal.click();
	}

	public String totalAPlusBValue() {
		return totalAPlusB.getText().trim();
	}

}
