package SeleniumE2EStepDef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumE2EtestPages.BasePageSelenium;
import seleniumE2EtestPages.CeckBoxDemoPage;
import seleniumE2EtestPages.InputFormHomePage;

public class CheckBoxDemoStepDef extends BasePageSelenium{
	
	
	CeckBoxDemoPage checkbox;
	InputFormHomePage inputform;
	
	@When("^user click on input Form link$")
	public void user_click_on_input_Form_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		checkbox = new CeckBoxDemoPage();
		checkbox.click_on_Inputform();
		Thread.sleep(2000);
	}

	@When("^user click on checkbox demo link$")
	public void user_click_on_checkbox_demo_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		checkbox.clickon_checkbox();
		Thread.sleep(2000);
	}

	@Then("^user click on checkbox demo$")
	public void user_click_on_checkbox_demo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		checkbox.clickon_isselected();
		Thread.sleep(3000);
	}

	@Then("^user completes all checkbox demo$")
	public void user_complete_all_checkbox_demo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		checkbox.click_option_1();
		Thread.sleep(3000);
		checkbox.click_option_2();
		Thread.sleep(3000);
		checkbox.click_option_3();
		Thread.sleep(2000);
	}

	@Then("^user clicks on check all tab$")
	public void user_clicks_on_check_all_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		checkbox.click_check_1();
		Thread.sleep(2000);
	}
	
	
	    
	

}
