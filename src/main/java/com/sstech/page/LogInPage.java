package com.sstech.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends PageBase{
	
	//Web Elements
	@FindBy(id="txtUsername") WebElement userName;
	@FindBy(name="txtPassword") WebElement password;
	@FindBy(name="Submit") WebElement submit;

    
   // Actions
    public void enterUserName() {
    	userName.sendKeys("Admin");
    }
    
   public void enterPassword() {
	   password.sendKeys("admin123");
   }
   
   public void clickSubmitButton() {
	   submit.click();
   }
   
}
