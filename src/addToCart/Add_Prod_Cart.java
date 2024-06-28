package addToCart;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Prod_Cart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(products);
		
		for (int i = 0; i < products.size(); i++) {
			String veggies = products.get(i).getText();
			System.out.println(veggies);
			//Thread.sleep(2000);

			if (veggies.contains("Cucumber"))
			{
			    driver.findElement(By.xpath("//h4[text()='"+veggies+"']/..//button")).click();
				//driver.findElement(By.xpath("//h4[text()='"+veggies+"']/..//button[text()='ADD TO CART']")).click();
				break;
			}
		}
		Thread.sleep(3000);
		//driver.quit();

	}

}

