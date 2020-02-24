package Automation_pack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Profile_page_repository  {
	WebDriver driver;
	public Profile_page_repository(WebDriver driver)
	{
		this.driver=driver;
	}
	
	Productpage_repository pro=new Productpage_repository(driver);
	static String history_price;
	
	By Profile_link= By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"); 
	By Order_history= By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a");
	By History_price= By.xpath("//*[@id=\"order-list\"]/tbody/tr/td[3]");
	
	
	//click on Profile link
		public  void clickProfile_link() throws Exception {

			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,-900)");
			Thread.sleep(2000);
			driver.findElement(Profile_link).click();
			
		}
		
		
	//click on Order_history
		public  void clickOrder_history() {
			driver.findElement(Order_history).click();
					
		}
			
				
	 
		
	     public  void Profile_history_price() throws Exception {
	    	 clickProfile_link();
	    	 clickOrder_history();
	    	
		}
	     
	     
	 	
		
}
