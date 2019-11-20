package SeleniumE2EStepDef;

import cucumber.api.java.en.Given;
import utilities.ReadWriteTextfile;

public class ReadFrmTextfileStepDef {
 
	
	ReadWriteTextfile readWritText = new ReadWriteTextfile();
	
	
	
	
	@Given("^user read Text File$")
	public void user_read_Text_File() throws Throwable {
		readWritText.readwriteTextfiel("testfile.text");
	    
	}

		

	@Given("^a valid  user write in text file$")
	public void a_valid_user_write_in_text_file() throws Throwable {
		readWritText.writeintextfile("textfile.text", "tentsion ha yr");
}
}
