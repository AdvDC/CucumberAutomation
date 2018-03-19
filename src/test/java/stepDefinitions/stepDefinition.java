package stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import adcLibrary.BaseClass;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition extends BaseClass {
	String pName, petType, zCode;
	 
	@Given("^The User is on Pet Insurance Home Page")
	 public void login() {
		 System.out.println("Executing the Test");
		 try {
			this.setupApp();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	 }
	
//	@When("^User enters \"([^\"]*)\" \"([^\"]* and \"([^\"]*)\"$")
//	 public void enterDetails(String arg1, String arg2, String arg3) {
//		 System.out.println("This is from When");	
//		 pName = arg2; //"Charlie";
//		 petType = arg2; // "Dog";
//		 zCode = arg3;//"90701";
//		Select pType = new Select(driver.findElement(By.id("petType")));
//		pType.selectByVisibleText(petType);
//		driver.findElement(By.id("petName")).sendKeys(pName);
//		driver.findElement(By.id("zipCode")).sendKeys(zCode);
//		System.out.println("Execution Completed");	 
//	 }
	 
	 @When("^User enters the following")
	 public void enterFollowingDetails(DataTable data) {
		 List<List<String>> obj = data.raw();
		 petType = obj.get(0).get(0);
		 pName = obj.get(0).get(1);
		 zCode = obj.get(0).get(2);
		Select pType = new Select(driver.findElement(By.id("petType")));
		pType.selectByVisibleText(petType);
		driver.findElement(By.id("petName")).sendKeys(pName);
		driver.findElement(By.id("zipCode")).sendKeys(zCode);
	 }
	 
	 @When("^User enters (.+) (.+) (.+)$")
	 public void enterBulkDetails(String category, String name, String postCode) {
		Select pType = new Select(driver.findElement(By.id("petType")));
		pType.selectByVisibleText(category);
		driver.findElement(By.id("petName")).sendKeys(name);
		driver.findElement(By.id("zipCode")).sendKeys(postCode);
	 }
	 
	 @And("^User submits the page")
	 public void submitPage1() {
		 driver.findElement(By.xpath("//*[@id=\"getPlans\"]")).click();
	 }
	 @Then("^Pet Insurance Page 2 is loaded and Quote is displayed")
	 public void verifyPage2Quote() {
		 System.out.println("This is from Then");
//			Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"summaryTotal\"]")).isDisplayed());
//			Reporter.log("Assertion Completed");
		 this.close();
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 @Given("^Browser type is decided")
	 public void decideBrowserType() {
		 System.out.println("Browser Type is FireFox");
	 }
	 
	 @When("^Application is started")
	 public void checkApplicationStarted() {
		 System.out.println("Application is started");
	 }
	 
	 @Then("^Check the specific browser is triggered")
	 public void browserTriggered() {
		 System.out.println("FireFox is Triggered");
	 }
}
