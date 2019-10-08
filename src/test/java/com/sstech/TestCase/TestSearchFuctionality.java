package com.sstech.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sstech.core.TestBase;

public class TestSearchFuctionality extends TestBase {
	@Test
	public static void validateSearchFuctionality() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("john.smith");
		
		Select dropdwn= new Select(driver.findElement(By.id("searchSystemUser_userType")));
		
		dropdwn.selectByIndex(2);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

}
