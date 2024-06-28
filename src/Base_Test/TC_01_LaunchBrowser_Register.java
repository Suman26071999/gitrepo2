package Base_Test;

import org.testng.annotations.Test;

import Base_Page.Browser_Page;
import Base_Page.Registraion_Page;
import Base_Page.Welcome_Page;

public class TC_01_LaunchBrowser_Register extends Browser_Page  {
       
	@Test
	public void Login() {
		
		Welcome_Page WP=new Welcome_Page(driver);
		WP.getRegisterLink().click();
		System.out.println("Welcome Page Successfully Launched");
		Registraion_Page RP=new Registraion_Page(driver);
		RP.getFemaleradiobutton().click();
		RP.getFirstNameTextField().sendKeys("varshini");
		RP.getLastNameTextField().sendKeys("JM");
		RP.getEmailtextField().sendKeys("jvarsh@gmail.com");
		RP.getPasswordTextField().sendKeys("Varsh@123");
		RP.getConfirmPassword().sendKeys("Varsh@123");
		RP.getRegisterButton().click();
		System.out.println("User Successfully Registered");
		RP.getContinueButton1().click();
	}
	

}
