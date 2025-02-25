package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccount {
	//1. create object of webdriver

	WebDriver ldriver;
    
	//constructor
	public myAccount(WebDriver rdriver)
	{
		   ldriver=rdriver;
		   PageFactory.initElements(rdriver, this);
	}
	

	   //identify webelements
	   @FindBy(id = "email_create")
	   WebElement createemailId;
	   
	   @FindBy(id ="SubmitCreate")
	   WebElement submitcreate;
	   
	   //identify action on webelement
	   public void enterCreateEmailaddress(String emailAdd) {
		            createemailId.sendKeys(emailAdd);
		            
	   }
	   public void clickSubmitCreate() 
	   {
		   submitcreate.click();
	   }
	   
	   
	   
}
