package com.realpage.ui.aaQaSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.realpage.ui.AALogin.AALoginCucumberTest;


@RunWith(value = Suite.class)
@SuiteClasses(value = { AALoginCucumberTest.class})

public class AAPropertyPage {

}
