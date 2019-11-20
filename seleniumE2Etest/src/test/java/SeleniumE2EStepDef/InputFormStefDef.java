package SeleniumE2EStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import seleniumE2EtestPages.BasePageSelenium;
import seleniumE2EtestPages.InputFormExcelPage;
import utilities.ReadWriteExcelAB;

public class InputFormStefDef extends BasePageSelenium{

	
	InputFormExcelPage inputformpage = new InputFormExcelPage();
	
	
	
	
	
	@Given("^User navigates to selenium Easy site$")
	public void user_navigates_to_selenium_Easy_site() throws Throwable {
	String URL = prop.getProperty("appurl");
	driver.get(URL);
	Thread.sleep(3000);
	    
	}

	@Then("^user click on input form link$")
	public void user_click_on_input_form_link() throws Throwable {
		inputformpage.InputForms();
	    Thread.sleep(2000);
	}

	@Then("^user click on simple form demo link$")
	public void user_click_on_simple_form_demo_link() throws Throwable {
		inputformpage.SimpleformDemo();
		Thread.sleep(2000);
	}

	@Then("^user enters a message in message box$")
	public void user_enters_a_message_in_message_box() throws Throwable {
		inputformpage.user_message();
		Thread.sleep(2000);
	}

	@Then("^user click on showmessage$")
	public void user_click_on_showmessage() throws Throwable {
		inputformpage.showmessage();
		Thread.sleep(2000);
	}

	@Then("^user validates message$")
	public void user_validates_message() throws Throwable {
		
	   
	}

	@Then("^user enters an integer value in enter a text box$")
	public void user_enters_an_integer_value_in_enter_a_text_box() throws Throwable {
		ReadWriteExcelAB excel= new ReadWriteExcelAB();
		inputformpage.EnterA();
		Thread.sleep(2000);
	}

	@Then("^user enters an integer value in b box$")
	public void user_enters_an_integer_value_in_b_box() throws Throwable {
		inputformpage.EnterB();
		Thread.sleep(2000);
	}

	@Then("^user click on get total button$")
	public void user_click_on_get_total_button() throws Throwable {
		inputformpage.GetTotal();
		Thread.sleep(3000);
	}

	@Then("^user validates the total$")
	public void user_validates_the_total() throws Throwable {
	   
	}


	
	
	
	
	
	
	
	
	
}
