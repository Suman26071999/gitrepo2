package Selenium_work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Suman");
		driver.findElement(By.name("lastname")).sendKeys("mashyal");
		driver.findElement(By.name("reg_email__")).sendKeys("sumanpmashyal@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Chummii@2607");
		WebElement DOB = driver.findElement(By.name("birthday_day"));
		Select dateofbirth=new Select(DOB);
		dateofbirth.selectByValue("26");
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		Select selectmonth=new Select(month);
		selectmonth.selectByValue("Jul");
		Thread.sleep(3000);
		WebElement year= driver.findElement(By.id("year"));
		Select selectyear=new Select(year);
		selectyear.selectByValue("1999");
		Thread.sleep(3000);
		driver.findElement(By.xpath("face")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		}
}
