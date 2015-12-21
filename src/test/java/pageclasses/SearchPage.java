package pageclasses;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
	public static WebElement element = null;
	static Logger log = Logger.getLogger(SearchPage.class);

	/**
	 * Returns the flight origin text box element
	 * 
	 * @param driver
	 * @return
	 */
	public static void clearAllFields(WebDriver driver) {
		driver.findElement(By.id("flight-origin")).clear();
		driver.findElement(By.id("flight-destination")).clear();
		driver.findElement(By.id("flight-departing")).clear();
		driver.findElement(By.id("flight-returning")).clear();
	}
	
	
	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-origin"));
		log.info("Origin text box element found");
		return element;
	}
	
	public static void fillOriginTextBox(WebDriver driver, String origin) {
		element = originTextBox(driver);
		element.sendKeys(origin);
		log.info("Enter origin city as " + origin);
	}

	/**
	 * Returns the flight destination text box element
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement destinationTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-destination"));
		log.info("Destination text box element found");
		return element;
	}
	
	public static void fillDestinationTextBox(WebDriver driver, String destination) {
		element = destinationTextBox(driver);
		element.sendKeys(destination);
		log.info("Enter destination city as " + destination);
	}


	/**
	 * Returns the departure date text box element
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement departureDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-departing"));
		log.info("Departure date element found");
		return element;
	}

	public static void fillDepartureDateTextBox(WebDriver driver, String departureDate) {
		element = departureDateTextBox(driver);
		element.sendKeys(departureDate);
	}

	/**
	 * Returns the return date text box element
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement returnDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-returning"));
		log.info("Return date text box found");
		return element;
	}
	
	public static void fillReturnDateTextBox(WebDriver driver, String returnDate) {
		element = returnDateTextBox(driver);
		element.sendKeys(returnDate);
	}
	
	public static void selectFlightAdults(WebDriver driver, String numOfAdults) {
		element =driver.findElement(By.id("flight-adults"));
		element.sendKeys(numOfAdults);
	}

	/**
	 * Returns the search button box element
	 * 
	 * @param driver
	 * @return
	 */
	
	public static void clickOnAdvancedLink(WebDriver driver) {
		element=driver.findElement(By.id("advanced-options"));
		element.click();
		log.info("Clicked on advanced Options link");
	}
	
	public static void clickOnStopCheckBox(WebDriver driver) {
		element = driver.findElement((By.id("advanced-flight-nonstop")));
		element.click();
		log.info("Clicked non-stop check box");
	}
	public static void selectFlightClass(WebDriver driver, String flightClass) {
		Select options = new Select(driver.findElement(By.id("flight-advanced-preferred-class")));
		options.selectByValue(flightClass);
		log.info("Select flight class as " + flightClass);
	}
	
	public static void clickMorningFlight(WebDriver driver) {
		//WebElement element = WaitTypes.getWhenVisible(driver, By.xpath("//ul[@id='departureTimeList']//span[contains(text(), 'Morning')]//preceding-sibling::input"), 30);
		//element.click();
		log.info("Clicked Morning Time to filter the results");
	}
	
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.id("search-button"));
		return element;
	}
	
	/***
	 * Click on search button
	 * @param driver
	 *
	 */
	public static void clickOnSearchButton(WebDriver driver) {
		element =searchButton(driver);
		element.click();
	}
	/***
	 * Navigate to flights tab
	 * @param driver
	 *
	 */
	public static void navigateToFlightsTab(WebDriver driver) {
		//driver.findElement(By.id("header-history")).click();
		element = driver.findElement(By.id("tab-flight-tab"));
		element.click();
	}
}
