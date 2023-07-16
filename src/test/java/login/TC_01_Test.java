package login;

import org.testng.annotations.Test;

import genriclibriery.BaseClass;
import objectRepository.LoginPage;

public class TC_01_Test extends BaseClass {
	
	@Test
	public void tc()
	{
	  login.getLogin().click();	
	  login.getEmailTF().sendKeys("Arun Sopanna");
	  login.getPassword().sendKeys("Arun123");
	  login.getLoginButton().click();
	  
	}

}
