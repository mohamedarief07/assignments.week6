package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{

	@When("{string} Link is clicked")
	public void link_is_clicked(String LinkText) {
		driver.findElement(By.linkText(LinkText)).click();
	}
	
	@Then("{string} Page is displayed")
	public void page_is_displayed(String PageText) {
		boolean displayed = driver.findElement(By.xpath("//div[text()='"+PageText+"']")).isDisplayed();
		System.out.println(displayed);
	}

	@Then("Enter CompanyName as {string}")
	public void enter_company_name(String CompanyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
	}
	@When("FirstName as {string}")
	public void first_name(String FirstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
	}
	@When("LastName as {string}")
	public void last_name(String LastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
	}
	@When("Create Lead Button is Clicked")
	public void create_lead_button_is_clicked() {
		driver.findElement(By.name("submitButton")).click();
	}
}
