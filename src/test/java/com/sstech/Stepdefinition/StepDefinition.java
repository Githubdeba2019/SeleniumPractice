package com.sstech.Stepdefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.sstech.common.Log;
import com.sstech.common.PropertyLoader;
import com.sstech.core.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends TestBase{
	
	public static ChromeDriver driver;
	public static Logger myLog;
	
	
	public static void initTest() throws Exception {
		PropertyLoader.loadProperties();
		myLog=Log.setupLog();
		PropertyLoader.loadProperties();
		driver=new ChromeDriver();
	}
	
	@Given("open the browser and enter the url")
	public void open_the_browser_and_enter_the_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("I enter the username")
	public void i_enter_the_username() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

	}

	@When("I enter the password")
	public void i_enter_the_password() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

	}

	@When("I hit the submit button")
	public void i_hit_the_submit_button() {
		driver.findElement(By.name("Submit")).click();

	}

	@Then("I validate I logged in successfully")
	public void i_validate_I_logged_in_successfully() {
		
		Assert.assertEquals(driver.findElement(By.id("welcome")).getText(), "Welcome Admin");

	}

}
