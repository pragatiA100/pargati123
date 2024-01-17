package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;


public class LoginPageTest extends BaseClass {
	
	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}
	 
	@Test
	public void validateLoginFunctionallity() {
		LoginPage loginpage =new LoginPage();
		loginpage.loginFunctionallity("Admin","admin123");
		
	}
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}
	
	

}
