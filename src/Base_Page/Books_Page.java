package Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Books_Page extends Welcome_Page {
	public Books_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Computing and Internet']/../../..//input")
	public WebElement addToCartButton;
	
	public void clickOnAddToCart(){
		addToCartButton.click();
	}
	
	@FindBy(id="products-orderby") 
	public WebElement sortBy;

	@FindBy(id="termsofservice")
    public WebElement CheckBox;
    
	public void CheckBox() {
		CheckBox.click();
	}
	
	@FindBy(id="checkout")
	public WebElement CheckOutButton;
	
	public void checkout(){
		CheckOutButton.click();
	}
	
}	
	
	




