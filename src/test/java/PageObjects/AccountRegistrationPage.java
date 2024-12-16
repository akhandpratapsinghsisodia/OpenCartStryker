package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkdPolicy;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

public void setFirstName(String fname) {
	txtFirstname.sendKeys(fname);
}

public void setLastName(String lname) {
	txtLastname.sendKeys(lname);
}
public void setEmail(String email) {
	txtEmail.sendKeys(email);
}
public void setPassword(String password) {
	txtPassword.sendKeys(password);
}
public void setPolicy() {
	chkdPolicy.click();
}

public void clickContinue() {
	btnContinue.click();
}

public String getconfirmMsg() {
	
	try {
		return(msgConfirmation.getText());
	}catch(Exception e) {
		return(e.getMessage());
	}
	
}

}








