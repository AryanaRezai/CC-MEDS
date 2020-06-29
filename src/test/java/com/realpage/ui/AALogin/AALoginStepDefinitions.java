package com.realpage.ui.AALogin;

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
public class AALoginStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent AALoginComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	
	
	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public AALoginStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		AALoginComponent = uiMap.getComponent("aalogin");
	
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	@And("^User have landed on AA Login Page$")
	public void User_have_landed_on_AA_Login_Page() throws InterruptedException {
		
		try {
			
			
			waitForElementPresence(driver, By.id(AALoginComponent.getUIElements().get("aaloginp").getIdSelector()));
		

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to land on AA Login Page");
		}
	}
	
	
	

	@When("^User enters valid AA username ([^\"]+)$")
	public void User_enters_valid_AA_username(String vun) throws InterruptedException {

		try {
			
	
			Thread.sleep(600);
			
			sendElementText(driver, By.name(AALoginComponent.getUIElements().get("aaemailfield").getName()), vun);

		} catch (NoSuchElementException e) {
			fail("Cannot enter valid AA userName");
		}
	}

	
	
	
	@And("^User enters valid AA password ([^\"]+)$")
	public void User_enters_valid_AA_password(String up) throws InterruptedException {

		try {
			
			sendElementText(driver, By.name(AALoginComponent.getUIElements().get("aapasswordfield").getName()), up);

		} catch (NoSuchElementException e) {
			fail("Cannot enter valid AA password");
		}
	}
	


	@When("^User clicks on AA Login Button$")
	public void User_clicks_on_AA_Login_Button() throws Throwable  {

		try {
			
			clickOnElement(driver, By.name(AALoginComponent.getUIElements().get("aaloginbutton").getName()));

		} catch (NoSuchElementException e) {
			fail("Cannot click on AA Login Button");
		}
	}
	
	
	
//	@When("^User sees an error message$")
//	public void User_sees_an_error_message() throws Throwable  {
//
//		try {
//		
//			
//			waitForElementPresence(driver, By.className(LoginComponent.getUIElements().get("errormsg").getClassName()));
//
//		} catch (NoSuchElementException e) {
//			fail("Cannot find Element");
//		}
//	}
//	
//	@And("^User is Not directed to the Home Page ([^\"]+)$")
//	public void User_is_Not_directed_to_the_Home_Page(String loginUrl) throws Throwable  {
//
//		try {
//			
//			 String url =driver.getCurrentUrl();
//			 System.out.println(url);
//		       assertTrue(url.contains(loginUrl));
//		
//		} catch (NoSuchElementException e) {
//			fail("Not on the Login Page");
//		}
//		
//	}
//	
//	@And("^User is directed to the Home Page \"([^\"]*)\"$")
//	public void User_is_directed_to_the_Home_Page(String homeUrl) throws Throwable  {
//
//		try {
//			Thread.sleep(1000);
//			 String url =driver.getCurrentUrl();
//			 System.out.println(url);
//		       assertTrue(url.contains(homeUrl));
//		
//		} catch (NoSuchElementException e) {
//			fail("Not on the Home Page");
//		}
//		
//	}
//	
//		@And("^User clicks on the Forgot Your Password link$")
//		public void User_clicks_on_the_Forgot_Your_Password_link() throws InterruptedException {
//			try {
//				clickOnElement(driver, By.id(LoginComponent.getUIElements().get("forgotpswrdlink").getIdSelector()));
//
//			} catch (NoSuchElementException e) {
//				e.printStackTrace();
//				fail("Not able to click on Forgot Your password link");
//			}
//		}
//
//		@When("^User is directed to Send Password Reset Link Page$")
//		public void User_is_directed_to_Send_Password_Reset_Link_Page() throws InterruptedException {
//
//			try {
//				waitForElementPresence(driver, By.id(LoginComponent.getUIElements().get("resetcontainer").getIdSelector()));
//
//			} catch (NoSuchElementException e) {
//				fail("Not directed to Reset Password page");
//			}
//		}
//		
//		@When("^User enters non existing email address \"([^\"]*)\"$")
//		public void User_enters_non_existing_email_address(String inve) throws InterruptedException {
//
//			try {
//				sendElementText(driver, By.id(LoginComponent.getUIElements().get("resetemailfield").getIdSelector()), inve);
//
//			} catch (NoSuchElementException e) {
//				fail("Cannot enter non existing email address");
//			}
//		}
//		
//		@When("^User sees a message$")
//		public void User_sees_a_message() throws Throwable  {
//
//			try {
//			
//				waitForElementPresence(driver, By.cssSelector(LoginComponent.getUIElements().get("cantfindusermsg").getCssSelector()));
//
//			} catch (NoSuchElementException e) {
//				fail("Cannot find Element");
//			}
//		}
//		
//		@When("^User enters email address \"([^\"]*)\"$")
//		public void User_enters_email_address(String invu) throws InterruptedException {
//
//			try {
//				sendElementText(driver, By.id(LoginComponent.getUIElements().get("resetemailfield").getIdSelector()), invu);
//
//			} catch (NoSuchElementException e) {
//				fail("Cannot enter reset email address");
//			}
//		}
//
//		
//		@And("^User clicks on the Send Password Reset button$")
//		public void User_clicks_on_the_Send_Password_Reset_button() throws InterruptedException {
//			try {
//				clickOnElement(driver, By.id(LoginComponent.getUIElements().get("resetbtn").getIdSelector()));
//				
//
//			} catch (NoSuchElementException e) {
//				e.printStackTrace();
//				fail("Not able to click on Send Password Reset Button");
//			}
//		}
//		
//		
//		@When("^User sees a success message$")
//		public void User_sees_a_success_message() throws Throwable  {
//
//			try {
//			
//				waitForElementPresence(driver, By.className(LoginComponent.getUIElements().get("resetsuccessmsg").getClassName()));
//
//			} catch (NoSuchElementException e) {
//				fail("Cannot find Element");
//			}
//		}
//		@When("^User clicks on the Log Out link$")
//		public void User_clicks_on_the_Log_Out_link() throws InterruptedException {
//			try {
//				clickOnElement(driver, By.id(LoginComponent.getUIElements().get("avatar").getIdSelector()));
//				clickOnElement(driver, By.cssSelector(LoginComponent.getUIElements().get("logoutlink").getCssSelector()));
//
//			} catch (NoSuchElementException e) {
//				e.printStackTrace();
//				fail("Not able to click on Forgot Your password link");
//			}
//		}
//		
//		@Then("^User is redirected to the Login Page \"([^\"]*)\"$")
//		public void User_redirected_to_the_Login_Page(String loginUrl) throws Throwable  {
//
//			try {
//				
//				 String url =driver.getCurrentUrl();
//				 System.out.println(url);
//			       assertTrue(url.contains(loginUrl));
//			
//			} catch (NoSuchElementException e) {
//				fail("Not on the Login Page");
//			}
//			
//		}
//
//
 }