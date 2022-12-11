package EndToEndTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import PageFactoryClasses.*;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageFactoryClasses.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPage {

	WebDriver driver;
	Actions a;

	@org.testng.annotations.BeforeClass
	public void test() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https:makemytrip.com/");
	}

	@Test (priority = 1)
	public void Loginpage() {
		LoginPage login = new LoginPage(driver);
		login.LoginMenu().click();
		login.LoginMenu().click();
		login.email().sendKeys("lokeshyp97@gmail.com");
		login.Continue().click();
		login.password().sendKeys("Loki@7090");
		login.loginButton().click();

	}

	@Test(priority = 2)
	public void Homepage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Homepage homepage = new Homepage(driver);
		LoginPage login = new LoginPage(driver);
		login.LoginMenu().click();

		homepage.Cabs().click();
		homepage.FromBox().click();
		homepage.FromBox().click();

		WebElement search = homepage.Fromsearch();
		search.sendKeys("banglore");
		Thread.sleep(2000);
		search.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

		Thread.sleep(2000);
		homepage.ToBox().click();
		WebElement to = homepage.ToSearch();
		to.sendKeys("delhi");
		Thread.sleep(2000);
		to.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

		homepage.DepartureBox().click();
                                                                                           // calender handles 
		while (!(homepage.CalenderMonth().getText().equalsIgnoreCase("December 2021"))) {
			homepage.calenderNextButton().click();
		}
		Thread.sleep(2000);
		homepage.calenderDate().click();                                                  // date 
		homepage.TimeBox().click();
		homepage.Time().click();
		homepage.SearchBox().click();

	}

	@Test(priority = 3)
	public void BookingPage() throws InterruptedException {
		BookingPage bp = new BookingPage(driver);
		Thread.sleep(2000);
		bp.ViewPrice().click();
		bp.BookButton().click();

		bp.PickUpAddress().click();
		WebElement pa = bp.WritePickupAddressHere();
		pa.sendKeys("btm");
		Thread.sleep(2000);
		pa.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

		Thread.sleep(3000);
		bp.DropAddress().click();

		WebElement da = bp.WriteDropAddressHere();
		da.sendKeys("delhir");
		Thread.sleep(2000);
		da.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		bp.GenderMale().click();
		Thread.sleep(2000);
		bp.MakeFullPayment().click();
		bp.PaymentButton().click();

	}
	@Test(priority = 4)
	public void PaymentPage() throws AWTException, InterruptedException {
		PaymentPage pp = new PaymentPage(driver);
		
		pp.DebitcardOption().click();
		pp.CardNumber().click();
		pp.CardNumber().sendKeys("6072700627171198"); //dummy card number
		pp.NameOnCard().click();
		pp.NameOnCard().sendKeys("lokeshyp");
		pp.ExpireYearBox().click();
		pp.YearSelect().click();
		pp.ExpireMonthBox().click();
		pp.MonthSelect().click();
		pp.CvvBox().click();
		pp.CvvBox().sendKeys("444");
		Thread.sleep(2000);
		// remove this comments if website ask to enter billing address details. it will ask some times it will not ask some times 
		// thats reason we comments billing details code
		/*
		 // billing details	
		pp.SelectCountry().click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_ENTER);		
		r.keyRelease(KeyEvent.VK_ENTER);
		pp.EnterStateName().click();
		pp.EnterStateName().sendKeys("karnataka");
		pp.EnterBillingAddress().click();
		pp.EnterBillingAddress().sendKeys("banglore");
		pp.EnterCityName().click();
		pp.EnterCityName().sendKeys("banglore");
		pp.EnterPincode().click();
		pp.EnterPincode().sendKeys("560060");
		*/
		pp.ClickToPay().click();
		
	}
	@AfterClass
	public void closure() {
		driver.quit();
	}

}
