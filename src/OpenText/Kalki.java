package OpenText;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriverCommandExecutor;

import dev.failsafe.internal.util.Durations;

public class Kalki {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.kalkifashion.com/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("KIDS")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'Stylish Blue Cotton Kurta Set For Boys')]")).click();
		
		driver.close();
	}

}
