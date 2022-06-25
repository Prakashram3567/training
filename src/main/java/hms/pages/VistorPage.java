package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import hms.base.Testbase;
import hms.commonutility.Datepicker;
import hms.commonutility.Utilityhms;

public class VistorPage extends Testbase{
	
	@FindBy(xpath="//h3 [@class='box-title titlefix']")WebElement boxtitle;
	@FindBy(xpath="//a [@data-toggle='modal']")WebElement addvistor;
	//@FindBy(xpath="//h4[text()=' Add Visitor']")WebElement screentitle;
	@FindBy(xpath="//form[@id='formadd'] //select[@name='purpose']")WebElement purpose;
	@FindBy(xpath="//form[@id='formadd'] //input[@name='name']")WebElement pname;
	@FindBy(xpath="//form[@id='formadd'] //input[@name='contact']")WebElement phno;
	@FindBy(xpath="//form[@id='formadd'] //input[@name='id_proof']")WebElement idprf;
	@FindBy(xpath="//form[@id='formadd'] //input[@name='pepples']")WebElement noofperson;
	@FindBy(xpath="//form[@id='formadd'] //input[@name='date']")WebElement datepicker;
	@FindBy(xpath="//form[@id='formadd'] //textarea[@name='note']")WebElement note;
	@FindBy(xpath="//form[@id='formadd'] //input[@name='file']")WebElement upfile;
	@FindBy(xpath="//input[@name='fil']")WebElement save;
	
	
	public VistorPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getboxtitle()
	{
		return boxtitle.getText();
	}
	
	public void clickonaddvistor()
	{
		addvistor.click();
	}
	
	/*public String getscreentitle()
	{
		return screentitle.getText();
	}*/
	
	public void addvistordetails(String data[])
	{
		Select drp=new Select(purpose);
		drp.selectByVisibleText(data[0]);
		pname.sendKeys(data[1]);
		phno.sendKeys(data[2]);
		idprf.sendKeys(data[3]);
		noofperson.sendKeys(data[5]);
		datepicker.click();
		Datepicker dat=new Datepicker();
		dat.datpicker(data[4]);
		note.sendKeys(data[6]);
		Utilityhms.mousemoveandclick(upfile);
		Utilityhms.fileupload(data[7]);
		save.click();
		
	}
	

}
