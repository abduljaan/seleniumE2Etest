package seleniumE2EtestPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePageSelenium {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BasePageSelenium() {
		
		prop = new Properties();
		
		
		try {
			FileInputStream	file = new FileInputStream("config.properties");
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		}
	
	
	public static WebDriver inBrowser() {
		String browser = prop.getProperty("browser");
		
		if((browser.equalsIgnoreCase("chrome"))|| (browser.equalsIgnoreCase("chrm"))){
			
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			
		driver = new ChromeDriver();
		
		
			
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//driver.close();
		
		return driver;
		
		
	}
		
		
		
		
		
		
		

		
}


		
		
		
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


