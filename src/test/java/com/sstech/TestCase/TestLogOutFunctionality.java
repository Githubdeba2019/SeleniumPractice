package com.sstech.TestCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sstech.core.TestBase;
import com.sstech.page.LogInPage;
import com.sstech.page.WelcomePage;

public class TestLogOutFunctionality extends TestBase {
	
	public static LogInPage loginpage= new LogInPage();
	public static WelcomePage welcomepage= new WelcomePage();
	
	@BeforeTest
	public static void initPageElements() {
		loginpage.initPageElementDriver(driver);
		welcomepage.initPageElementDriver(driver);
	}
	
	
	
	@Test
	public static void validateLogoutFuctionality() throws InterruptedException {
		loginpage.enterUserName();
		loginpage.enterPassword();
		loginpage.clickSubmitButton();
		welcomepage.clickwelComeAdminbutton();
		Thread.sleep(2000);
		welcomepage.clicklogOutButton();
		
		
	
	}

}
