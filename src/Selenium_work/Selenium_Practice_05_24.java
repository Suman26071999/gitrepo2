package Selenium_work;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Practice_05_24 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
//		driver.get("file:///E:/Users/soumya/Downloads/MultipleWindow.html");
//		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
//		Set<String> windowIds = driver.getWindowHandles();
//		for(String windowid :windowIds) {
//			driver.switchTo().window(windowid);
//		}
		driver.get("https://www.amazon.com/");
	    driver.findElement(By.cssSelector("input[data-action-type='DISMISS']")).click();
	    driver.findElement(By.id("searchDropdownBox")).click();
				
		
		
	}

}
