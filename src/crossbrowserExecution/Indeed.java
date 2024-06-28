package crossbrowserExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Indeed {
	    @Parameters("bname")
		@Test
		public void indeed(String browserName ) throws InterruptedException {
//	    WebDriver driver=null;
//	    driver=new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://in.indeed.com");
//		Thread.sleep(2000);
//		
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")) {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
		//System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		driver=new EdgeDriver();	
		}else {
			Reporter.log("Invalid browser");
		}
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://in.indeed.com");
	}
	
	}


