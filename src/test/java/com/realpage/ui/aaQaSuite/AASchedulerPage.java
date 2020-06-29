package com.realpage.ui.aaQaSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.realpage.ui.AASchedulerPage.AASchedulerPageCucumberTest;


@RunWith(value = Suite.class)
@SuiteClasses(value = { AASchedulerPageCucumberTest.class})

public class AASchedulerPage {

}
