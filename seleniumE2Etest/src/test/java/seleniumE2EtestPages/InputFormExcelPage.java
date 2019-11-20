package seleniumE2EtestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputFormExcelPage extends BasePageSelenium{
	
	public InputFormExcelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText="Input Forms")
	WebElement InputForms;
	
	@FindBy (linkText="Simple Form Demo")
	WebElement SimpleformDemo;
	
	@FindBy (id="user-message")
	WebElement user_message;
	
	@FindBy (xpath="//*[@id=\"get-input\"]/button")
	WebElement showmessage;
	
	@FindBy(id="sum1")
	WebElement EnterA;
	
	@FindBy(id="sum2")
	WebElement EnterB;
	
	
	@FindBy(xpath=" //*[@id=\"gettotal\"]/button")
	WebElement Total;
	
	public void InputForms() {
		InputForms.click();
			}
	
	public void SimpleformDemo() {
		SimpleformDemo.click();
	}
	
	public void user_message() {
		user_message.sendKeys("never give up");
	}
	  
	public void showmessage() {
		showmessage.click();
	}
	
	public void EnterA() {
		EnterA.sendKeys("33");
	}
	
	public void EnterB() {
		EnterB.sendKeys("44");
	}
	
	public void GetTotal() {
		Total.click();
	}
	
	
	
	

}
