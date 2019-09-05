package com.cucumber.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BaseClass;
import com.cucumber.helper.ConfigReader;
import com.cucumber.helper.FileDataManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = { "pretty",
		"json:src\\test\\java\\com\\seleniumreport\\cucumberreport\\report.json",
		"junit:src\\test\\java\\com\\seleniumreport\\cucumberreport\\report.xml",
		"html:src\\\\test\\\\java\\\\com\\\\seleniumreport\\\\cucumberreport"},

features="src\\test\\java\\com\\cucumber\\feature",glue="com.cucumber.stepdefinition",
tags={"@testcase1"},dryRun=false,strict=true, monochrome=true)


public class TestRunner {
public static WebDriver driver;
@BeforeClass
public static void setupinitialization() throws Exception, Throwable
{
String browserName = FileDataManager.fdm.getConfigReader().getBrowserName();

driver=BaseClass.getBrowser(browserName);
}

@AfterClass
public static void TearDown() throws Exception

{
	BaseClass.driverQuit();

}
}