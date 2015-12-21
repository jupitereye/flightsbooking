package com.expedia.flightsbooking;

import org.testng.annotations.Test;

import pageclasses.SearchPage;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestNG_TestSuite {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = Logger.getLogger(TestNG_TestSuite.class);

	@BeforeClass
	public void beforeClass() {
		PropertyConfigurator.configure("log4j.properties");
		driver = new FirefoxDriver();
		baseUrl = "http://www.expedia.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//PropertyConfigurator.configure("log4j.properties");
		driver.get(baseUrl);
	}

	@Test
	public void AfillBasicInfo() throws Exception {
		SearchPage.navigateToFlightsTab(driver);
		SearchPage.fillOriginTextBox(driver, "New York");
		SearchPage.fillDestinationTextBox(driver, "Chicago");
		SearchPage.fillDepartureDateTextBox(driver, "12/25/2015");
		SearchPage.returnDateTextBox(driver).clear();
		SearchPage.fillReturnDateTextBox(driver, "12/31/2015");
		//SearchPage.returnDateTextBox(driver).click();
		Thread.sleep(3000);
	}
	
	@Test
	public void BfillAdvancedInfo() throws Exception {
		SearchPage.navigateToFlightsTab(driver);
		//SearchPage.clickOnAdvancedLink(driver);
		//SearchPage.clickOnAdvancedLink(driver);
		SearchPage.clickOnStopCheckBox(driver);
		SearchPage.selectFlightClass(driver, "first");
		Thread.sleep(3000);
	}

	@AfterClass
	public void afterClass() {
	}

}
