package com.realpage.ui.AASchedulerPage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



/**
 * This runs all the defined cucumber tests
 *
 * @author:  Aryana.R
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		glue = {"com.foundation.cucumber", "com.realpage.ui.AALogin", "com.realpage.ui.AAMainDashboard", "com.realpage.ui.AAPropertyPage",  "com.realpage.ui.AASchedulerPage"},
		format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
		features = {"src/test/resources/com/realpage/components/AASchedulerPage/aaschedulerpage.feature"}
		)
public class AASchedulerPageCucumberTest {

}
