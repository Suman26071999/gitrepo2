package basic;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage {
		    public static void main(String[] args) {
		        // Set the path to your WebDriver executable
		        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		        // Create a new instance of the Chrome driver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to a webpage
		        driver.get("https://www.kalkifashion.com/");

		        // Create an instance of JavascriptExecutor
		        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		        // Refresh the webpage using JavascriptExecutor with history.go(0)
		        jsExecutor.executeScript("history.go(0)");

		        // Close the browser
		        driver.quit();
		    }
}


