package SeleniumE2EStepDef;

import cucumber.api.java.en.Given;
import seleniumE2EtestPages.BasePageSelenium;
import utilities.DataBaseRead;

public class ReadDatabaseStepDep extends BasePageSelenium{
	
	
	DataBaseRead DB = new DataBaseRead();
	
	
	@Given("^as a beckend tester i want to run quires from database$")
	public void as_a_beckend_tester_i_want_to_run_quires_from_database() throws Throwable {
		
		String quire1 = prop.getProperty("quiryA");
		String quiry2 = prop.getProperty("quiryB");
		
				DB.readfromdatabase(quire1);
				System.out.println("############ wah gi wah abdul bahi");
				DB.readfromdatabase(quiry2);
		
	
		
	}
	
	
	
	
	
	
	

}
