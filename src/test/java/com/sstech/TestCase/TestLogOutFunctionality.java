package com.sstech.TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sstech.core.TestBase;
import com.sstech.page.LogInPage;
import com.sstech.page.WelcomePage;

public class TestLogOutFunctionality extends TestBase {
	@Test
	public static void validateLogoutFuctionality() throws InterruptedException {
		//creating object of page object classes
		LogInPage loginpage= new LogInPage();
		WelcomePage welcomepage= new WelcomePage();
		
		//initialize driver
		loginpage.initPageElementDriver(driver);
		welcomepage.initPageElementDriver(driver);
		
		//calling steps
		myLog.info("User entering the username");
		loginpage.enterUserName();
		myLog.info("user entering the password");
		loginpage.enterPassword();
		loginpage.clickSubmitButton();
		welcomepage.clickwelComeAdminbutton();
		Thread.sleep(2000);
		welcomepage.clicklogOutButton();
		
		
		
		
		
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.name("Submit")).click();
//		driver.findElement(By.id("welcome")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Logout']")) .click();
	}

}
