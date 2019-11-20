package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcelAB {
	
	public void readfromExcel(String workbook,int Sheetnumber, int rownum , int cellnum) throws IOException {
		
		
		//InputStream ExcelFileToRead = new FileInputStream("src/test/resources/testData/"+workbook );
		FileInputStream ExcelFileToRead = new FileInputStream("src/test/resources/testData/"+workbook );
        XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
       // XSSFWorkbook test = new XSSFWorkbook(); 
       // XSSFSheet sheet = wb.getSheetAt(0);
       // XSSFRow row; 
      //  XSSFCell cell;
    XSSFCell value = wb.getSheetAt(Sheetnumber).getRow(rownum).getCell(cellnum);
    System.out.println("your excel book name:::"+workbook+"cell value is:::::"+ value);
        
        
        
        
        
       
        }
      

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	public void writefromExcel() {
		
		
		
		
	}
	
	
	
	
	
	
	

}
