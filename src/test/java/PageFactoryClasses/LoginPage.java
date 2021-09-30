package PageFactoryClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//li[@data-cy='account']")
	private WebElement LoginMenu;

	@FindBy(id = "username")
	private WebElement email;
	
	@FindBy( xpath = "//button[@data-cy='continueBtn']")
	private WebElement Continue;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@data-cy='login']")
	private WebElement LoginButton;

	
	
	
	public WebElement email() {
		return email;
	}
	public WebElement Continue() {
		return Continue;
	}
	public WebElement password() {
		return password;
	}
	public WebElement loginButton() {
		return LoginButton;
	}
	public WebElement LoginMenu() {
		return LoginMenu;
	}
	
	
}
