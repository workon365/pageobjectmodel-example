package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.UpdateProfilePageObjects;

public class UpdateProfile {

	
	@Test
	public void updateProfile() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.userName.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.loginButton.click();
		
		PageFactory.initElements(driver, UpdateProfilePageObjects.class);
		
		UpdateProfilePageObjects.myProfileClick.click();
		UpdateProfilePageObjects.enterPhoneNumber.sendKeys("1234567890");
		UpdateProfilePageObjects.enterCityDetails.sendKeys("Kings Landing");
		UpdateProfilePageObjects.submit.click();
		
		
		/*LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
		LoginPageObjects.password(driver).sendKeys("demouser");
		LoginPageObjects.loginButton(driver).click();
		
		//the above step is for login 
		UpdateProfilePageObjects.myProfileClick(driver).click();
		UpdateProfilePageObjects.enterPhoneNumber(driver).sendKeys("1234567890");
		UpdateProfilePageObjects.enterCityDetails(driver).sendKeys("Kings Landing");
		UpdateProfilePageObjects.submit(driver).click();*/
		
		
		
		/*//driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
		//driver.findElement(By.name("password")).sendKeys("demouser");
		//driver.findElement(By.xpath("//button[@type ='submit']")).click();
		//we can also write it as below by assigning a variable using WebElement
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("user@phptravels.com");
		WebElement pw = driver.findElement(By.name("password"));
		pw.sendKeys("demouser");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type ='submit']"));
		loginButton.click();
		
		//driver.quit();*/
		// above steps are the same as that of login
		//below is the update profile page
		/*WebElement myProfile = driver.findElement(By.linkText("My Profile")); // xpath did not work for me but worked for tutor
		 *i wote my own xpath
		myProfile.click();
		
		WebElement phoneNumber = driver.findElement(By.name("phone"));
		phoneNumber.sendKeys("1234567890");
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Kings Landing");
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();*/
		
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		UpdateProfile upprofile = new UpdateProfile();
		upprofile.updateProfile();
		
	}

}
