package assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseTest {
	
	@Given("Launch Chrome Browser")
	public void launchChromeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("Load URL {string}")
	public void loadURL(String url) {

		driver.get(url);

	}

	@And("Type Username as {string}")
	public void typeUsername(String username) {

		driver.findElement(By.id("username")).sendKeys(username);

	}

	@And("Type password as {string}")
	public void typePassword(String password) {

		driver.findElement(By.id("password")).sendKeys(password);

	}

	@And("click the login Button")
	public void submit() {

		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@And("click the CRM Button")
	public void clickCrm(){

		driver.findElement(By.linkText("CRM/SFA")).click();
	
	}
	
	
	@And("click Lead button")
	public void clickLead(){

		driver.findElement(By.linkText("Leads")).click();
	
	}
	
	@Then("close the browser")
	public void closeTheBrowser(){

		driver.close();
	
	}

}
