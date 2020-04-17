package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UpdateProfilePageObjects {

	@FindBy(how=How.LINK_TEXT,using="My Profile")
	public static WebElement  myProfileClick;
	@FindBy(name="phone")
	public static WebElement enterPhoneNumber;
	@FindBy(name="city")
	public static WebElement enterCityDetails;
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement submit;
	
	/*public static WebElement  myProfileClick(WebDriver driver) {
		
		return driver.findElement(By.linkText("My Profile"));
		
		
	}
		
	public static WebElement enterPhoneNumber(WebDriver driver) {
		
		return driver.findElement(By.name("phone"));
		
	}
	
	public static WebElement enterCityDetails(WebDriver driver) {
		
		return driver.findElement(By.name("city"));
	}
	
public static WebElement submit(WebDriver driver) {
		
	return driver.findElement(By.xpath("//button[@type='submit']"));
	}*/
}
