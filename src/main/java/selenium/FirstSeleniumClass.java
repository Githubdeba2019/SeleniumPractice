package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\debas\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\debas\\eclipse-workspace\\SeleniumPractice\\driver\\geckodriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	
	}

}
