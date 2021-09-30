package PageFactoryClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;

	public Homepage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='https://www.makemytrip.com/cabs/']")
	private WebElement cabs;

	@FindBy(xpath = "//span[.='From']")
	private WebElement From;

	@FindBy(xpath = "//input[@placeholder='From']")
	private WebElement FromSearchBox;

	@FindBy(xpath = "//label[@for='toCity']")
	private WebElement To;

	@FindBy(xpath = "//input[@placeholder='To']")
	private WebElement ToSearchBox;

	@FindBy(xpath = "//label[@for='departure']")
	private WebElement Departure;

	@FindBy(xpath = "(//div[@class='DayPicker-Caption'])[2]/div")
	private WebElement month;

	@FindBy(xpath = "(//div[.='19'])[2]")
	private WebElement Date;

	@FindBy(xpath = "//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	private WebElement calenderNextButton;

	@FindBy(xpath = "//label[@for='return']")
	private WebElement Return;

	@FindBy(xpath = "//label[@for='pickupTime']")
	private WebElement PickupTime;

	@FindBy(xpath = "//a[.='Search']")
	private WebElement SearchButton;

	@FindBy(xpath = "//label[@for='pickupTime']")
	private WebElement TimeBox;

	@FindBy(xpath = "//ul[@class='timeDropDown blackText']/li[3]")
	private WebElement Time;
	
	
	

	public WebElement Cabs() {
		return cabs;
	}

	public WebElement FromBox() {
		return From;
	}

	public WebElement Fromsearch() {
		return FromSearchBox;
	}

	public WebElement ToBox() {
		return To;
	}

	public WebElement ToSearch() {
		return ToSearchBox;
	}

	public WebElement DepartureBox() {
		return Departure;
	}

	public WebElement CalenderMonth() {
		return month;
	}

	public WebElement calenderNextButton() {
		return calenderNextButton;
	}

	public WebElement calenderDate() {
		return Date;
	}

	public WebElement ReturnBox() {
		return Return;
	}

	public WebElement PickupBox() {
		return PickupTime;

	}

	public WebElement SearchBox() {
		return SearchButton;
	}

	public WebElement TimeBox() {
		return TimeBox;
	}

	public WebElement Time() {
		return Time;

	}
	
}
