package com.realpage.ui.aaQaSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.realpage.ui.AAAddDispatcher.AAAddDispatcherCucumberTest;
import com.realpage.ui.AADispatchPage.AADispatchPageCucumberTest;
import com.realpage.ui.AALogin.AALoginCucumberTest;
import com.realpage.ui.AAMainDashboard.AAMainDashboardCucumberTest;
import com.realpage.ui.AAPropertyPage.AAPropertyPageCucumberTest;
import com.realpage.ui.AASchedulerPage.AASchedulerPageCucumberTest;
import com.realpage.ui.AADeleteDispatcher.AADeleteDispatcherCucumberTest;


@RunWith(value = Suite.class)
@SuiteClasses(value = {
		                
		                AALoginCucumberTest.class,
						AADispatchPageCucumberTest.class,
						AAMainDashboardCucumberTest.class,
						AAPropertyPageCucumberTest.class,
						AAAddDispatcherCucumberTest.class,
						AASchedulerPageCucumberTest.class,
						AADeleteDispatcherCucumberTest.class,
						
						
})

public class AaQaSuite {

}
