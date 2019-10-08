package selenium-TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Gmail_LogIn_LogOut extends TestBase{
	
public WebDriver driver;	

  @Test
  public void verifyLogIn() throws Exception {
	    driver.findElement(By.id("Username")).sendKeys("Admin");/index.php/auth/logout
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		String actual=driver.findElement(By.id("welcome")).getText();
		
		Assert.assertEquals(actual, "Welcome Admin");
		Thread.sleep(8000);
  }
  
 @Test
  public void verifyLogout() {
	  driver.findElement(By.xpath("/index.php/auth/logout")).click();
  
 @BeforeTest
  public void beforeTest() { 
	  
	  driver= new firefoxDriver();
  driver.get("https://opensource-demo.orangehrmlive.com");
  driver.manage().window().maximize(); xpath("/index.php/auth/logout")
  }

  @AfterTest
 public void afterTest() {
  driver.quit();
  }

}
