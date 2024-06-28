package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithHelperAttribute {
	WebDriver driver;
	
	@Test(priority = 1,invocationCount =1,threadPoolSize = 1)
	public void Login() throws InterruptedException{
		System.setProperty("webdriver,msedge.driver", "./drivers/msedgedriver.exe");  
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://www.boat-lifestyle.com/");
	    Thread.sleep(2000);
	    String Currenturl = driver.getCurrentUrl();
	    Reporter.log(Currenturl);
	    
	}
	
	@Test(priority = 2,invocationCount =1)
	public void SelectProd() throws InterruptedException {
		//WebDriver driver=new EdgeDriver();
		Thread.sleep(3000);
		driver.switchTo().frame("ctIframe");
		driver.findElement(By.xpath("//button[text()='Sign me up!']")).click();
		//WebElement searchbutton=driver.findElement(By.xpath("(//label[contains(@class,'predictive-search')]//input)[1]"));
		//WebElement searchbutton = driver.findElement(By.xpath("//input[contains(@class,'search__input predictive')][1]"));
		//WebElement searchbutton=driver.findElement(By.xpath("//div[@class=\'header__wrapper\']//label//input))"));
		WebElement searchbutton=driver.findElement(By.xpath("//div[@class=\"header__wrapper\"]//label//input))"));
		searchbutton.click();
		searchbutton.sendKeys("SmartWatch");
		driver.quit();
	}
	
}
