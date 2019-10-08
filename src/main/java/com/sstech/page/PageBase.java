package com.sstech.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	public WebDriver pmDriver;
	
	public void initPageElementDriver(WebDriver driver) {
		pmDriver=driver;
		PageFactory.initElements(driver, this);
	
	}

}
