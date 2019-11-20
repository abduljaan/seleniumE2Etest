package SeleniumE2EStepDef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import seleniumE2EtestPages.BasePageSelenium;
import seleniumE2EtestPages.SeleniumEasyTablePage;

public class SeneniumTableStepDep extends BasePageSelenium {
	
	/*
	 * @After public void closeBrowser() { driver.close(); }
	 */
		
	
	
	
	SeleniumEasyTablePage table;
	
	
	
	
	
	@Then("^user click on table tab$")
	public void user_click_on_table_tab() throws Throwable {
		table = new SeleniumEasyTablePage();
		table.clickon_table();
		
			   
	}

	@Then("^user click on Table Data Search$")
	public void user_click_on_Table_Data_Search() throws Throwable {
		table.clickon_data_Search();
	   
	}

	@Then("^user filters test data by entering value$")
	public void user_filters_test_data_by_entering_value() throws Throwable {
		table.clickon_tasktable();
		Thread.sleep(2000);
	}

	@Then("^user clicks on filter tab$")
	public void user_clicks_on_filter_tab() throws Throwable {
		table.clickonfilterfield();
		Thread.sleep(2000);
	}

	@Then("^user enters some value in value inbox$")
	public void user_enters_some_value_in_value_inbox() throws Throwable {
		
		table.clickon_filter2();
		Thread.sleep(2000);
	}


	

	
	
	
	
	
	
	
	

}
