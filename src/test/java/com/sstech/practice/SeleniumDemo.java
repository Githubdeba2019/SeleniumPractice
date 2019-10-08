package com.sstech.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\debas\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage() .window() .maximize();
		
		//Thread.sleep(5000);
		driver.findElement(By.id("identifierId")). sendKeys("bechon234@gmail.com");
      //  driver.findElement(By.className("Cwak9")).click();
        String at = driver.getTitle();
        String et = "gmail";
        driver.close();
        if(at.equalsIgnoreCase(et)){
        	
        	System.out.println("The Test is successful");
        }
        
        else {
        	System.out.println("Test Failure");
        }
	}
}
