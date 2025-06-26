package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class skillsPage 
{

	WebDriver driver;
	
	public void skillsPageWebDriver(WebDriver driver1)
	{
		this.driver=driver1;
	}


	public void user_go_to_skils_page() {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
		driver.findElement(By.xpath("//a[text()='Skills']")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();



	}
	@Then("user enters skils name as {string} and description as {string} and click on save button")
	public void user_enters_skils_name_as_and_description_as_and_click_on_save_button(String name, String jobDescription) {
		driver.findElement(By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/child::div[2]/input")).sendKeys(name);
		driver.findElement(By.xpath("//textarea[@placeholder=\"Type description here\"]")).sendKeys(jobDescription);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}




}
