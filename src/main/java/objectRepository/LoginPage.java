package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Log in")
	private WebElement login;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginButton;
	
	@FindBy(id="Email")
	private WebElement emailTF;
	
	@FindBy(name="Password")
	private WebElement password;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPassword() {
		return password;
	}
	
	
	

}
