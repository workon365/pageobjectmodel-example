package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LoginTestCase {

	@Test
	public void login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		Thread.sleep(3000);
		
		//the below line is to give "driver" to the below mentioned class which will go and find all elements
// if we dont use below command then it will throw "null pointer exception"
		//this will work only if there is "static"
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		// @Find will find the element and it will come here and just perform operation
		LoginPageObjects.userName.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.loginButton.click();
		
		/*LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
		LoginPageObjects.password(driver).sendKeys("demouser");
		LoginPageObjects.loginButton(driver).click();*/
		//the below step is to use "username" here and for us to access which is there in another class
		// we have create object of that class 
		//LoginPageObjects loginpageObjects = new LoginPageObjects();
		//loginpageObjects.userName(driver).sendKeys("user@phptravels.com");
		// the above step where "username" is there that  is the one that points to username in "LoginPageObjects.java"
	//so in order to find that "username" it needs "driver" so we are passing "driver" as parameter in the above step.
//now there will be a red line in "username".just hover it and select "Change method 'username' AddParamter 'WebDriver'
	// this means add a parameter where it recvs which is in "LoginPageObjects.java"
		// loginpageObjects.username(driver).sendKeys("user@phptravels.com"); will come only after changing the return type
// from void to "WebElement" in "LoginPageObjects.java" only then .sendkeys will come ,likeiwse for other webelements as well
//LoginPageObjects loginpageObjects = new LoginPageObjects(); since we have created an object for "LoginPageObjects"
//so what happens is indha "LoginTestCase" vandhu "LoginPageObjects" apdingara oru class ku in "LoginTestCase" oru dependency
//create aagudhu
// this is called dependency injection . a concept in java(oru class oda object ah innoru class la poi create panradhu
//dependency create panradhu is not good practice
//so we are changing all methods in "LoginPageObjects" to static
		// now we dont need to create an object here we can remove it ,here iam comment out 
		//"LoginPageObjects loginpageObjects = new LoginPageObjects();"
		
		
		
		/*//driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
		//driver.findElement(By.name("password")).sendKeys("demouser");
		//driver.findElement(By.xpath("//button[@type ='submit']")).click();
		//we can also write it as below by assigning a variable using WebElement
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("user@phptravels.com");
		WebElement pw = driver.findElement(By.name("password"));
		pw.sendKeys("demouser");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type ='submit']"));
		loginButton.click();*/
		
		
		
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		LoginTestCase logins = new LoginTestCase();
		logins.login();
		
		
		
		
		
		
	}

}
