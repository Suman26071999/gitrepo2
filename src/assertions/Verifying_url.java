package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verifying_url {
	
	@Test
	public void login() {
		String expectedtitlevalue="https://demowebshop.tricentis.com/login";
		SoftAssert softassert=new SoftAssert();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("varsh@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Varsh@123");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
		Assert.assertEquals(driver.getCurrentUrl(), expectedtitlevalue,"Home page launch successfully");
		softassert.assertAll();
	 
	}

}
