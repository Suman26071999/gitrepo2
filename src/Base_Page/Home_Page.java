package Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends Welcome_Page {

	public Home_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Log out")
	private WebElement LogOutLink;

	//----------------------------------Modules
	@FindBy(linkText = "BOOKS")
	private WebElement BooksModule;

	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement ComputersModule;

	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement ElectronicsModule;

	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement ApparelAndShoesModule;

	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement DigitalDownloadsModule;

	@FindBy(partialLinkText = "JEWELRY")
	private WebElement JewelryModule;

	@FindBy(partialLinkText = "GIFTCARDS")
	private WebElement GiftCardsModule;

	public WebElement getLogOutLink() {
		return LogOutLink;
	}

	public WebElement getBooksModule() {
		return BooksModule;
	}

	public WebElement getComputersModule() {
		return ComputersModule;
	}

	public WebElement getElectronicsModule() {
		return ElectronicsModule;
	}

	public WebElement getApparelAndShoesModule() {
		return ApparelAndShoesModule;
	}

	public WebElement getDigitalDownloadsModule() {
		return DigitalDownloadsModule;
	}

	public WebElement getJewelryModule() {
		return JewelryModule;
	}

	public WebElement getGiftCardsModule() {
		return GiftCardsModule;
	}

}
