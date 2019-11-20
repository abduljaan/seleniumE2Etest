package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import seleniumE2EtestPages.BasePageSelenium;

public class DataBaseRead extends BasePageSelenium {
	
	private static final String url = prop.getProperty("dburl");
	private static final String user = prop.getProperty("username");
	private static final String password = prop.getProperty("password");
	
	
	
	private static Connection con; 
	private static Statement stmt; 
	private static ResultSet rs;
	private static ResultSet rs1;
	
	
	

	
	
	public void readfromdatabase(String sql) {
		String query = sql;
				
		try {
			 con = DriverManager.getConnection(url,user,password);	  	       
           stmt = con.createStatement();
          rs = stmt.executeQuery(query);
       
           while (rs.next()) 
           	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(5));
          
           {
              // int count = rs.getInt(1);
             //  System.out.println("Total number of books in the table : " + count);
           }

		} catch (SQLException sqlEx) {
           sqlEx.printStackTrace();
       } finally {
           //close connection ,stmt and resultset here
          try { con.close(); } catch(SQLException se) { /*can't do anything */ }
           try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
           try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
           

		
		
		
       }	
		
	}

}
