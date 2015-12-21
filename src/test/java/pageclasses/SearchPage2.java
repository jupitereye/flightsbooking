package pageclasses;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;

public class SearchPage2 {
	public static WebElement element = null;
	static Logger log = Logger.getLogger(SearchPage2.class);
	

	public static void navigateToFlightsTab(WebDriver driver) {
		driver.findElement(By.id("header-history")).click();
		element = driver.findElement(By.id("tab-flight-tab"));
		element.click();
		log.info("Navigate to flights tab");
	}
}
