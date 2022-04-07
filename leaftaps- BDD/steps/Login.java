package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login extends BaseClass {


	
	@Given ("Enter the username as {string}")
	public void EnterUserName(String username) {
		WebElement findElementUsername = driver.findElement(By.id("username"));
		findElementUsername.sendKeys(username);
	}
	@And ("Enter the password as {string}")
	public void EnterPassword(String password) {
		WebElement findElementPassword = driver.findElement(By.id("password"));
		findElementPassword.sendKeys(password);
	}
	@When ("The login button is clicked")
	public void ClickLogin() {
		WebElement findElementLogin = driver.findElement(By.className("decorativeSubmit"));
		findElementLogin.click();
	}
	@Then ("Welcome Page is displayed")
	public void VerifyWelcomePage() {
		System.out.println("The Welcome page is displayed");
	}
	
}
/*
 * @Given ("A Chrome browser is Launched") public void OpenChromeBrowser() {
 * System.out.println("Opening Chrome Browser");
 * WebDriverManager.chromedriver().setup(); driver=new ChromeDriver(); }
 * 
 * @And ("Load the Leaftaps url {string}") public void LoadURL(String url) {
 * driver.get(url); }
 * 
 * @And ("Maximize the browser") public void Maximizebrowser() {
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); }
 */