package junitHomeTest;

import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Constants;
import util.WebDriverExample;

public class MultiWindowTest {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		driver = new WebDriverExample().getWebdriver();
		driver.get(Constants.WELLS_URL);

	}

	@After
	public void sleep() {
		WebDriverExample.sleep(3000);

	}

	@AfterClass
	public static void afterClass() {
		WebDriverExample webDriverExample = new WebDriverExample();
		webDriverExample.closeWebDriver(driver);
	}

	@Test
	public void parentWindow() {
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("PRIVACY, Cookies, Security & Legal")).click();
		
		Set<String> handles = driver.getWindowHandles();
		for (String childWindow : handles) {
			
			driver.switchTo().window(childWindow);
		}
		
		
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
	}
}
