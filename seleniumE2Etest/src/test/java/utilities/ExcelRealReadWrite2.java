package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRealReadWrite2 {
	
	
	/*
	 * public static XSSFSheet worksheet; public static XSSFWorkbook wb; public
	 * static XSSFCell cell; public static XSSFRow row; public static String path;
	 */
	
	
	public  void readExcel(String workbook, String sheetname, int rownum, int columnum) throws IOException {
		
		 InputStream file = new FileInputStream("src/test/resources/testData/"+workbook);
	     XSSFWorkbook  wb = new XSSFWorkbook(file);   
	  XSSFCell vlaue = wb.getSheet(sheetname).getRow(rownum).getCell(columnum);
	     // XSSFCell value = wb.getSheetAt(Sheetnumber).getRow(rownum).getCell(cellnum);
	     //String celldata=cell.toString();
	       // String celldata=cell.getStringCellValue();
	     //  System.out.println("File You reading: "+wb+" and cell value is: "+celldata);
		
	      // return celldata;
		
	     System.out.println(vlaue);
	     
	     }
	   
	
		
			
		
		
		
	
		
}	
		
	

	
	
	
	
	


