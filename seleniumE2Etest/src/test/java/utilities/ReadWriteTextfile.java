package utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextfile {
	
	public void readwriteTextfiel(String filename) throws IOException {
		
		
		File file = new File("src/test/resources/testData/"+filename);
		FileReader fileReadr = new FileReader(file);
		BufferedReader buffReadr = new  BufferedReader(fileReadr);
		String line=buffReadr.readLine();
			//System.out.println(buffReadr.readLine());

           while(line != null) {
			
			System.out.println(line);
			
			line = buffReadr.readLine();
		
	}
	
       
	}     
           
	
	public void writeintextfile(String filename, String newline) throws IOException {
		
		
		File file = new File("src/test/resources/testData/"+filename);
		
		file.createNewFile();
			 //write on text file
		FileWriter filewrtr = new FileWriter(file);
		BufferedWriter bwriter = new BufferedWriter(filewrtr);
		bwriter.write("newlinen");
		bwriter.newLine();
		bwriter.write("newline");
		bwriter.flush();
		
		
		
	}
	
	
	
	
	
	 
      }


