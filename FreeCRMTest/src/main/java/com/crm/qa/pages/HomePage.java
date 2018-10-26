package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'rahul jiwade')]")
	WebElement userNameLable;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'New Deal')]")
	WebElement newDealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath="//a[contains(text(),'Cases')]")
	WebElement casesLink;
	
	// initializing the page objects
		public HomePage(){
			PageFactory.initElements(driver, this);
			
		}
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}
		
		public boolean verifyCorrectUserName(){
			return userNameLable.isDisplayed();
		}
		
		public ContactsPage clickOnContactsLink(){
			contactsLink.click();
			return new ContactsPage();
		}
		
		public DealsPage clickOnDealsLink(){
			dealsLink.click();
			return new DealsPage();
		}
		
		public TasksPage clickOnTasksLink(){
			tasksLink.click();
			return new TasksPage();
		}
		
		public CasesPage clickOnCasesLink(){
			casesLink.click();
			return new CasesPage();
		}
		
		public void clickOnNewContactLink(){
			
			Actions action= new Actions(driver);
			action.moveToElement(contactsLink).build().perform();
			newContactsLink.click();
			
		}
		
		public void clickOnNewDealsLink(){
			Actions action= new Actions(driver);
			action.moveToElement(dealsLink).build().perform();
			newDealsLink.click();
			
		}
		
	

}
