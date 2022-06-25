package hms.commonutility;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Activitycapture implements WebDriverEventListener {

	public void afterAlertAccept(WebDriver arg0) {
		System.out.println("After Alert" + arg0.toString());

	}

	public void afterAlertDismiss(WebDriver arg0) {
		System.out.println("After AlertDismiss " + arg0.toString());

	}

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("afterChangeValueOf " + arg0.toString());
	}

	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("afterClickOn " + arg0.toString());

	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("afterFindBy" + arg0.toString());

	}

	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub

	}

	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateForward(WebDriver arg0) {
		System.out.println("After navigating forword " + arg0.toString());

	}

	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("After navigating " + arg0.toString());

		System.out.println("After navigating " + arg1.toString());

	}

	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub

	}

	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("before FindBY " + arg0.toString());

	}

	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub

	}

	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateBack(WebDriver arg0) {

		System.out.println("Before navigating back " + arg0.toString());

	}

	public void beforeNavigateForward(WebDriver arg0) {
		System.out.println("Before navigating Forword " + arg0.toString());

	}

	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("Before navigating " + arg0.toString());
		System.out.println("Before navigating " + arg1.toString());

	}

	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	public void onException(Throwable arg0, WebDriver arg1) {
		System.out.println("Testcase done" + arg0.toString());
		System.out.println("Testcase done" + arg1.toString());
		Utilityhms.screenshot();
	}

}
