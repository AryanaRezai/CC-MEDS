package com.realpage.ui.AADispatchPage;

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
public class AADispatchPageStepDefinitions extends PageBase {
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
	public AADispatchPageStepDefinitions(WebDriverManager webDriver, DataManager data) {
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

	 @And("^Four navigation tabs are displayed$")
	 public void Four_navigation_tabs_are_displayed() throws
	 InterruptedException {
	
	 try {
	
	
	 waitForElementPresence(driver,By.className(AADispatchPageComponent.getUIElements().get("navtabs").getClassName()));
	
	
	 } catch (NoSuchElementException e) {
	 e.printStackTrace();
	 
	 fail("Not able to land the navigation tabs on Dispatcher Page");
	 }
	 
	 }
	
	
	
	
	 @When("^User clicks on the Dispatch Lists tab$")
	 public void User_clicks_on_the_Dispatch_Lists_tab() throws
	 InterruptedException {
	
	 try {
	
	
	 Thread.sleep(600);
	WebElement dispatchtab= driver.findElement(By.id("dispatchLists-tab"));
	 dispatchtab.click();
	
	 
	
	 } catch (NoSuchElementException e) {
		 
	 fail("Not able to click on the dispatch tab");
	 }
	 
	 }
	
	
	
	
	 @And("^The Dispatcher table is displayed$")
	 public void The_Dispatcher_table_is_displayed() throws
	 InterruptedException {
	
	 try {
	
		 waitForElementPresence(driver,By.name(AADispatchPageComponent.getUIElements().get("dispatchtable").getName())); 
	
	 } catch (NoSuchElementException e) {
		 
	 fail("Cannot enter valid AA password");
	 
	 }
	 
	 }
	
	
	
	 @When("^User clicks on the add Dispatcher$")
	 public void User_clicks_on_the_add_Dispatcher() throws Throwable {
	
	 try {
		 
	 clickOnElement(driver,By.cssSelector(AADispatchPageComponent.getUIElements().get("aaadddispatchbtn").getCssSelector()));
	 
	 Thread.sleep(2000);
	
	 } catch (NoSuchElementException e) {
		 
	 fail("Not able to click on the add dispatch button");
	 }
	 
	 }
	

	 @When("^An Edit window opens$")
	 public void An_Edit_window_opens() throws Throwable {
	
	 try {
	
	
	 waitForElementPresence(driver,By.id(AADispatchPageComponent.getUIElements().get("editwindow").getIdSelector()));
	
	 } catch (NoSuchElementException e) {
		 
	 fail("Not able to open the edit window");
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