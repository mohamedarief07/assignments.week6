package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class MergeLead extends BaseClass{
	@When("From Lead Lookup is selected")
	public void from_lead_lookup_is_selected() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	}
	
	@When("Enter First Name {string}")
	public void enter_first_name(String firstname) throws InterruptedException {
	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
	}
	
	@When("To Lead Lookup is selected")
	public void to_lead_lookup_is_selected() {
	    driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
	}
	
	@When("Merge button is clicked")
	public void merge_button_is_clicked() {
	    driver.findElement(By.xpath("//a[text()='Merge']")).click();
	}
	
	@When("Alert is accepted")
	public void alert_is_accepted() {
		driver.switchTo().alert().accept();
	}

}
