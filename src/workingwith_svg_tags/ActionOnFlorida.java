package workingwith_svg_tags;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionOnFlorida {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://petdiseasealerts.org/");
		driver.findElement(By.partialLinkText("Go to maps")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		Actions action=new Actions(driver);
        WebElement state = driver.findElement(By.xpath(
				"//*[name()='svg' and @id='map-svg']//*[name()='g' and @id='regions' ]//*[name()='g' and @id='florida']"));
        System.out.println(state.getSize().getWidth());
        System.out.println(state.getSize().getHeight());
        Thread.sleep(3000);
        action.moveToElement(state, 60, 20).click().perform();

	}

}
