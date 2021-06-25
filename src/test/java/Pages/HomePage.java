package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver = null;

	By ddowncountry = By.id("country");
	By textAddress = By.id("address");
	By textEmail = By.id("email");
	By textPhone = By.id("phone");
	By BtnSave =  By.id("save");
	By textSaved = By.id("saved");
	
	public HomePage(WebDriver driver)
	{
		this.driver =  driver;
	}

	public void SelectCountry(String StrCountry)
	{
		driver.findElement(ddowncountry).sendKeys(StrCountry);
	}
	
	public void EnterAddress(String strAddress)
	{
		driver.findElement(textAddress).sendKeys(strAddress);
	}
	

	public void EnterEmail(String strEmail)
	{
		driver.findElement(textEmail).sendKeys(strEmail);
	}
	
	public void EnterPhone(String strPhone)
	{
		driver.findElement(textPhone).sendKeys(strPhone);
	}
	
	public void ClickSaveButton()
	{
		driver.findElement(BtnSave).click();
	}
	
	public boolean FindSaved()
	{
		if( driver.findElement(textSaved).isDisplayed())
		{
			return true;
		}
		return false;
		
	}
	
	
}
