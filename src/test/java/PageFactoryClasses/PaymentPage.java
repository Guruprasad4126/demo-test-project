package PageFactoryClasses;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

	WebDriver driver;

	public PaymentPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[.='Credit/Debit/ATM Card']")
	private WebElement DebitCard;
	
	@FindBy(id = "cardNumber")
	private WebElement cardnumber;

	@FindBy(id = "nameOnCard")
	private WebElement nameofcard;

	@FindBy(xpath = "//p[.='Month']")
	private WebElement ExpireMonth;

	@FindBy(xpath = "(//div[@class='month__select__wrap font16']/ul/li)[2]")
	private WebElement monthselect;

	@FindBy(xpath = "//p[.='Year']")
	private WebElement ExpireYear;

	@FindBy(xpath = "//div[@class='year__select__wrap font16']/ul/li[4]")
	private WebElement YearSelect;

	@FindBy(id = "cardCvv")
	private WebElement CvvBox;
	
	@FindBy(xpath = "//span[.='pay now']")
	private WebElement payButton;
	
	@FindBy(xpath = "(//div[.='Select Your Country'])[4]")  // id = "billingCountry"
	private WebElement selectcountry;
	
	@FindBy (id = "billingState")
	private WebElement writeStateName;
	
	@FindBy(id = "billingAddress")
	private WebElement billingadress;
	
	@FindBy(id = "billingCity")
	private WebElement entercity;
	
	@FindBy (id= "billingPinCode")
	private WebElement enterpincode;
	
	// EMI Options code
	
	@FindBy(xpath = "//span[.='EMI']")
	private WebElement Emibutton;

	@FindBy(xpath = "//span[.='HDFC Bank']")
	private WebElement selectHDFC;
	
	@FindBy(xpath = "(//div[@class='month__content'])[1]")
	private WebElement EmiMonth;
	
	@FindBy(id  = "cardNumber")
	private WebElement EMIcardnumber;
	
	@FindBy(id = "nameOnCard")
	private WebElement EMInameofcard;
	
	@FindBy(xpath = "//p[.='Month']")
	private WebElement EMIcardExpireMonth;

	@FindBy(xpath = "(//div[@class='month__select__wrap font16']/ul/li)[2]")
	private WebElement EMIcardmonthselect;

	@FindBy(xpath = "//p[.='Year']")
	private WebElement EMIcardExpireYear;

	@FindBy(xpath = "//div[@class='year__select__wrap font16']/ul/li[4]")
	private WebElement EMIcardYearSelect;

	@FindBy(id = "cardCvv")
	private WebElement EMIcardCvvBox;
	
	
	
	
	//debit/credit card methods
	public WebElement DebitcardOption() {
		return DebitCard;
	}
	public WebElement CardNumber() {
		return cardnumber;
	}
	public WebElement NameOnCard() {
		return nameofcard;
	}

	public WebElement ExpireMonthBox() {
		return ExpireMonth;
	}

	public WebElement MonthSelect() {
		return monthselect;
	}

	public WebElement ExpireYearBox() {
		return ExpireYear;

	}
	
	public WebElement YearSelect() {
		return YearSelect;
	}
	public WebElement CvvBox() {
		return CvvBox;
	}
	
	public WebElement SelectCountry() {
		return selectcountry;
	}
	
	public WebElement EnterStateName() {
		return writeStateName;
	}
	public WebElement EnterBillingAddress() {
		return billingadress;
	}
	
	public WebElement EnterCityName() {
		return entercity;
	}
	
	public WebElement EnterPincode() {
		return enterpincode;
	}
	public WebElement ClickToPay() {
		return payButton;
	}
	// Emi Options methods
	
	public WebElement EMIOption() {
		return Emibutton;
	}
	
	public WebElement selectHDFCbank() {
		return selectHDFC;
	}
	
	public WebElement selectEMImonth() {
		return EmiMonth;
	}
	
	
	
	
	
	
	
	
}
