package genriclibriery;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;
import objectRepository.RegisterPage;


public class BaseClass {
	RegisterPage register;
	public static LoginPage login;
	public static WebDriver driver;
	public static PropertyUtility ppt=new PropertyUtility();
	@BeforeClass
	public void LaunchingBrowser() throws IOException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(ppt.readingData("url"));
		 login=new LoginPage(driver);
		 register=new RegisterPage(driver);
	}
	@AfterClass
	public void teardownTheBrowser()
	{
		driver.quit();
	}

}
