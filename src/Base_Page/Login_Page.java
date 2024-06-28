package Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends Welcome_Page {
	
	public Login_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="Email")
	private WebElement EmailTestBox;
	
	@FindBy(id="Password")
	private WebElement PasswordTextBox;
	
	@FindBy(css ="input[class='button-1 login-button']")
	private WebElement LoginButton;

	public WebElement getEmailTestBox() {
		return EmailTestBox;
	}

	public WebElement getPasswordTextBox() {
		return PasswordTextBox;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
}
