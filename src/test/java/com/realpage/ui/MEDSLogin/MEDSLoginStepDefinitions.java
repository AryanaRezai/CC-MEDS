package com.realpage.ui.MEDSLogin;

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
public class MEDSLoginStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent MEDSLoginComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	
	
	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public MEDSLoginStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		MEDSLoginComponent = uiMap.getComponent("medslogin");
	
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	@And("^User have landed on MEDS Login Page$")
	public void User_have_landed_on_MEDS_Login_Page() throws InterruptedException {
		
		try {
			
			
			waitForElementPresence(driver, By.id(MEDSLoginComponent.getUIElements().get("medsloginp").getIdSelector()));
		

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to land on MEDS Login Page");
		}
	}
	
	
	

	@When("^User enters valid MEDS username ([^\"]+)$")
	public void User_enters_valid_MEDS_username(String vun) throws InterruptedException {

		try {
			
	
			Thread.sleep(600);
			
			sendElementText(driver, By.name(MEDSLoginComponent.getUIElements().get("medsemailfield").getName()), vun);

		} catch (NoSuchElementException e) {
			fail("Cannot enter valid MEDS userName");
		}
	}

	
	
	
	@And("^User enters valid MEDS password ([^\"]+)$")
	public void User_enters_valid_MEDS_password(String up) throws InterruptedException {

		try {
			
			sendElementText(driver, By.name(MEDSLoginComponent.getUIElements().get("medspasswordfield").getName()), up);

		} catch (NoSuchElementException e) {
			fail("Cannot enter valid MEDS password");
		}
	}
	


	@When("^User clicks on MEDS Login Button$")
	public void User_clicks_on_MEDS_Login_Button() throws Throwable  {

		try {
			
			clickOnElement(driver, By.name(MEDSLoginComponent.getUIElements().get("medsloginbutton").getName()));

		} catch (NoSuchElementException e) {
			fail("Cannot click on MEDS Login Button");
		}
	}
	
	
	

 }