package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverExample {
	public WebDriver getWebdriver() {
		WebDriver driver = new FirefoxDriver();
		driver.get(Constants.TEST_URL);
//		try {
//			Thread.sleep(10000);
//		} catch (Exception ex) {
//
//		}

		return driver;
	}

	public WebDriver getChromeWebDriver() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/manisa/Documents/workspace/SeleniumHomeTest/lib/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.facebook.com");

		return driver;
	}

	public void closeWebDriver(WebDriver driver) {
		driver.close();
		driver.quit();
	}
	public static void sleep(long millisec){
		try {
			Thread.sleep(millisec);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
	}
}
