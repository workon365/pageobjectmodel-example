package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	//using page factory
	//oru web element ku value eppadi populate pannaporaom without using findElement method 
	//using@FindBy annotation in page factory, "how" apdinu oru parameter irukku adhuku "HOW.NAME" adhavadhu
	//"name" vetch namma find panna porom
	
	@FindBy(how=How.NAME,using="username")
	public static WebElement userName;
	//@FindBy(how=How.NAME,using="userName") or @FindBy(name ="userName")- both are same
	@FindBy(name = "password")
	public static WebElement password;
	
	@FindBy(xpath ="//button[@type ='submit']") // we can also other locators
	public static WebElement loginButton;

	// main object of page object model is identify the web element
	
	//in login page we have username,password and login button
	// each field interacted is being written as a seperate method
	//first we will paste eg: driver.findElement(By.xpath("//button[@type ='submit']"));
	//like this for all 3 methods ,after that we will see red line under driver.
	//because we don't know what driver is ? this driver is actually our "Webdriver"
	// where the "WebDriver driver = new ChromeDriver();" is created only that does the job of locating elements
	//so webdriver which is created in "LoginTestCase.java" has to come to "LoginPageObjects" only the 
	//so that driver which is there in LoginTestCase.java" have to be sent to each methods in "LoginPageObjects.java"
	//because every method performs some action with driver
	// so for eg: we are going to use "username" which is present in "LoginPageObjects.java" in "LoginTestCase.java"
	//but actual test case where we are going to run is "LoginTestCase.java" so here in "LoginPageObjects.java" 
//each method has to return only then they will be able to perform some action ,so changing the return type to "WebElement"
	
	
	
	
	/*public static WebElement userName(WebDriver driver) {
		
		return driver.findElement(By.name("username"));
		
	}
	
	
	public static WebElement password(WebDriver driver) {
		
		return driver.findElement(By.name("password"));
		
	}
	
	public static WebElement loginButton(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@type ='submit']"));
		
	}*/
}


