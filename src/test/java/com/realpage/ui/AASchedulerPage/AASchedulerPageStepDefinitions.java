package com.realpage.ui.AASchedulerPage;

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
import org.openqa.selenium.By;
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
import java.util.List;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/*
 ******************************************************* 
 Covering: 
 	- All Search functionality 
 *******************************************************
 */
public class AASchedulerPageStepDefinitions extends PageBase {
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent AADispatchPageComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	

	/*
	 * ****************************************************** **********
	 * SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public AASchedulerPageStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		AADispatchPageComponent = uiMap.getComponent("aadispatchpage");

	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS***********
	 *******************************************************
	 */

	 @And("^User clicks on the Scheduling Page tab$")
	 public void User_clicks_on_the_Scheduling_Page_tab() throws
	 InterruptedException {
	
	 try {
	
	
	WebDriverWait wait = new WebDriverWait (driver, 90);
	WebElement schedulerpage =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("scheduling-tab")));
	schedulerpage.click();
	
	
	 } catch (NoSuchElementException e) {
	 e.printStackTrace();
	 fail("Not able to navigate to Scheduling page");
	 }
	 }
	
	
	
	
	 @When("^Calendar schedule is displayed$")
	 public void Calendar_schedule_is_displayed() throws
	 InterruptedException {
	
	 try {
		 
         WebDriverWait wait = new WebDriverWait (driver, 90);
         WebElement schedulercalendar =wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("calendar-schedule")));
	
	
	
	
	 } catch (NoSuchElementException e) {
	 fail("Calendar scheduled is NOT displayed");
	 }
	 }
	
	
	
	
	 @And("^Scheduled dispatcher calendar is there \"([^\"]*)\"$")
	 public void Scheduled_dispatcher_calendar_is_there(String up) throws
	 InterruptedException {
	
	 try {
		 
		 WebDriverWait wait = new WebDriverWait (driver, 90);
         WebElement scheduleddispatcher = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-tab-pane[3]/div/div/div/div/div[2]/div/div/div[2]/div[6]/div[2]/div[2]/div[2]/div/div")));
		 
		 String dispatcher = scheduleddispatcher.getText();
		 System.out.println(dispatcher);
		 
		 assertTrue(dispatcher.equals(up));
	
	
	
	 } catch (NoSuchElementException e) {
	 fail("Scheduled dispatcher calendar is there");
	 }
	 }
	
	
	
	 @When("^User clicks on add dispatcher button and open edit page$")
	 public void User_clicks_on_add_dispatcher_button_and_open_edit_page() throws Throwable {
	
	 try {
		 
		 WebDriverWait wait = new WebDriverWait (driver, 90);
         WebElement dispatchbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-tab-pane[3]/div/div/div/div/div[1]/div/div/raul-button/div")));
	
	     dispatchbutton.click();
	     Thread.sleep(500);
	     
	     
	     WebDriverWait waitt = new WebDriverWait (driver, 90);
         WebElement cancelbtn = waitt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-aside/div/div[2]/form/div/div[10]/div/div[1]/raul-button")));
	     cancelbtn.click();
	     Thread.sleep(500);
	     
	
	 } catch (NoSuchElementException e) {
	 fail("Dispatcher button is not visible on scheduler page");
	 }
	 }
	

	 
	 @When("^User toggles the dispatcher list on$")
	 public void User_toggles_the_dispatcher_list_on() throws Throwable {
	
	 try {
		 
		 
		 WebDriverWait wait = new WebDriverWait (driver, 90);
         WebElement scheduleddispatchtoggle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-tab-pane[3]/div/div/div/div/div[1]/div/div/raul-switch/div/label")));
         
         scheduleddispatchtoggle.click();
         Thread.sleep(500);
         
         System.out.println("?????");
         
         driver.findElement(By.className("dispatch-schedule-list"));
         
         scheduleddispatchtoggle.click();
	

	
	 } catch (NoSuchElementException e) {
	 fail("Dispatcher list toggle is not there on schedule page");
	 }
	 }
	 
	
	// @And("^User is Not directed to the Home Page ([^\"]+)$")
	// public void User_is_Not_directed_to_the_Home_Page(String loginUrl) throws
	// Throwable {
	//
	// try {
	//
	// String url =driver.getCurrentUrl();
	// System.out.println(url);
	// assertTrue(url.contains(loginUrl));
	//
	// } catch (NoSuchElementException e) {
	// fail("Not on the Login Page");
	// }
	//
	// }
	//
	// @And("^User is directed to the Home Page \"([^\"]*)\"$")
	// public void User_is_directed_to_the_Home_Page(String homeUrl) throws
	// Throwable {
	//
	// try {
	// Thread.sleep(1000);
	// String url =driver.getCurrentUrl();
	// System.out.println(url);
	// assertTrue(url.contains(homeUrl));
	//
	// } catch (NoSuchElementException e) {
	// fail("Not on the Home Page");
	// }
	//
	// }
	//
	// @And("^User clicks on the Forgot Your Password link$")
	// public void User_clicks_on_the_Forgot_Your_Password_link() throws
	// InterruptedException {
	// try {
	// clickOnElement(driver,
	// By.id(LoginComponent.getUIElements().get("forgotpswrdlink").getIdSelector()));
	//
	// } catch (NoSuchElementException e) {
	// e.printStackTrace();
	// fail("Not able to click on Forgot Your password link");
	// }
	// }
	//
	// @When("^User is directed to Send Password Reset Link Page$")
	// public void User_is_directed_to_Send_Password_Reset_Link_Page() throws
	// InterruptedException {
	//
	// try {
	// waitForElementPresence(driver,
	// By.id(LoginComponent.getUIElements().get("resetcontainer").getIdSelector()));
	//
	// } catch (NoSuchElementException e) {
	// fail("Not directed to Reset Password page");
	// }
	// }
	//
	// @When("^User enters non existing email address \"([^\"]*)\"$")
	// public void User_enters_non_existing_email_address(String inve) throws
	// InterruptedException {
	//
	// try {
	// sendElementText(driver,
	// By.id(LoginComponent.getUIElements().get("resetemailfield").getIdSelector()),
	// inve);
	//
	// } catch (NoSuchElementException e) {
	// fail("Cannot enter non existing email address");
	// }
	// }
	//
	// @When("^User sees a message$")
	// public void User_sees_a_message() throws Throwable {
	//
	// try {
	//
	// waitForElementPresence(driver,
	// By.cssSelector(LoginComponent.getUIElements().get("cantfindusermsg").getCssSelector()));
	//
	// } catch (NoSuchElementException e) {
	// fail("Cannot find Element");
	// }
	// }
	//
	// @When("^User enters email address \"([^\"]*)\"$")
	// public void User_enters_email_address(String invu) throws
	// InterruptedException {
	//
	// try {
	// sendElementText(driver,
	// By.id(LoginComponent.getUIElements().get("resetemailfield").getIdSelector()),
	// invu);
	//
	// } catch (NoSuchElementException e) {
	// fail("Cannot enter reset email address");
	// }
	// }
	//
	//
	// @And("^User clicks on the Send Password Reset button$")
	// public void User_clicks_on_the_Send_Password_Reset_button() throws
	// InterruptedException {
	// try {
	// clickOnElement(driver,
	// By.id(LoginComponent.getUIElements().get("resetbtn").getIdSelector()));
	//
	//
	// } catch (NoSuchElementException e) {
	// e.printStackTrace();
	// fail("Not able to click on Send Password Reset Button");
	// }
	// }
	//
	//
	// @When("^User sees a success message$")
	// public void User_sees_a_success_message() throws Throwable {
	//
	// try {
	//
	// waitForElementPresence(driver,
	// By.className(LoginComponent.getUIElements().get("resetsuccessmsg").getClassName()));
	//
	// } catch (NoSuchElementException e) {
	// fail("Cannot find Element");
	// }
	// }
	// @When("^User clicks on the Log Out link$")
	// public void User_clicks_on_the_Log_Out_link() throws InterruptedException
	// {
	// try {
	// clickOnElement(driver,
	// By.id(LoginComponent.getUIElements().get("avatar").getIdSelector()));
	// clickOnElement(driver,
	// By.cssSelector(LoginComponent.getUIElements().get("logoutlink").getCssSelector()));
	//
	// } catch (NoSuchElementException e) {
	// e.printStackTrace();
	// fail("Not able to click on Forgot Your password link");
	// }
	// }
	//
	// @Then("^User is redirected to the Login Page \"([^\"]*)\"$")
	// public void User_redirected_to_the_Login_Page(String loginUrl) throws
	// Throwable {
	//
	// try {
	//
	// String url =driver.getCurrentUrl();
	// System.out.println(url);
	// assertTrue(url.contains(loginUrl));
	//
	// } catch (NoSuchElementException e) {
	// fail("Not on the Login Page");
	// }
	//
	// }
	//
	//
}