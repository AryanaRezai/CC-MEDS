package com.realpage.ui.AAMainDashboard;

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
		glue = {"com.foundation.cucumber", "com.realpage.ui.AALogin", "com.realpage.ui.AAMainDashboard"},
		format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
		features = {"src/test/resources/com/realpage/components/AAMainDashboard/aamaindashboard.feature"}
		)
public class AAMainDashboardCucumberTest {

}
