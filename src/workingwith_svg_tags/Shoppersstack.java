package workingwith_svg_tags;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoppersstack {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("suman.m@testyantra.in");
		driver.findElement(By.id("Password")).sendKeys("Suman@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		WebElement wishlistbutton = driver.findElement(By.xpath("//span[contains(text(),'Polo')]/../../div[2]//*[name()='svg']"));
		String csspropertybefore= wishlistbutton.getCssValue("fill");
		System.out.println(csspropertybefore);
		wishlistbutton.click();
		Thread.sleep(2000);
		
//		WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofSeconds(15));
//		explicitWait.until(ExpectedConditions.elementToBeClickable (wishlistbutton));
//	
		
		String csspropertyafter= wishlistbutton.getCssValue("fill");
		System.out.println(csspropertyafter);
		
		
		
		
	}
}
