package Automation_pack;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_OrderFlowPage {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://automationpractice.com/index.php");
        Signup_repository Signup=new Signup_repository(driver);
        Login_repository login=new Login_repository(driver);
        Productpage_repository product=new Productpage_repository(driver);
        Profile_page_repository profile=new Profile_page_repository(driver);
        Excel_handler handler=new Excel_handler(driver);
        
        handler.Reading_data("C:\\Users\\Admin\\Desktop\\Data.xls", "Sheet1");
        
       Signup.signup("tarukhanna@yahoo.com","abc", "Khanna","23456","27","10","1984","abc","khanna","abc","panvel","raigadh","Indiana","41020", "United States","1234567891","panvel");
        login.Login("tarukhanna@yahoo.com", "23456");
        product.Order_product();
        profile.Profile_history_price();
        
        
        
	}

}
