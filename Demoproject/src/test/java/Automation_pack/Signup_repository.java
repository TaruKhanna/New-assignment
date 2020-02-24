package Automation_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup_repository {
	
	WebDriver driver;
	public Signup_repository(WebDriver driver)
	{
		this.driver=driver;
	}

	By Signin_link= By.linkText("Sign in");
	By Email_create =By.id("email_create");
	By SubmitCreate =By.id("SubmitCreate");
	By Title_radio= By.id("id_gender2");
	By First_name= By.cssSelector("input#customer_firstname");
	By Last_name= By.cssSelector("input#customer_lastname");
	By Email= By.cssSelector("input#email");
	By Password= By.cssSelector("input#passwd");
	By Days_dropdown= By.id("days");
	By Months_dropdown= By.id("months");
	By Years_dropdown= By.id("years");
	By Firstname_address= By.id("firstname");
	By Lastname_address= By.id("lastname");
	By Company= By.id("company");
	By Address1= By.id("address1");
	By City =By.id("city");
	By State =By.id("id_state");
	By Postcode =By.id("postcode");
	By Country =By.id("id_country");
	By Phone_mobile =By.id("phone_mobile");
	By Alias_address =By.id("alias");
	By SubmitAccount =By.id("submitAccount");  
	By Signout= By.linkText("Sign out");
	
	public void clickSignin_link() {
		driver.findElement(Signin_link).click();
		
	}
	
	public void setEmail_create(String email) {
		driver.findElement(Email_create).sendKeys(email);
		
	}

	public void clickSubmitCreate() {
		driver.findElement(SubmitCreate).click();
		
	}

	public void clickTitle_radio() {
		driver.findElement(Title_radio).click();
		
	}

	public void setFirst_name(String firstname) {
		driver.findElement(First_name).sendKeys(firstname);
		
	}

	public void setLast_name(String lasttname) {
		driver.findElement(Last_name).sendKeys(lasttname);
		
	}

	public void setEmail(String email1) {
		driver.findElement(Email).sendKeys(email1);
		
	}

	public void setPassword(String password) {
		driver.findElement(Password).sendKeys(password);
		
	}

	public void setSignin_link() {
		driver.findElement(Signin_link).click();
		
	}

	public void selectDays_dropdown(String days) {
		
		Select s=new Select(driver.findElement(Days_dropdown));
		s.selectByValue(days);
		
	}

public void selectMonths_dropdown(String months) {
		
		Select s=new Select(driver.findElement(Months_dropdown));
		s.selectByValue(months);
		
	}


public void selectYears_dropdown(String year) {
	
	Select s=new Select(driver.findElement(Years_dropdown));
	s.selectByValue(year);
	
}

public void setFirstname_address(String firstname1) {
	driver.findElement(Firstname_address).sendKeys(firstname1);
	
}

public void setCompany(String company) {
	driver.findElement(Company).sendKeys(company);
	
}

public void setLastname_address(String Lastname1) {
	driver.findElement(Lastname_address).sendKeys(Lastname1);
	
}

public void setAddress1(String address1) {
	driver.findElement(Address1).sendKeys(address1);
	
}

public void setCity(String city) {
	driver.findElement(City).sendKeys(city);
	
}
public void setPostcode(String postcode) {
	driver.findElement(Postcode).sendKeys(postcode);
	
}
public void selectCountry(String country) {
	
	Select s=new Select(driver.findElement(Country));
	s.selectByVisibleText(country);
	
}


public void selectState(String state) {
	
	Select s=new Select(driver.findElement(State));
	s.selectByVisibleText(state);
	
}

public void setPhone_mobile(String phone_mobile) {
	driver.findElement(Phone_mobile).sendKeys(phone_mobile);
	
}

public void setAlias_address(String alias_address) {
	driver.findElement(Alias_address).sendKeys(alias_address);
	
}

public void clickSubmitAccount() {
	driver.findElement(SubmitAccount).click();
	
}

public void clickSignout() {
	driver.findElement(Signout).click();
	
}
public void signup(String email,String firstname,String lasttname,String password,String days,String months,String year,String firstname1,String Lastname1,String company,String address1,String city,String state,String postcode,String country,String phone_mobile,String alias_address) throws Exception {
	Thread.sleep(2000);
	clickSignin_link();
	Thread.sleep(2000);
	setEmail_create(email);
	Thread.sleep(2000);
	clickSubmitCreate();
	Thread.sleep(2000);
	clickTitle_radio();
	Thread.sleep(2000);
	setFirst_name(firstname);
	Thread.sleep(2000);
	setLast_name(lasttname);
	Thread.sleep(2000);
	//setEmail(email1);
	Thread.sleep(2000);
	setPassword(password);
	Thread.sleep(2000);
	selectDays_dropdown(days);
	Thread.sleep(2000);
	selectMonths_dropdown(months);
	Thread.sleep(2000);
	selectYears_dropdown(year);
	Thread.sleep(2000);
	//setFirstname_address(firstname1);
	Thread.sleep(2000);
	//setLastname_address(Lastname1);
	Thread.sleep(2000);
	setCompany(company);
	Thread.sleep(2000);
	setAddress1(address1);
	Thread.sleep(2000);
	setCity(city);
	selectState(state);
	Thread.sleep(2000);
	setPostcode(postcode);
	Thread.sleep(2000);
	selectCountry(country);
	Thread.sleep(2000);
	setPhone_mobile(phone_mobile);
	Thread.sleep(2000);
    setAlias_address(alias_address);
    Thread.sleep(2000);
    clickSubmitAccount();
    Thread.sleep(4000);
    clickSignout();
}
	
}
