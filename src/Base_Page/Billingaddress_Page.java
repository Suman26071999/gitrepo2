package Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Billingaddress_Page extends Welcome_Page {

	public Billingaddress_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="BillingNewAddress_FirstName")
	private WebElement FirstnameTextField;
	
	@FindBy(id="BillingNewAddress_LastName")
	private WebElement LastNameTextField;
	
	@FindBy(id="BillingNewAddress_Email")
	private WebElement EmailTextField;
	
	@FindBy(id="BillingNewAddress_City")
	private WebElement CityTextfield;
	
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement AddressTextField;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement ZipCodeTextField;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement PhoneNumberTextField;
	
	@FindBy(css="input[onclick='Billing.save()']")
	private WebElement Continue1Button;
	
	@FindBy(css="input[onclick='Shipping.save()']")
	private WebElement Continue2Button;
	
	@FindBy(id="shippingoption_1")
	private WebElement ShippingOptions;
	
	@FindBy(css="input[onclick='ShippingMethod.save()']")
	private WebElement Continue3button;
	
	@FindBy(id="paymentmethod_1")
	private WebElement PaymentTypeRadioButton;
	
	@FindBy(css="input[onclick='PaymentInfo.save()']")
	private WebElement Paymentinfo;
	
	@FindBy(css="input[onclick='ConfirmOrder.save()']")
	private WebElement ConfirmButton;

	public WebElement getFirstnameTextField() {
		return FirstnameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getCityTextfield() {
		return CityTextfield;
	}

	public WebElement getAddressTextField() {
		return AddressTextField;
	}

	public WebElement getZipCodeTextField() {
		return ZipCodeTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return PhoneNumberTextField;
	}

	public WebElement getContinue1Button() {
		return Continue1Button;
	}

	public WebElement getContinue2Button() {
		return Continue2Button;
	}

	public WebElement getShippingOptions() {
		return ShippingOptions;
	}

	public WebElement getContinue3button() {
		return Continue3button;
	}

	public WebElement getPaymentTypeRadioButton() {
		return PaymentTypeRadioButton;
	}

	public WebElement getPaymentinfo() {
		return Paymentinfo;
	}

	public WebElement getConfirmButton() {
		return ConfirmButton;
	}
	
	@FindBy(id="BillingNewAddress_CountryId")
	private WebElement CountryDropDown;

	public WebElement getCountryDropDown() {
		return CountryDropDown;
	}
	
	@FindBy(css="input[onclick='PaymentMethod.save()']")
	private WebElement continue4button;

	public WebElement getContinue4button() {
		return continue4button;
	}
	
	@FindBy(css="input[onclick='PaymentInfo.save()']")
	private WebElement Continue5Button;

	public WebElement getContinue5Button() {
		return Continue5Button;
	}
	
	@FindBy(id="billing-address-select")
	private WebElement addressDropDown;

	public WebElement getAddressDropDown() {
		return addressDropDown;
	}
	
}	