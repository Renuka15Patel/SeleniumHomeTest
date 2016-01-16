package test;



import org.openqa.selenium.WebDriver;

import util.Constants;
import util.WebDriverExample;


public class SeleniumMain {

	public static void main(String[] args) {
		WebDriverExample webDriverExample = new WebDriverExample();
		WebDriver driver = webDriverExample.getWebdriver();
		driver.get(Constants.URL);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webDriverExample.closeWebDriver(driver);
		
	}

}
