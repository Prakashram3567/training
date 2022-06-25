

package TestApp;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import hms.base.Testbase;
import hms.commonutility.ReadExcel;
import hms.pages.FrontOfficePage;
import hms.pages.LoginPage;
import hms.pages.VistorPage;

public class VistorTest extends Testbase{
	
	LoginPage objlog;
	FrontOfficePage objff;
	VistorPage objvis;
	
	public VistorTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initilization();
		objlog=new LoginPage();
		objff=objlog.adminlogin(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		objff.clickonffmenu();
		objvis=objff.clickonvistorbook();
		
	}
	
	@DataProvider
	public Object[][] getvisdata()
	{
		Object[][]visdata=ReadExcel.getTestData("testdata");
		return visdata;
	}
	
	
	@Test(dataProvider ="getvisdata")
	public void vistortest(String data[])
	{
		String Expectedboxtitle="Visitor List";
		String Actualboxtitle=objvis.getboxtitle();
		Assert.assertEquals(Actualboxtitle, Expectedboxtitle);
		
		objvis.clickonaddvistor();
		
		/*String Expectedscreentitle=" Add Visitor";
		String Actualscreentitle=objvis.getscreentitle();
		Assert.assertEquals(Actualscreentitle, Expectedscreentitle);*/
		
		objvis.addvistordetails(data);
		
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
