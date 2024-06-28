package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {

	@DataProvider
	public String[][] userlogin() throws EncryptedDocumentException, IOException {
		File file = new File("./Testdata/Userdata.xlsx");
		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);
		int rowcount = workbook.getSheet("Sheet2").getPhysicalNumberOfRows();
		int cellcount = workbook.getSheet("Sheet2").getRow(0).getPhysicalNumberOfCells();

		String[][] arr = new String[rowcount-1][cellcount];

		for (int i = 0; i < rowcount - 1; i++) {
			for (int j = 0; j < cellcount; j++) {
				arr[i][j] = workbook.getSheet("Sheet2").getRow(i + 1).getCell(j).toString();
			}
		}

		return arr;

	}

	@Test(dataProvider = "userlogin")
	public void ligin(String[] ligincredentials) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(ligincredentials[0]);
		driver.findElement(By.id("Password")).sendKeys(ligincredentials[1]);
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		driver.findElement(By.partialLinkText("Electronics")).click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
		WebElement Positiondropdown = driver.findElement(By.id("products-orderby"));
		Positiondropdown.click();
		Select select = new Select(Positiondropdown);
		select.selectByValue("Price:Low to High");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Phone Cover']/../../..//input")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}