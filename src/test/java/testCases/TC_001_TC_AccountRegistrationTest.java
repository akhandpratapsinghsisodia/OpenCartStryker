package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;

public class TC_001_TC_AccountRegistrationTest extends BaseClass {
	
	
	
	@Test(groups="Regression")
	public void verify_account_registration() {
		
		logger.info("**************** Starting TC_001_TC_AccountRegistrationTest*****************");
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("CLICKING ON MY ACCCOUNT**********");
		hp.clickRegister();
		logger.info("CLICKING REGISTRATION PAGE***************");
		
		AccountRegistrationPage regPage = new AccountRegistrationPage(driver);
		
		logger.info("***Providing customer details*******");
		regPage.setFirstName(randomeString().toUpperCase());
		regPage.setLastName(randomeString().toUpperCase());
		regPage.setEmail(randomeString()+"@gmail.com");
		
		String password = randomealphanumeric();
		
		
		
		
		
		regPage.setPassword(password);
		regPage.setPolicy();
		regPage.clickContinue();
		
		logger.info("Validating expecting message");
		String confmsg = regPage.getconfirmMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e) {
			logger.error("Test failed....");
			logger.debug("Debug logs.....");
			Assert.fail();
		}
		logger.info("**************** finshed TC_001_TC_AccountRegistrationTest*****************");
	}
	
	

}

