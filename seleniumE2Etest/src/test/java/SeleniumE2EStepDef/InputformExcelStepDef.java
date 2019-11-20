package SeleniumE2EStepDef;

import cucumber.api.java.en.Then;
import seleniumE2EtestPages.BasePageSelenium;
import seleniumE2EtestPages.InputFormExcelPage;
import utilities.ExcelRealReadWrite2;

public class InputformExcelStepDef extends BasePageSelenium {
	
	InputFormExcelPage inputFormExcelPage = new InputFormExcelPage();
	ExcelRealReadWrite2 excelRealReadWrite2 = new ExcelRealReadWrite2();
	
	
	
	
	@Then("^user enters value in A input box$")
	public void user_enters_value_in_A_input_box() throws Throwable {
		//inputFormExcelPage.EnterA();
		String file = prop.load0("src/test/resources/testData/abdulbook.xlsx");
		excelRealReadWrite2.readExcel("abdulbook.xlsx", "abdulsheet1", 11, 12);
		Thread.sleep(2000);
	   
	}

	@Then("^user enters value in B input box$")
	public void user_enters_value_in_B_input_box() throws Throwable {
		inputFormExcelPage.EnterB();
		Thread.sleep(2000);
	}

	@Then("^user clicks on get total tab$")
	public void user_clicks_on_get_total_tab() throws Throwable {
		inputFormExcelPage.GetTotal();
		Thread.sleep(2000);
	}

}
