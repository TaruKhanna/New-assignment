package Automation_pack;






import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.FindFailed;


public class Productpage_repository {

	WebDriver driver;
	public Productpage_repository(WebDriver driver)
	{
		this.driver=driver;
	}
	
	static String cart_total1;
	String cart_total2;
	String cart_total3;
	
	By Women_link= By.linkText("Women");
	By Quick_view= By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[2]");
	By image=By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[1]/img");
	By Add_quantity= By.xpath("/html/body/div/div/div[3]/form/div/div[2]/p[1]/a[2]/span/i");
	By Add_to_cart= By.xpath("/html/body/div/div/div[3]/form/div/div[3]/div[1]/p/button");
	By Total_amount1= By.xpath("//*[@id=\"layer_cart_product_price\"]");
	By Proceed_to_checkout1= By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span");
	By Proceed_to_checkout_address= By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span");
	By Proceed_to_checkout_shipping= By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span");
	
	By Cart_icon= By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/span[3]");
	
	By checkout_button= By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/div/div/div/p[2]/a/span"); 
	By checkout_checkbox= By.xpath("//*[@id=\"cgv\"]"); 
	By Pay_by_check= By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a");
	By Confirm_order= By.xpath("//*[@id=\"cart_navigation\"]/button");
	By Cart_total_price=By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/div/div/div/div/div[2]/span[1]");
	By order_price= By.xpath("//*[@id=\"center_column\"]/div/span");  

	
	
	//click on Women_link
		public  void clickWomen_link() throws Exception {
			
			
			Thread.sleep(2000);
			driver.findElement(Women_link).click();
			
		}
		
    //click on Quick_view
		public void clickQuick_view() {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,800)");
			Actions a=new Actions(driver);
			a.moveToElement(driver.findElement(image));
			a.build().perform();
			a.moveToElement(driver.findElement(Quick_view));
			a.click().build().perform();
			

			
		}		
		
		//click on Add_quantity
		public  void clickAdd_quantity() throws Exception {
			Thread.sleep(3000);
			driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		WebElement w=driver.findElement(By.cssSelector(".product_attributes"));	
		Thread.sleep(3000);
			w.findElement(Add_quantity).click();
			
		}	
		//click on Add_to_cart
		public  void clickAdd_to_cart() {
			Actions a=new Actions(driver);
			a.moveToElement(driver.findElement(Add_to_cart));
			
			a.click().build().perform();
			
			driver.switchTo().defaultContent();
			
		}
		
		//click on Proceed_to_checkout
		public void clickProceed_to_checkout() throws Exception {

			Robot r=new Robot();
			r.mouseMove(400, 900);
            r.mousePress(InputEvent.BUTTON2_DOWN_MASK);
           r.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
            driver.navigate().refresh();
            
            Thread.sleep(4000);
		}
		
		public void clickProceed_to_checkout1() throws Exception {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,900)");
			
			WebElement w=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]"));
			 Thread.sleep(4000);
			 Actions action = new Actions(driver);
			 action.moveToElement(w.findElement(Proceed_to_checkout1)).click().perform();
            
		}
		
		
public void clickProceed_to_checkout_address() throws Exception {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,900)");
			
						 Thread.sleep(4000);
			 Actions action = new Actions(driver);
			 action.moveToElement(driver.findElement(Proceed_to_checkout_address)).click().perform();
            
		}

             
		
public void clickPay_by_check() throws Exception {
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,800)");
	
				 Thread.sleep(4000);
				 driver.findElement(Pay_by_check).click();
	
    
}




		//click on Agree_checkbox
		public void clickCart_icon() {
			Actions a=new Actions(driver);
			a.moveToElement(driver.findElement(Cart_icon));
			//driver.findElement(Add_to_cart).click();
			a.build().perform();
			
			
		}
		
		//click on checkout_button
				public void clickcheckout_button() throws Exception {
					driver.findElement(checkout_button).click();
					System.out.println("done");
					Thread.sleep(4000);
					       
				}
				
		
		//click on checkout_button
		public void clickcheckout_checkbox() throws Exception {
			driver.findElement(checkout_checkbox).click();
			System.out.println("done");
			Thread.sleep(4000);
			       
		}
		
		//click on Confirm_order
		public void clickConfirm_order() {
			driver.findElement(Confirm_order).click();
					
				}
				
		//get order_price
		public String getorder_price() {
		 return driver.findElement(order_price).getText();
					
				}	
		public void Proceed_to_checkout_shipping() throws Exception {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,900)");
			
						 Thread.sleep(4000);
			 Actions action = new Actions(driver);
			 action.moveToElement(driver.findElement(Proceed_to_checkout_shipping)).click().perform();
		    
		}
		
		
		public  void Order_product() throws Exception 
		{
			
			clickWomen_link();
			clickQuick_view();
			Thread.sleep(2000);
			clickAdd_quantity();
			Thread.sleep(2000);
			clickAdd_to_cart();
			Thread.sleep(2000);
			//cart_total1=getTotal_amount1();
		
			
			//Thread.sleep(2000);
			clickProceed_to_checkout();
			Thread.sleep(2000);
		clickCart_icon();
			Thread.sleep(2000);
			
			Thread.sleep(2000);
		 clickcheckout_button();
		 Thread.sleep(2000);
		 clickProceed_to_checkout1();
		 Thread.sleep(2000);
		 clickProceed_to_checkout_address();
		 Thread.sleep(2000);
		 clickcheckout_checkbox();
		 Thread.sleep(2000);
		 Proceed_to_checkout_shipping();
		 Thread.sleep(2000);
		 clickPay_by_check();
		 Thread.sleep(2000);
		 clickConfirm_order();
		 Thread.sleep(2000);
		 
//			clickPay_by_check();
//			clickConfirm_order();
//			}else
//			{
//				System.out.println("price total is not matching");
//			}
//			cart_total3=getorder_price();
//			if(cart_total3.equalsIgnoreCase(cart_total2))
//			{
//				System.out.println("Order price is ok");
//				
//			}else
//			{
//				System.out.println("Order price is not matching to cart value");
//			}
//			return cart_total3;
		}
}
