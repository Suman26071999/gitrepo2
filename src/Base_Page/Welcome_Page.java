package Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page {
	
	
	public Welcome_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement RegisterLink;
	
	@FindBy(linkText ="Log in")
	private WebElement LoginLink;
	
	@FindBy(linkText ="Shopping cart")
	private WebElement ShopptingCartLink;
	
	@FindBy(linkText ="Wishlist")
	private WebElement WhishList;

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getShopptingCartLink() {
		return ShopptingCartLink;
	}

	public WebElement getWhishList() {
		return WhishList;
	}
	
	@FindBy(name="removefromcart")
	private WebElement removecheckbox;

	public WebElement getRemovecheckbox() {
		return removecheckbox;
	}
	
	@FindBy(name="updatecart")
	private WebElement UpdateShoppingCartButton;

	public WebElement getUpdateShoppingCartButton() {
		return UpdateShoppingCartButton;
	}
	
	
}
