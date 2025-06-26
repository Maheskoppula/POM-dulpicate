package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {


	 WebDriver driver;

	public void lognPageWebDriver(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	public void user_enter_url_as(String applicationUrl) {
		driver.get(applicationUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}


	public void user_enter_username_as_and_password_as_and_clicks_login_as_button(String userName, String password) 
	{
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}


}
