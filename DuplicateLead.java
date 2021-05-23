package assignment1;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class DuplicateLead  extends BaseTest{

	String LeadName;


	@And("click the Find Leads Button")
	public void findLeads() {

		driver.findElement(By.linkText("Find Leads")).click();

	}

	@And("click the Email Button")
	public void emailButton() {

		driver.findElement(By.linkText("Email")).click();

	}


	@And("Type email as (.*)$")
	public void typeEmail(String email) {

		driver.findElement(By.name("emailAddress")).sendKeys(email);

	}


	@And("click the FindLeads Button")
	public void findLeadsButton() throws InterruptedException {

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

	}

	@And("Get the Lead Name")
	public void leadName() throws InterruptedException {

		LeadName = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a")).getText();
		Thread.sleep(3000);

	}

	@And("click the First Match Button")
	public void match() {

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();

	}

	@And("click the SubMenu Button")
	public void subMenu() {

		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
	}

	@And("Verify the Title")
	public void verifyTitle() {

		String title = driver.getTitle();
		System.out.println(title);

		if(title.contains("Duplicate Lead")) 
		{
			System.out.println("This page is Duplicate Lead");
		}
		else
		{
			System.out.println("The page title is not Duplicate Lead");
		}
	}


	@And("click the Submit Button")
	public void submit() {

		driver.findElement(By.name("submitButton")).click();

	}


	@And("Verify the LeadName")
	public void verifyleadName() {

		String DupName = driver.findElement(By.id("viewLead_firstName_sp")).getText();

		if(LeadName.equals(DupName))
		{
			System.out.println("Created Duplicate Name");
		}
		else
		{
			System.out.println("No Duplicate Created");
		}
	}


}
