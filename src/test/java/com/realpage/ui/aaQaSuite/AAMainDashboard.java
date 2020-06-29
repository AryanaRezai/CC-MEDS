package com.realpage.ui.aaQaSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.realpage.ui.AAMainDashboard.AAMainDashboardCucumberTest;


@RunWith(value = Suite.class)
@SuiteClasses(value = { AAMainDashboardCucumberTest.class})

public class AAMainDashboard {

}
