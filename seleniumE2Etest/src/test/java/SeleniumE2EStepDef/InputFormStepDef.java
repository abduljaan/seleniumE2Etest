package SeleniumE2EStepDef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumE2EtestPages.BasePageSelenium;
import seleniumE2EtestPages.InputFormHomePage;

public class InputFormStepDef extends BasePageSelenium {
	
		
		
	@Before
	
	public void opnbrowser() {
		BasePageSelenium.inBrowser();
		
		
		
	}
  	
	
	
	
	//public void embedScreenshot(Scenario scenario) {
	   //    if(scenario.isFailed()) {
	   //   try {
	        //    scenario.write("Current Page URL is " + driver.getCurrentUrl());
	//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
	         //  byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	          // scenario.embed(screenshot, "image/png");
	      // } catch (WebDriverException somePlatformsDontSupportScreenshots) {
	         //  System.err.println(somePlatformsDontSupportScreenshots.getMessage());
	    //   }
	    //   }
	    //   driver.quit();
	 //  }
	
	
	
	BasePageSelenium basepage;
	InputFormHomePage inptform;



	@Given("^user navigates to selenium easy site$")
	public void user_navigates_to_selenium_easy_site() throws Throwable {
	 String url =  prop.getProperty("appurl");
	 driver.get(url);
	 Thread.sleep(5000);
	}

	@When("^user click on input demo link$")
	public void user_click_on_input_demo_link() throws Throwable {
		//inptform = new inptform();
		inptform = new InputFormHomePage();
		inptform.clickinputForm();
		 Thread.sleep(3000);
					
		}
		
	@When("^user click on simple form demo$")
	public void user_click_on_simple_form_demo() throws Throwable {
		inptform.clickonsimpleFormDmo();
		 Thread.sleep(3000);
	}

	@Then("^user enters message in message box$")
	public void user_enters_message_in_message_box() throws Throwable {
		inptform.entrusermessage();
		 Thread.sleep(3000);
	}

	@Then("^user click on show message$")
	public void user_click_on_show_message() throws Throwable {
		inptform.click_showmessage();
		 Thread.sleep(3000);
	}

	@Then("^user click on checkbox demo option$")
	public void user_click_on_checkbox_demo_option() throws Throwable {
		inptform.clickon_CheckboxDemo();
		Thread.sleep(3000);
	   
	}

	@Then("^user click on this checkbox option$")
	public void user_click_on_this_checkbox_option() throws Throwable {
	    		inptform.click_is_AgeSelected();
	    		Thread.sleep(3000);
	}

	@Then("^user click on check all option$")
	public void user_click_on_check_all_option() throws Throwable {
		inptform.clickonis_Chkd();
		Thread.sleep(3000);
	}

	
	
	
	
	
	
	

}
