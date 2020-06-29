package com.realpage.ui.AADeleteDispatcher;

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
public class AADeleteDispatcherStepDefinitions extends PageBase {
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent AADeleteDispatcherComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;

	/*
	 * ****************************************************** **********
	 * SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public AADeleteDispatcherStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		AADeleteDispatcherComponent = uiMap.getComponent("aadeletedispatcher");

	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS***********
	 *******************************************************
	 */

	
	 
	 
	 @And("^User deletes the dispatcher from the list$")
	 public void User_deletes_the_dispatcher_from_the_list() throws
	 Throwable {
	
	 try {
	
		 
		 WebElement list = driver.findElement(By.cssSelector("#dispatchLists > div > div > raul-simple-table > table > tbody"));
		 String dispatcherlist = list.getText();
		 System.out.println(dispatcherlist);
		 assertTrue(dispatcherlist.contains("Aryana Rezai"));
		 
		 
		WebDriverWait wait = new WebDriverWait(driver, 90);
	
		 WebElement trashcan = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-tab-pane[4]/div/div/div/raul-simple-table/table/tbody/tr/td[7]/button"))));
         trashcan.click();
         
         Thread.sleep(1000);
         WebElement confirmdelete = driver.findElement(By.xpath("/html/body/div[1]/omnibar-shell/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/raul-tab-pane[4]/div/div/div/raul-modal[1]/div/div/raul-modal-footer/div/raul-button[2]"));
         confirmdelete.click();
         
         Thread.sleep(1000);
         
         assertTrue(!dispatcherlist.contains("Aryana Rezai"));
	
	 } catch (NoSuchElementException e) {
	 fail("Not able to delete dispatcher from the list");
	 }
	
	 }
	
	 
	 
	 
	 

}