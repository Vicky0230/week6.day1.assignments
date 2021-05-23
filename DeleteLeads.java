package assignment1;


import org.openqa.selenium.By;
import io.cucumber.java.en.And;


public class DeleteLeads extends BaseTest{

	String LeadId ;
	String Text;

	@And("click Find Leads button")
	public void createLead(){

		driver.findElement(By.linkText("Find Leads")).click();

	}

	@And("click Phone button")
	public void typePhone(){

		driver.findElement(By.linkText("Phone")).click();

	}

	@And("Send phoneNumber (.*)$")
	public void phoneNumber(String phoneNumber){

		driver.findElement(By.name("phoneNumber")).sendKeys(phoneNumber);

	}

	@And("Submit Find Leads button")
	public void findLeads() throws InterruptedException{

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

	}


	@And("Get LeadId")
	public void leadId(){

		LeadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
		System.out.println(LeadId);

	}

	@And("Click firdtMatch")
	public void firdtMatch() throws InterruptedException{

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();

	}

	@And("Click Delete")
	public void Delete() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.linkText("Delete")).click();

	}

	@And("Click Find Leads")
	public void findLeadsButton(){

		driver.findElement(By.linkText("Find Leads")).click();

	}


	@And("Send LeadId button")
	public void sendLeadId(){

		driver.findElement(By.name("id")).sendKeys(LeadId);

	}

	@And("Click Find Leads Button")
	public void FindLeadsButton(){

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}


	@And("Get Display Message & Verify")
	public void getDisplayMessage(){

		Text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(Text);
		
		if(Text.contains("No records to display")) 
		{
			System.out.println("Lead is deleted");
		}
		else
		{
			System.out.println("Lead is not deleted");
		}

	}


}
