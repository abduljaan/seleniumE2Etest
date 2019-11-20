import java.io.File;
import java.io.IOException;

public class ReadWriteText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	File file = new File("C:\\Users\\abdul.quddus\\Documents\\Eclipse-workspace\\ReadfromTextFile1");
	
	try {
		file.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		

	}

}
