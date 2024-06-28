package executions;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LinkedIn {
	@Test(invocationCount = 1,threadPoolSize = 1,groups = "Smoke")
	public void linkedIn() throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.linkedin.com/");
		Thread.sleep(2000);
	}

}
