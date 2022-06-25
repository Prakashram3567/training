package TestApp;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hms.base.Testbase;
import hms.pages.FrontOfficePage;
import hms.pages.LoginPage;

public class FrontOfficeTest extends Testbase{
	
	LoginPage objlog;
	FrontOfficePage objff;
	
	public FrontOfficeTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initilization();
		objlog=new LoginPage();
		objff=objlog.adminlogin(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
	}
	
	@Test
	public void frontofficetest()
	{
		objff.clickonffmenu();
		
		String Expectedboxtitle="Appointment Details";
		String Actualboxtitle=objff.getboxtitle();
		Assert.assertEquals(Actualboxtitle, Expectedboxtitle);
		
		objff.clickonvistorbook();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	
	

}
