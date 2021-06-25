package StepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import Pages.*;

import java.util.List;

public class login {
	
	WebDriver driver = null;
	LoginPage loginpage = null;
	HomePage homepage = null;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("browser is open");
		String projectpath =  System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",  projectpath + "/Lib/Browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}
	  

	@And("user is on Login page")
	public void user_is_on_login_page() {
		System.out.println("user is on Login page");
		driver.get("https://example.testproject.io/web/");
	}

	
	  

	
	@When("user enters login details")
	public void user_enters_login_details(DataTable dataTable)  throws Throwable {

			String username;
			String password;
			username = (String) dataTable.cell(0,0);
			password =  (String) dataTable.cell(0,1);
			loginpage=  new LoginPage(driver);
			loginpage.EnterUserName(username);
			loginpage.EnterPassword(password);
		}


	@And("clicks on Login button")
	public void clicks_on_login_button() {

		
		System.out.println("clicks on Login button");
		loginpage=  new LoginPage(driver);
		loginpage.ClickButton();
	   
	}

	@Then("user is navigated to contact input page")
	public void user_is_navigated_to_contact_input_page() {

		System.out.println("user is navigated to contact input page");
		loginpage=  new LoginPage(driver);
		driver.getPageSource().contains("TestProject Example page");
	}
	
	
	@Then("user enters user details")
	public void user_enters_user_details(io.cucumber.datatable.DataTable dataTable) {
		
		String Country;
		String Address;
		String Email;
		String Phone;
		Country = (String) dataTable.cell(0,0);
		Address =  (String) dataTable.cell(0,1);
		Email = (String) dataTable.cell(0,0);
		Phone =  (String) dataTable.cell(0,1);
		
		homepage=  new HomePage(driver);
		homepage.SelectCountry(Country);
		homepage.EnterAddress(Address);
		homepage.EnterEmail(Email);
		homepage.EnterPhone(Phone);
			
	}

	@Then("Clicks on Save button")
	public void clicks_on_save_button() {
		System.out.println("clicks on Save button");
		homepage=  new HomePage(driver);
		homepage.ClickSaveButton();
	}

	@Then("Saved text is displayed")
	public void saved_text_is_displayed() {
		boolean SavedResult;
		homepage=  new HomePage(driver);
		SavedResult = homepage.FindSaved();
		if (SavedResult == true)
		{
			System.out.println("Saved text is displayed");
		}
		System.out.println("Saved text is not displayed");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	  driver.close();
	  driver.quit();
	}
	
}