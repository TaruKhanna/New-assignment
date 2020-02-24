package Automation_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_repository {

	WebDriver driver;
	public Login_repository(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By Signin_link= By.linkText("Sign in");
	By Email= By.cssSelector("input#email");
	By Password= By.cssSelector("input#passwd");
	By SubmitLogin =By.id("SubmitLogin");
	
	
	
	
	
	
	
	//click on signin link
	public void clickSignin_link() {
		driver.findElement(Signin_link).click();
		
	}
	
	//enter email
	public void setEmail(String email1) {
		driver.findElement(Email).sendKeys(email1);
		
	}
	
	//Enter password
	public void setPassword(String password) {
		driver.findElement(Password).sendKeys(password);
		
	}
	
	public void clickSubmitLogin() {
		driver.findElement(SubmitLogin).click();
		
	}
	
	
	public void Login(String email1,String password) {
		
		clickSignin_link();
		setEmail(email1);
		setPassword(password);
		clickSubmitLogin();
		
	}

}
