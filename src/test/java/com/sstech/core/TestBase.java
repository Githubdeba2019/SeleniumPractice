package com.sstech.core;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.sstech.common.Log;
import com.sstech.common.PropertyLoader;

public class TestBase {
	public static ChromeDriver driver;
	public static Logger myLog;
	
	@BeforeTest
	public static void initDriver() throws Exception {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\debas\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		myLog=Log.setupLog();
		PropertyLoader.loadProperties();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		}
	
//	@AfterTest
//	public static void closeDriver() {
//		driver.close();
//	}

}
