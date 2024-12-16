package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	//Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//locators
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath = "//a[normalize-space()='Login'][@class='dropdown-item']")
	WebElement lnklogin;
	
	//Action Method
	public void clickMyAccount() {
		lnkMyaccount.click();
	}
	
	public void clickRegister() {
		
		lnkRegister.click();
		
	}
	
	public void clicklogin() {
		lnklogin.click();
	}
	

}
