package steps_skills;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.homePage;
import pages.loginPage;
import pages.skillsPage;

public class stepsDefination {


	static WebDriver driver;

	homePage HP;
	loginPage LP;
	skillsPage SP;


	@Given("user launch browser")
	public void user_launch_browser()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Then("user enter url as {string}")
	public void user_enter_url_as(String applicationUrl)
	{
		LP=new loginPage();
		LP.lognPageWebDriver(driver);
		LP.user_enter_url_as(applicationUrl);
		

	}

	@Then("user enter username as {string} and password as {string} and clicks login as button")
	public void user_enter_username_as_and_password_as_and_clicks_login_as_button(String userName, String password) 
	{

		
		LP.user_enter_username_as_and_password_as_and_clicks_login_as_button(userName, password);

	}


	@Then("user go to skils page")
	public void user_go_to_skils_page() 
	{
		SP=new skillsPage();
		SP.skillsPageWebDriver(driver);
		SP.user_go_to_skils_page();

	}
	@Then("user enters skils name as {string} and description as {string} and click on save button")
	public void user_enters_skils_name_as_and_description_as_and_click_on_save_button(String name, String jobDescription) {
		SP.user_enters_skils_name_as_and_description_as_and_click_on_save_button(name, jobDescription);
	}



	@Then("click on login button")
	public void click_on_login_button() {


	}
	@Then("close the browser")
	public void close_the_browser() {

	}




}
