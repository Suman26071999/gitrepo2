package Base_Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Browser_Page {
	
	public WebDriver driver;

	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}
	
	@AfterMethod
	public void LogOut() {
		Home_Page Hp=new Home_Page(driver);
		Hp.getLogOutLink().click();
	}
    
	@AfterClass
	public void TareDownBrowser() {
		driver.quit();
	}
}
