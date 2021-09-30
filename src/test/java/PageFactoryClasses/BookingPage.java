package PageFactoryClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {

	WebDriver driver;

	public BookingPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[@class='latoBlack font12']")
	private WebElement viewPrice;
	
	@FindBy(xpath = "(//span[.='BOOK'])[1]")
	private WebElement BookButton;
	
	@FindBy(xpath = "//span[.='Make full payment now']")
	private WebElement MakeFullPayment;
	
	@FindBy(xpath = "//input[@class='inputBox ']")
	private WebElement PickupADD;
	
	@FindBy(xpath = "//input[@placeholder='Address']")
	private WebElement writeAddhere;
	
	@FindBy(xpath="(//input[@class='inputBox '])[2]")
	private WebElement DropAdd;
	
	@FindBy(xpath = "//input[@aria-autocomplete='list']")
	private WebElement writeAdd;
	
	
	@FindBy(xpath = "//span[.='Male']")
	private WebElement gendermale;
	
	@FindBy(xpath = "//div[@class='cabPaymentCont']")
	private WebElement PaymentButton;
	
	
    public WebElement ViewPrice() {
    	return viewPrice;
    }
    
    public WebElement BookButton() {
    	return BookButton;
    }
    
    public WebElement MakeFullPayment() {
    	return MakeFullPayment;
    }
    public WebElement PickUpAddress() {
    	return PickupADD;
    }
    public WebElement WritePickupAddressHere() {
    	return writeAddhere;
    }
    
    public WebElement DropAddress() {
    	return DropAdd;
    }
    public WebElement WriteDropAddressHere() {
    	return writeAdd;
    			
    }
    public WebElement GenderMale() {
    	return gendermale;
    }
    public WebElement PaymentButton() {
    	return PaymentButton;
    }
}
