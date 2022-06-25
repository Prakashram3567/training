package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hms.base.Testbase;

public class FrontOfficePage extends Testbase{
	
	@FindBy(xpath="//ul[@class='sidebar-menu verttop'] //span[text()='Front Office']")WebElement ffmenu;
	@FindBy(xpath="//h3 [@class='box-title titlefix']")WebElement boxtitle;
	@FindBy(xpath="//div[@class='box-tools pull-right'] //a[@href='http://triotend.com/tts/admin/visitors']")WebElement vistorbook;
	
	public FrontOfficePage()
	{
		 PageFactory.initElements(driver, this);
	}
	
	public void clickonffmenu()
	{
		ffmenu.click();
	}
	
	public String getboxtitle()
	{
		return boxtitle.getText();
	}
	
	public VistorPage clickonvistorbook()
	{
		vistorbook.click();
		return new VistorPage();
	}

}
