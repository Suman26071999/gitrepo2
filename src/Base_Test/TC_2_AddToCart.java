package Base_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base_Page.Billingaddress_Page;
import Base_Page.Books_Page;
import Base_Page.Browser_Page;
import Base_Page.Home_Page;
import Base_Page.Login_Page;
import Base_Page.Shippingcart_Page;

public class TC_2_AddToCart extends Browser_Page {
	
	@Test
	public void addprodtocart() throws InterruptedException {
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
		SC.getClickCheckBox().click();
		SC.getCheckOutButton().click();
		
		Billingaddress_Page BA=new Billingaddress_Page(driver);
		Select select1=new Select(BA.getAddressDropDown());
		select1.selectByVisibleText("New Address");
		BA.getFirstnameTextField().clear();
		BA.getFirstnameTextField().sendKeys("Varshini");
		BA.getLastNameTextField().clear();
		BA.getLastNameTextField().sendKeys("JM");
		BA.getEmailTextField().clear();
		BA.getEmailTextField().sendKeys("varshj@gmail.com");
		Select select=new Select(BA.getCountryDropDown());
		select.selectByVisibleText("India");
		BA.getCityTextfield().sendKeys("Bengalore");
		BA.getAddressTextField().sendKeys("kattraguppe");
		BA.getZipCodeTextField().sendKeys("560059");
		BA.getPhoneNumberTextField().sendKeys("9632506786");
		BA.getContinue1Button().click();
		BA.getContinue2Button().click();
		BA.getShippingOptions().click();
		BA.getContinue3button().click();
		BA.getPaymentTypeRadioButton().click();
		BA.getContinue4button().click();
		BA.getContinue5Button().click();
		BA.getConfirmButton().click();
		System.out.println("Product Ordered Successfully");
		
		
	}

}
