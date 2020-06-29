package com.realpage.ui.AAAddDispatcher;

import com.realpage.core.component.UIComponent;
import com.realpage.core.component.UIComponentMap;
import com.realpage.core.page.PageBase;
import com.realpage.core.page.UIPageFactory;
import com.foundation.selenium.DataManager;
import com.foundation.selenium.WebDriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.qameta.allure.junit4.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/*
 ******************************************************* 
 Covering: 
 	- All Search functionality 
 *******************************************************
 */
public class AAAddDispatcherStepDefinitions extends PageBase {
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent AAAddDispatcherComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;

	/*
	 * ****************************************************** **********
	 * SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public AAAddDispatcherStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		AAAddDispatcherComponent = uiMap.getComponent("aaadddispatcher");

	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS***********
	 *******************************************************
	 */

	
	
	
	
	
	 @When("^User enters dispatcher name ([^\"]+)$")
	 public void User_enters_dispatcher_name(String name) throws
	 InterruptedException {
	
	 try {
	
	
	 Thread.sleep(600);
	
	 sendElementText(driver,By.id(AAAddDispatcherComponent.getUIElements().get("dispatchername").getIdSelector()),name);
	
	 } catch (NoSuchElementException e) {
	 fail("Cannot enter Dispatcher Name");
	 
	 }
	 }
	 
	 
	 @When("^User selects a dispatcher type$")
	 public void User_selects_a_dispatcher_type() throws Throwable {
	
	 try {
	
	
	 WebElement arrow= driver.findElement(By.cssSelector("#dispatch-small-aside > div > div.r-aside__dialog > form > div > div:nth-child(3) > div > raul-select > div > button > div"));
	 arrow.click();
	 
	 Thread.sleep(2000);
	 WebElement checkmark = driver.findElement(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-aside/div/div[2]/form/div/div[3]/div/raul-select/div/div/div/div[2]/raul-option[2]"));
	 checkmark.click();
	 Thread.sleep(500);
	 

	
	 } catch (NoSuchElementException e) {
	 fail("Cannot pick dispatcher type");
	 }
	 }
	 
	 
	 @And("^User enters dispatcher date$")
	 public void User_enters_dispatcher_date() throws
	 InterruptedException {
	
	 try {
	
	WebElement startdate= driver.findElement(By.id("raul-input-5"));
	startdate.click();
	
	WebElement dayincalendar= driver.findElement(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-aside/div/div[2]/form/div/div[4]/div/div[1]/raul-date-picker/div/div[2]/div[2]/div[1]/div/div/table/tbody/tr[5]/td[3]"));
	dayincalendar.click();
	Thread.sleep(500);
//	 Date now=new Date();
//	 DateFormat s_date=new SimpleDateFormat("MM/dd/yyyy");
//	 Calendar cal = Calendar.getInstance();
//	 cal.setTime(now);
//	 cal.add(Calendar.DAY_OF_YEAR,7);
//	 Date InSevenDays=cal.getTime();
//	 String s = s_date.format(InSevenDays);
//	 System.out.println(s);
//	
//	 
//	 DateFormat new_date= new SimpleDateFormat("MMM dd,YYYY");
//	 String sa= new_date.format(InSevenDays);
//	 System.out.println(sa);
	 
	 
	 
	// JavascriptExecutor jse = (JavascriptExecutor)driver;
	// jse.executeScript("document.getElementById('raul-input-5').value=' " +sa+"'");
	 //jse.executeScript("document.getElementById('raul-input-5').value='06/16/2020'");
	 
	 
	 
	 
	 
	 
	WebElement enddate= driver.findElement(By.id("raul-input-6"));
	enddate.click();
	WebElement dayincalendarr= driver.findElement(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-aside/div/div[2]/form/div/div[4]/div/div[2]/raul-date-picker/div/div[2]/div[2]/div[1]/div/div/table/tbody/tr[5]/td[3]"));
	dayincalendarr.click();
	Thread.sleep(500);
	
//	 Date noww=new Date();
//	 DateFormat e_date=new SimpleDateFormat("MM/dd/yyyy");
//	 Calendar call = Calendar.getInstance();
//	 call.setTime(noww);
//	 call.add(Calendar.DAY_OF_YEAR,7);
//	 //Date InSevDays=call.getTime();
//	 String e = e_date.format(InSevenDays);
//	 System.out.println(e);
//	 
//	 
//	 DateFormat new_datee=new SimpleDateFormat("MMM dd,YYYY");
//	 String ed =new_datee.format(InSevenDays);
//	 System.out.println(ed);
	 
	// JavascriptExecutor jsee= (JavascriptExecutor)driver;
	 //jsee.executeScript("document.getElementById('raul-input-6').value=' "+ed+"'");
	 //jsee.executeScript("document.getElementById('raul-input-6').value='06/16/2020'");
	 //Thread.sleep(500);
	 
	
	 
	 
	 
	 } catch (NoSuchElementException e) {
	 e.printStackTrace();
	 fail("Not able to enter start and end date for dispatcher");
	 }
	 }
	 
	 
	 
	 
	 @And("^User enters dispatcher day$")
	 public void User_enters_dispatcher_day() throws
	 InterruptedException {
	 try {
		 
		 WebElement dayofweek = driver.findElement(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-aside/div/div[2]/form/div/div[6]/div[3]/label/span[1]/span[1]/input"));
	     dayofweek.click();
	     
	     Thread.sleep(1000);
	
	 } catch (NoSuchElementException e) {
	 e.printStackTrace();
	 fail("Not able to pick day of week in dispatcher edit window");
	 }
	 }
	 
	 
	 @When("^User enters dispatcher time$")
	 public void User_enters_dispatcher_time() throws
	 InterruptedException {
	
	 try {
	 
		 WebElement starttimedropdown= driver.findElement(By.xpath("//*[@id='DateRecurrences.2.schedule.0.start']/div/button"));
		 starttimedropdown.click();
		 Thread.sleep(1000);
		 
		 WebElement starttime= driver.findElement(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-aside/div/div[2]/form/div/div[6]/div[4]/div/raul-select[1]/div/div/div/div[2]/raul-option[1]"));
		 starttime.click();
		 Thread.sleep(1000);
		 
		 starttimedropdown.sendKeys(Keys.TAB);
		 Thread.sleep(1000);
		 
		 WebElement endtimedropdown= driver.findElement(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-aside/div/div[2]/form/div/div[6]/div[4]/div/raul-select[2]/div/button"));
		 endtimedropdown.click();
		 
		 WebElement endtime = driver.findElement(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-aside/div/div[2]/form/div/div[6]/div[4]/div/raul-select[2]/div/div/div/div[2]/raul-option[3]"));
		 endtime.click();
	
	 } catch (NoSuchElementException e) {
	 fail("Not able to select dispatcher time");
	 }
	 }
	 
	 
	 @When("^User selects a dispatcher color$")
		 public void User_selects_a_dispatcher_color() throws Throwable {
		
		 try {
		
			 WebElement colordropdown = driver.findElement(By.xpath("//*[@id='color-container']/div/raul-select/div/button"));
			 colordropdown.click();
			 Thread.sleep(2000);
			 
			 
			 
			WebElement color = driver.findElement(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-aside/div/div[2]/form/div/div[7]/div/raul-select/div/div/div/div[2]/raul-option[2]/raul-icon"));
			Thread.sleep(1000);
			color.click();
			Thread.sleep(1000);
			 
		
		 } catch (NoSuchElementException e) {
		 fail("Cannot select dispatcher color");
		 }
		 }
	
	
	
	 @When("^User selects a technician$")
	 public void User_selects_a_technician() throws Throwable {
	
	 try {
	
       //tech Add button 
	   WebElement techaddbtn=  driver.findElement(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-aside/div/div[2]/form/div/div[9]/div[1]/raul-button/div"));
	   techaddbtn.click();
	   Thread.sleep(1000);
	   
	   //selecting technician
	   WebElement technician = driver.findElement(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-aside/div/div[2]/form/raul-aside/div/div[2]/div/raul-simple-table/table/tbody/tr[10]/td[1]/raul-checkbox"));
	   technician.click();
	   Thread.sleep(1000);
	   
	   //tech page close btn
	   WebElement techclosebtn= driver.findElement(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-aside/div/div[2]/form/raul-aside/div/div[2]/div/raul-simple-table/div/div/div/raul-button/div"));
	   techclosebtn.click();
	   Thread.sleep(1000);
	   
	 } catch (NoSuchElementException e) {
	 fail("Cannot click on technician add button");
	 }
	 }
	
	 
	 @And("^User submits dispatcher$")
		 public void User_submits_dispatcher() throws
		 InterruptedException {
		 try {
			 
			 
		 clickOnElement(driver,By.className(AAAddDispatcherComponent.getUIElements().get("dissubmitbtn").getClassName()));
		 Thread.sleep(1000);
		
		 } catch (NoSuchElementException e) {
		 e.printStackTrace();
		 fail("Not able to submit the dispatcher");
		 }
		 }
		
		

	
	
	 @And("^User makes sure that submitted dispatcher is in the list$")
	 public void User_makes_sure_that_submitted_dispatcher_is_in_the_list() throws
	 Throwable {
	
	 try {
	
		 WebElement list = driver.findElement(By.cssSelector("#dispatchLists > div > div > raul-simple-table > table > tbody"));
		 String dispatcherlist = list.getText();
		 System.out.println(dispatcherlist);
		 assertTrue(dispatcherlist.contains("Aryana Rezai"));
		 
		 
		 Thread.sleep(1000);
	
	 } catch (NoSuchElementException e) {
	 fail("Not able to find the added dispatcher");
	 }
	
	 }
	 
	 
	 
	 
	 

}