package executions;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Naukari {
	
	@Test(invocationCount = 1,threadPoolSize = 1, groups = "Smoke")
	public void naukari() throws InterruptedException {
	System.setProperty("webdriver,msedge.driver", "./drivers/msedgedriver.exe");  
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("//www.naukri.com/");
    Thread.sleep(2000);
	}
}
