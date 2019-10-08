package com.sstech.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends PageBase{
	//Web Elements
	@FindBy(id="welcome") WebElement welcome;
    @FindBy(xpath="//a[text()='Logout']") WebElement logout	 ;
    
    //Actions
    
    public void clickwelComeAdminbutton() {
 	   welcome.click();
    }
    
    public void clicklogOutButton() {
 	   logout.click();
    }

}
