package dataProvider;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Haircare {
	@DataProvider(name = "Haircare", parallel = true)
	public String[] senddata() {
		String[] shampoo = { "https://www.dove-india.com/",
				"https://www.loreal.com/en/",
				"https://www.pantene.in/" };
		return shampoo;
	}

	@Test(dataProvider = "Haircare")
	public void url(String shampoo) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(shampoo);
	}
}


