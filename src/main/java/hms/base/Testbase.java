package hms.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import hms.commonutility.Activitycapture;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
	public static Properties prop;
	public static WebDriver driver;
	public static Activitycapture acap;
	public static EventFiringWebDriver eve;
	
	public Testbase()
	{
		try {
			FileInputStream ipconfig=new FileInputStream("./src/main/java/hms/config/appconfig.properties");
			
			prop=new Properties();
			prop.load(ipconfig);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initilization()
    {
		String browser=prop.getProperty("BROWSER");
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			if(prop.getProperty("HEADLESS").equals("true"))
			{
				ChromeOptions opt=new ChromeOptions();
				opt.addArguments("--headless");
				driver=new ChromeDriver(opt);
			}else
			{
				driver=new ChromeDriver();
			}
			
		}else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		//Basic Method
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.manage().deleteAllCookies();
		
		acap=new Activitycapture();
		eve=new EventFiringWebDriver(driver);
		eve.register(acap);
		driver=eve;
		
		driver.get(prop.getProperty("URL"));
	}
	

}
