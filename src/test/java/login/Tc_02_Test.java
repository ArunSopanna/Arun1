package login;

import org.testng.annotations.Test;

import genriclibriery.BaseClass;
import objectRepository.RegisterPage;

public class Tc_02_Test extends BaseClass {
	@Test
	public void tc()
	{
		RegisterPage register=new RegisterPage(driver);
		register.getRegister().click();
		register.getFirstnameTF().sendKeys("Arun");
		register.getLastname().sendKeys("Sopanna");
		register.getEmailTF().sendKeys("arunsopanna@gmail.com");
		register.getPassword().sendKeys("arun123");
		register.getConfirpasswordTf().sendKeys("arun123");
		register.getRegisterbutton().click();
		
		
	}

}
