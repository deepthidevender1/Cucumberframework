package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver = null;

	By textUsername = By.id("name");
	By textPassword = By.id("password");
	By BtnLogin =  By.id("login");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver =  driver;
	}

	public void EnterUserName(String StrUserName)
	{
		driver.findElement(textUsername).sendKeys(StrUserName);
	}

	public void EnterPassword(String strPassword)
	{
		driver.findElement(textPassword).sendKeys(strPassword);
	}

	public void ClickButton()
	{
		driver.findElement(BtnLogin).click();
	}
	public void LoginValidUser(String StrUserName, String strPassword)
	{
		driver.findElement(textUsername).sendKeys(StrUserName);
		driver.findElement(textPassword).sendKeys(strPassword);
		driver.findElement(BtnLogin).click();
	}

}
