package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass{

	static String leadID="";

	@Then("Get Lead ID from List")
	public void  get_lead_id_from_list() throws InterruptedException {
		Thread.sleep(2000);
		String GetleadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		leadID= GetleadID;
		System.out.println(leadID);
	}

	@When("Enter Lead ID")
	public void enterLead() {
		driver.findElement(By.xpath("//span[text()='Name and ID']/following::input[@name='id']")).sendKeys(leadID);
	}

	@Then("No Records Displayed")
	public void SearchResult() throws InterruptedException {
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if (text.equalsIgnoreCase("No records to display")) {
			System.out.println("verified the Lead is deleted- PASSED");
		} else {
			System.out.println("Lead is not deleted- FAILED");
		}

	}
}
