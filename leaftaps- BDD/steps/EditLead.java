package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass{
	@Then("Phone tab is clicked")
	public void phone_tab_is_clicked() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	
	@Then("Enter the Phone Number as {string}")
	public void enter_the_phone_number_as(String phoneNumber) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		Thread.sleep(2000);
	}
	
	@When("Find Leads Button is Clicked")
	public void find_leads_button_is_clicked() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@Then("{string} List is displayed")
	public void list_is_displayed(String ListResult) {
		boolean displayed = driver.findElement(By.xpath("//span[text()='"+ListResult+"']")).isDisplayed();
		System.out.println(displayed);
	}
	
	@When("Click First Lead Link")
	public void click_first_lead_link() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@When("{string} updated company Name")
	public void updated_company_name(String updatedCompanyName) throws InterruptedException {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(updatedCompanyName);
	}
	
	@When("Update Button is clicked")
	public void update_button_is_clicked() {
		driver.findElement(By.name("submitButton")).click();
	}
}
