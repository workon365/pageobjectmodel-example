package pageFactoryWithoutAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutFindBy {

	//without using @findBy and findElements
	// here we are using value as a variable so pagefactory will go and search directly the value
	// it will become useful only if we have "id" and "name"
	// selenium will always look for id and then only name (eg: if both had same values then it would search for id first
	// and then say that its not able to find id and then it will find name.compiler will take long time .
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;
	
	//@Test // not sure why tutor did this
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		// whenever we user page factory then webelement has to be static
		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin123");
		btnLogin.click();
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginWithoutFindBy notusingfindby = new LoginWithoutFindBy();
		notusingfindby.Login();
	
	}

}
