package com.realpage.ui.AAPropertyPage;

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
public class AAPropertyPageStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent AAPropertyPageComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	
	
	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public AAPropertyPageStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		AAPropertyPageComponent = uiMap.getComponent("aapropertypage");
	
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	@And("^User clicks on the property link$")
	public void User_clicks_on_the_property_link() throws InterruptedException {
		
		try {
			
			
			WebElement proplink= driver.findElement(By.cssSelector("#root > omnibar-shell > div > div.o-main > div.o-navigation > omnibar-navigation > div > div > omnibar-navigation-item:nth-child(2) > div")); 
			Thread.sleep(1000);
			proplink.click();
			Thread.sleep(2000);
		

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to click on the property link");
		}
	}
	
	
	@And("^User is on the listed properties page$")
	public void User_is_on_the_listed_properties_page() throws InterruptedException {
		
		try {
			
			
			waitForElementPresence(driver, By.cssSelector(AAPropertyPageComponent.getUIElements().get("aaproppage").getCssSelector()));
		    WebElement pdd= driver.findElement(By.cssSelector(AAPropertyPageComponent.getUIElements().get("aaproppage").getCssSelector()));
		    String propdropdown= pdd.getText();
		    System.out.println(propdropdown);
		    assertTrue(propdropdown.equals("Properties"));

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to see the AA properties page");
		}
	}
	
	
	@And("^User clicks on a property$")
	public void User_clicks_on_a_property() throws InterruptedException {
		
		try {
			
			WebElement search = driver.findElement(By.id("raul-input-1"));
			search.sendKeys("Villa Verano");
			Thread.sleep(1000);
			
		    WebElement property = driver.findElement(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/div[2]/div/raul-simple-table/table/tbody/tr/td[1]/button"));
		    property.click();
//			
//			WebElement proplist= driver.findElement(By.cssSelector("#root > omnibar-shell > div > div.o-main > div.o-page > div.o-page-wrapper > main > div.content > div.content-padding > div:nth-child(2) > div > raul-simple-table > table > tbody"));
//			String listofprop= proplist.getText();
//			System.out.println(listofprop);
//			Thread.sleep(2000);
			
			
			
				
				
			
			
			
			
//			assertTrue(listpf.equals("AA Testing"));
//			Thread.sleep(1000);
//			nofcalls.click();
//			Thread.sleep(1000);

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to click on AA Testing property");
		}
	}
	
	
 }