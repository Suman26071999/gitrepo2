package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoWebShop {
	
	@DataProvider(name = "userdata")
	public String[][] registerusers() throws EncryptedDocumentException, IOException {
		File file = new File("./Testdata/Userdata.xlsx");
		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);
		int rowcount = workbook.getSheet("Sheet1").getPhysicalNumberOfRows();
		int cellcount = workbook.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();

		String[][] arr = new String[rowcount][cellcount];

		for (int i = 1; i < rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				arr[i][j] = workbook.getSheet("Sheet1").getRow(i).getCell(j).toString();
			}
		}
		return arr;
	}

	@Test(dataProvider = "userdata")
	public void url(String[] credentials) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
        
		driver.findElement(By.id("gender-"+credentials[5])).click();
		driver.findElement(By.id("FirstName")).sendKeys(credentials[0]);
		driver.findElement(By.id("LastName")).sendKeys(credentials[1]);
		driver.findElement(By.id("Email")).sendKeys(credentials[2]);
		driver.findElement(By.id("Password")).sendKeys(credentials[3]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(credentials[4], Keys.ENTER);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
