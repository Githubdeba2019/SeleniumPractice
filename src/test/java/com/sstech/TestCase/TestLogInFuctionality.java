package com.sstech.TestCase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sstech.core.TestBase;

public class TestLogInFuctionality extends TestBase{
	
/*to install TestNG
first add the librirary using pom.xml
then install testNG in your eclipse*/
	
	@Test()
	public static void validateLoginFuctionalityUsingCorrectCredentials() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		String actual=driver.findElement(By.id("welcome")).getText();
		
		Assert.assertEquals(actual, "Welcome Admin");
	}
	
	@Test(enabled=false)
	public static void validateLoginFuctionalityUsingInCorrectCredentials() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		//finish rest of the steps to validate
		
String actual=driver.findElement(By.id("welcome")).getText();
		
		Assert.assertEquals(actual, "Welcome Admin");
	}

}
