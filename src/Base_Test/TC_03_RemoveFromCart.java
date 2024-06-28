package Base_Test;

import org.testng.annotations.Test;

import Base_Page.Books_Page;
import Base_Page.Browser_Page;
import Base_Page.Home_Page;
import Base_Page.Login_Page;
import Base_Page.Shippingcart_Page;
import Base_Page.Welcome_Page;

public class TC_03_RemoveFromCart extends Browser_Page{
	@Test
	public void removeprodtocart() throws InterruptedException {
		Login_Page LP=new Login_Page(driver);
		LP.getLoginLink().click();
		LP.getEmailTestBox().sendKeys("varshj@gmail.com");
		LP.getPasswordTextBox().sendKeys("Varsh@123");
		Thread.sleep(1000);;
		LP.getLoginButton().click();
		
		Home_Page HP=new Home_Page(driver);
		HP.getBooksModule().click();
		Books_Page BP=new Books_Page(driver);
		BP.clickOnAddToCart();
		
		Shippingcart_Page SC=new Shippingcart_Page(driver);
		SC.getShopptingCartLink().click();
		SC.getRemovecheckbox().click();
		SC.getUpdateShoppingCartButton().click();
		System.out.println("Product Removed successfully");
}
}