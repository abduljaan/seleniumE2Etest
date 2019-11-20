package seleniumE2EtestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CeckBoxDemoPage extends BasePageSelenium {
	
	public  CeckBoxDemoPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	  
	@FindBy (linkText="Input Forms")
	public WebElement Inputform;
		
		@FindBy (linkText="Checkbox Demo")
		public WebElement checkbox;
		
		@FindBy (id="isAgeSelected")
		public WebElement Assignselected;
		
		@FindBy (linkText="Option 1")
		public WebElement option_1;
		
		@FindBy (linkText="Option 2")
		public WebElement option_2;
		
		@FindBy (linkText="Option 3")
		public WebElement option_3;
		
		@FindBy (id="check1")
		public WebElement check_1;
		
		
		public void click_on_Inputform() {
			
			Inputform.click();
		}
		
		
		
		
		
		public void clickon_checkbox() {
			checkbox.click();
			
		}
		
		public void clickon_isselected() {
			Assignselected.click();
			
		}
		
		public void click_option_1() {
			option_1.click();
			
		}
			public void click_option_2() {
				option_2.click();	
				
			}
				public void click_option_3() {
					option_3.click();		
				
					
			
		}
		
		public void click_check_1() {
			
			check_1.click();
		}
			
	}
	
	
	


