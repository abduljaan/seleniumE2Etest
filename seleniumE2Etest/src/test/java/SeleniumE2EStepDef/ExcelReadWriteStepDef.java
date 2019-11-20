package SeleniumE2EStepDef;

import cucumber.api.java.en.Given;
import utilities.ExcelRealReadWrite2;
import utilities.ReadWriteExcelAB;

public class ExcelReadWriteStepDef {
	
	ReadWriteExcelAB readexcel = new ReadWriteExcelAB();
	ExcelRealReadWrite2 readexcel2 =  new ExcelRealReadWrite2();
	
	@Given("^as a user i want tor read from excel$")
	public void as_a_user_i_want_tor_read_from_excel() throws Throwable {
		//readexcel.readfromExcel("abdulbook.xlsx", 0, 1, 0);
		readexcel2.readExcel("abdulbook.xlsx", "abdulsheet1", 5, 0);
		
	}

	
	
	
	

}
