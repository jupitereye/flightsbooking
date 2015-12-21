package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPageFactory {
	WebDriver driver;

	@FindBy(id = "header-history")
	WebElement headerHistory;
	
	@FindBy(id = "tab-flight-tab")
	WebElement flightsTab;

	@FindBy(id = "flight-type-roundtrip-label")
	WebElement roundTrip;

	@FindBy(id = "flight-type-one-way-label")
	WebElement oneWay;

	@FindBy(id = "flight-type-multi-dest-label")
	WebElement multipleDestinations;

	@FindBy(id = "flight-origin")
	WebElement originCity;

	@FindBy(id = "flight-destination")
	WebElement destinationCity;

	@FindBy(id = "flight-departing")
	WebElement departureDate;

	@FindBy(id = "flight-returning")
	WebElement returtDate;

	@FindBy(id = "search-button")
	WebElement searchButton;


	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	public void clickFlightsTab() {
		headerHistory.click();
		flightsTab.click();
	}
	
	public void clickroundTrip() {
		roundTrip.click();
	}
	
	public void clickoneWay() {
		oneWay.click();
	}
	
	public void clickmultipledestinations() {
		multipleDestinations.click();
	}
	
	public void setOriginCity(String origin) {
		originCity.sendKeys(origin);
	}
	
	public void setDestinationCity(String destination) {
		destinationCity.sendKeys(destination);
	}
	
	public void setDepartureDate(String departing) {
		departureDate.sendKeys(departing);
	}
	
	public void setReturnDate(String returning) {
		returtDate.sendKeys(returning);
	}
	
	public void clicksearchButton() {
		searchButton.click();
	}
	
}




