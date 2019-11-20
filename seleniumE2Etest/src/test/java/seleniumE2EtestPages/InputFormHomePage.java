package seleniumE2EtestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputFormHomePage extends BasePageSelenium {
	
	public  InputFormHomePage(){
		
		PageFactory.initElements(driver, this);
		
	}

		@FindBy(linkText="Input Forms")
		public WebElement inputForm;
		
		
		@FindBy(linkText="Simple Form Demo")
		public WebElement simpleFormDmo;
		
		@FindBy(id="user-message")
		public WebElement usr_message;	
			  
		
		@FindBy(xpath="//*[@id=\'get-input\']/button")
		public WebElement showmssg;	
		
		

		@FindBy(linkText="Checkbox Demo")
		public WebElement CheckboxDemo;
		
		
		@FindBy(id="isAgeSelected")
		public WebElement is_AgeSelected;
		
		
		
		@FindBy(id="isChkd")
		public WebElement is_Chkd;
		
			
		
		
		public void clickinputForm() {
			inputForm.click();
		}
		
		
		
		public void clickonsimpleFormDmo() {
		simpleFormDmo.click();
		}
		
		
		public void entrusermessage() {
			usr_message.sendKeys("abdul");
			
		}
		
		public void click_showmessage() {
			showmssg.click();
		}
			
		
		public void click_is_AgeSelected() {
			is_AgeSelected.click();
			
		}
		
		
		public void clickonis_Chkd() {
			
			is_Chkd.click();
		}
		
		
		public void clickon_CheckboxDemo() {
			
			CheckboxDemo.click();
		}
		
	}

	
	
	
	
	
	


