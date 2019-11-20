package SeleniumE2EStepDef;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import seleniumE2EtestPages.BasePageSelenium;
import seleniumE2EtestPages.DatePickerPage;

public class datepickerStepDef extends BasePageSelenium {
	
	
	
	@After
	public void closedriver() {
	driver.close();
	
	}
	
	DatePickerPage datepick;
	
	
	
	
	@Then("^user clicks on date picker tab$")
	public void user_clicks_on_date_picker_tab() throws Throwable {
		datepick = new DatePickerPage();
		datepick.clickon_DatePickr();
		Thread.sleep(4000);
		
	   
	}

	@Then("^user click on bootstrap date picker$")
	public void user_click_on_bootstrap_date_picker() throws Throwable {
		datepick.clickon_BootPickr();
	    Thread.sleep(2000);
	}

	@Then("^user clicks on selects date from calender$")
	public void user_clicks_on_selects_date_from_calender() throws Throwable {
		datepick.clickon_clander();
		Thread.sleep(2000);
	   
	}

	@Then("^user choose a date$")
	public void user_choose_a_date() throws Throwable {
		datepick.clickon_todaysdate();
		Thread.sleep(2000);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
