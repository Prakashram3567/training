package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hms.base.Testbase;

public class LoginPage extends Testbase{
	
	@FindBy(tagName="img")WebElement logo;
	@FindBy(xpath="//h3[@class='font-white bolds']")WebElement logtxt;
	@FindBy(xpath="//input[@id='email']")WebElement usertxt;
	@FindBy(xpath="//input[@id='password']")WebElement passtxt;
	@FindBy(xpath="//button[@class='btn']")WebElement signin;
	@FindBy(xpath="//img[@class='topuser-image']")WebElement primage;
	@FindBy(xpath="//h5[text()='Super Admin']")WebElement prtxt;
	@FindBy(xpath="//a[@href='http://triotend.com/tts/site/logout']")WebElement logout;
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getpagetitle()
	{
		return driver.getTitle();
	}
	
	public boolean logoisdisplayed()
	{
		return logo.isDisplayed();	
	}
	
	public String getlogintext()
	{
		return logtxt.getText();
	}
	
	public FrontOfficePage adminlogin(String uname, String pass)
	{
		usertxt.sendKeys(uname);
		passtxt.sendKeys(pass);
		signin.click();
		return new FrontOfficePage();
	}
	
	public void clickonprofileimage()
	{
		primage.click();
	}
	
	public String getprofiletext()
	{
		return prtxt.getText();
	}
	
	public void adminlogout()
	{
		logout.click();
	}

}
