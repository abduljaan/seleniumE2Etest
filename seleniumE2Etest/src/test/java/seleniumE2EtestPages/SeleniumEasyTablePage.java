package seleniumE2EtestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumEasyTablePage extends BasePageSelenium{
	
	public SeleniumEasyTablePage() {
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy (linkText="Table")
	public WebElement table;
	
	@FindBy (linkText="Table Data Search")
	public WebElement data_Search;
	
	@FindBy (id="task-table-filter")
	public WebElement tasktable;
	
	
	@FindBy (xpath="/html/body/div[2]/div/div[2]/div[2]/div/div/div/button/span")
	 public WebElement filterfield;
	
	
	@FindBy (xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[1]/input")
	 public WebElement filter2;
	
		

	
	public void clickon_table() {
		
		table.click();
	}
	
	
	public void clickon_data_Search() {
		
		data_Search.click();
	}
	
	public void clickon_tasktable() {
		tasktable.sendKeys("task");
		
	}
	
	public void clickonfilterfield() {
		filterfield.click();
		
	}
	
	public void clickon_filter2() {
		filter2.sendKeys("task");
	}
	
}
