package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Register")
	private WebElement register;
	
	@FindBy(id="FirstName")
	private WebElement firstnameTF;
	
	@FindBy(id="LastName")
	private WebElement lastname;
	
	@FindBy(id="Email")
	private WebElement emailTF;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirpasswordTf;
	
	@FindBy(id="register-button")
	private WebElement registerbutton;

	public WebElement getRegister() {
		return register;
	}

	public WebElement getFirstnameTF() {
		return firstnameTF;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirpasswordTf() {
		return confirpasswordTf;
	}

	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	

}
