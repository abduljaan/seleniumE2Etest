package seleniumE2EtestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickerPage extends BasePageSelenium {
	
	public DatePickerPage() {
		
		PageFactory.initElements(driver,this);
		
			}
	@FindBy (linkText="Date pickers")
	WebElement DatePickr;
	
	@FindBy (linkText="Bootstrap Date Picker")
	WebElement BootPickr;
	
	
	@FindBy (xpath="//*[@id=\\\"sandbox-container1\\\"]/div/span/i")
	WebElement clander;
	

	@FindBy (xpath="/html/body/div[3]/div[1]/table/tbody/tr[1]/td[5]")
	WebElement todaysdate;
	
	
	
	public void clickon_DatePickr() {
		DatePickr.click();
		
	}
	
	
		public void clickon_BootPickr() {
			BootPickr.click();
			
		}
		public void clickon_clander() {
			clander.click();
			
		}
	
	public void clickon_todaysdate(){
		
		todaysdate.click();
	
	
	
	}
	
	
	
	
	

}
