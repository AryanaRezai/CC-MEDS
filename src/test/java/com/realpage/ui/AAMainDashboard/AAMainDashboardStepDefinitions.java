package com.realpage.ui.AAMainDashboard;

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
public class AAMainDashboardStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent AAMainDashboardComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	
	
	
	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public AAMainDashboardStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		AAMainDashboardComponent = uiMap.getComponent("aamaindashboard");
	
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	@And("^User is on main dashboard page$")
	public void User_is_on_main_dashboard_page() throws InterruptedException {
		
		try {
			
			
			waitForElementPresence(driver, By.className(AAMainDashboardComponent.getUIElements().get("aadashboardheader").getClassName()));
		

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to land on main dashboard Page");
		}
	}
	
	
	@And("^User sees search filters$")
	public void User_sees_search_filters() throws InterruptedException {
		
		try {
			
			
			waitForElementPresence(driver, By.cssSelector(AAMainDashboardComponent.getUIElements().get("aamainsearchf").getCssSelector()));
		

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to see the AA main page search fiters");
		}
	}
	
	
	@And("^Total number of calls$")
	public void Total_number_of_calls() throws InterruptedException {
		
		try {
			
			
			WebElement nofcalls= driver.findElement(By.cssSelector(AAMainDashboardComponent.getUIElements().get("aamainnocalls").getCssSelector()));
			String numberofcalls = nofcalls.getText();
			System.out.println(numberofcalls);
			assertTrue(numberofcalls.equals("Total Calls"));

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to see the AA main page number of total calls");
		}
	}
	
	
	@And("^Number of Captured calls$")
	public void Number_of_Captured_calls() throws InterruptedException {
		
		try {
			
			
			WebElement nofcapcalls= driver.findElement(By.cssSelector(AAMainDashboardComponent.getUIElements().get("aamaincapcalls").getCssSelector()));
			String numberofcapcalls = nofcapcalls.getText();
			System.out.println(numberofcapcalls);
			assertTrue(numberofcapcalls.equals("Calls w/ VM"));

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to see the AA main page number of captured calls");
		}
	}
	
	@And("^Number of Missed calls$")
	public void Number_of_Missed_calls() throws InterruptedException {
		
		try {
			
			
			WebElement nofmisscalls= driver.findElement(By.cssSelector(AAMainDashboardComponent.getUIElements().get("aamainmisscalls").getCssSelector()));
			String numberofmisscalls = nofmisscalls.getText();
			System.out.println(numberofmisscalls);
			assertTrue(numberofmisscalls.equals("Calls w/o VM"));

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to see the AA main page number of missed calls");
		}
	}
	
	
	

	@And("^Number of Call Monitor Compliance$")
	public void Number_of_Call_Monitor_Compliance() throws InterruptedException {
		
		try {
			
			
			WebElement nofmisscalls= driver.findElement(By.cssSelector(AAMainDashboardComponent.getUIElements().get("aacallmcompliance").getCssSelector()));
			String numberofmisscalls = nofmisscalls.getText();
			System.out.println(numberofmisscalls);
			assertTrue(numberofmisscalls.equals("Call Monitor Compliance"));

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to see the AA Number of Call Monitor Compliance");
		}
	}
	
	
	@And("^Number of Average Response Time$")
	public void Number_of_Average_Response_Time() throws InterruptedException {
		
		try {
			
			
			WebElement nofmisscalls= driver.findElement(By.cssSelector(AAMainDashboardComponent.getUIElements().get("aacallaresponset").getCssSelector()));
			String numberofmisscalls = nofmisscalls.getText();
			System.out.println(numberofmisscalls);
			assertTrue(numberofmisscalls.equals("Average Response Time"));

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to see the AA Number of Average Response Time");
		}
	}
	
	
	
	
	@And("^A message breakdown table$")
	public void A_message_breakdown_table() throws InterruptedException {
		
		try {
			
			
			WebElement breakdtab= driver.findElement(By.cssSelector(AAMainDashboardComponent.getUIElements().get("aamainbreakdtable").getCssSelector()));
			String breakdowntable = breakdtab.getText();
			System.out.println(breakdowntable);
			assertTrue(breakdowntable.contains("Message Breakdown"));

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to see the AA main page Breakdown Table");
		}
	}
	
	
	@And("^A list with Call types and their detailed information$")
	public void A_list_with_Call_types_and_their_detailed_information() throws InterruptedException {
		
		try {
			
			
			WebElement proplisttab= driver.findElement(By.cssSelector(AAMainDashboardComponent.getUIElements().get("aamaincalltypes").getCssSelector()));
			String proplisttable = proplisttab.getText();
			System.out.println(proplisttable);
			assertTrue(proplisttable.contains("Maint. Emergency"));
		

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to see the AA main page property list table");
		}
	}


 }