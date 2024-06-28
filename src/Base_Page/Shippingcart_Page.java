package Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Shippingcart_Page extends Welcome_Page {
	
	public Shippingcart_Page(WebDriver driver) {
	super(driver);
	}
	
	
	@FindBy(id="termsofservice")
	private WebElement ClickCheckBox;
	
	@FindBy(id="checkout")
	private WebElement CheckOutButton;

	public WebElement getClickCheckBox() {
		return ClickCheckBox;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}
	
	
}
