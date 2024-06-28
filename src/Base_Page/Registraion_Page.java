package Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registraion_Page extends Welcome_Page {
	
	
	public Registraion_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="gender-male")
	private WebElement maleradiobutton;
	
	@FindBy(id="gender-female")
	private WebElement femaleradiobutton;
	
	@FindBy(id="FirstName")
	private WebElement FirstNameTextField;
	
	@FindBy(id="LastName")
	private WebElement LastNameTextField;
	
	@FindBy(id="Email")
	private WebElement EmailtextField;
	
	@FindBy(id="Password")
	private WebElement PasswordTextField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPassword;
	
	@FindBy(id="register-button")
	private WebElement RegisterButton;
	
	@FindBy(css = "input[value='Continue']")
	private WebDriverWait ContinueButton;

	public WebDriverWait getContinueButton() {
		return ContinueButton;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}

	public WebElement getMaleradiobutton() {
		return maleradiobutton;
	}

	public WebElement getFemaleradiobutton() {
		return femaleradiobutton;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getEmailtextField() {
		return EmailtextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}
	
	@FindBy(css="input[value='Continue']")
	private WebElement ContinueButton1;

	public WebElement getContinueButton1() {
		return ContinueButton1;
	}
	
	
}
