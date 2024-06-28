package Selenium_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kalki {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.kalkifashion.com/");
	    //driver.findElement(By.linkText("WOMEN")).click();
	    Actions action=new Actions(driver);
	    Thread.sleep(2000);
	    WebElement saree = driver.findElement(By.xpath("//a[text()=' Saree']"));
	    action.moveToElement(saree).perform();
	    WebElement bridal = driver.findElement(By.xpath("//a[text()=\"Bridal Saree\"]"));
	    action.moveToElement(bridal).click().perform();
		
	}

}
