package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {
	
	//find the object repository using @FindBy() annotation
	
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement login;
	
	//initialize the object Repository by using PageFactory.intElements() method
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginFunctionallity(String username,String password)
	{
		uname.sendKeys(username);
		pass.sendKeys(password);
		login.click();
	}
	
	
	
	
	

}
