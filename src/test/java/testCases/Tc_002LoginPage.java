package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;

public class Tc_002LoginPage extends BaseClass {
	
	@Test(groups={"Sanity","Master"})
	public void verify_login() {
		try {
		//HomePage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		//LoginPage
		LoginPage lp = new LoginPage(driver); 
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clicklogin();
		
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetPage = macc.isMyAccountPageExist();
		
		//Assert.assertEquals(targetPage, "LoginFailedd");
		Assert.assertTrue(targetPage);
		}
		catch(Exception e ) {
			Assert.fail();
		}
		}
		
	
			
		
	}
	


