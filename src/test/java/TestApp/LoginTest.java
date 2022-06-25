package TestApp;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hms.base.Testbase;
import hms.pages.LoginPage;

public class LoginTest extends Testbase{
	
	LoginPage objlog;
	
	public LoginTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initilization();
		objlog=new LoginPage();
	}
	
	@Test
	public void adminlogintest()
	{
		String Expectedpagetitle="Smart Hospital : Hospital Management System";
		String Actualpagetitle=objlog.getpagetitle();
		Assert.assertEquals(Actualpagetitle, Expectedpagetitle);
		
		Assert.assertTrue(objlog.logoisdisplayed());
		
		String Expectedloginpagetext="Admin Login";
		String Actualloginpagetext=objlog.getlogintext();
		Assert.assertEquals(Actualloginpagetext, Expectedloginpagetext);
		
		objlog.adminlogin(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		
		objlog.clickonprofileimage();
		
		String Expectedprofiletext="Super Admin";
		String Actualprofiletext=objlog.getprofiletext();
		Assert.assertEquals(Actualprofiletext, Expectedprofiletext);
		
		objlog.adminlogout();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
