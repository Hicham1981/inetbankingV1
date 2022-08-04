package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	
WebDriver ldriver;
	
	public EditCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[3]/a")
	@CacheLookup
	WebElement lnkEditCustomer;
	
	
	@FindBy(how = How.NAME, using = "cusid")
	@CacheLookup
	WebElement txtCustomerId;
	
	
	
	public void clickEditCustomer() {
		lnkEditCustomer.click();
			
	}

}
