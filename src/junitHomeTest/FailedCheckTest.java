package junitHomeTest;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Constants;
import util.WebDriverExample;

public class FailedCheckTest {
	static WebDriver driver = null;
	@Rule
	public TestListener listener = new TestListener(driver);

	@BeforeClass
	public static void beforeClass() {
		driver = new WebDriverExample().getWebdriver();
	}

	@Test
	public void test1() {
		driver.get(Constants.GOOGLE_URL);
		WebDriverExample.sleep(3000);

		driver.findElement(By.linkText("njnjnjn")).click();
	}

	@Test
	public void test2() {
		driver.get(Constants.URL);
		WebDriverExample.sleep(3000);
		driver.findElement(By.linkText("JJJHVGF")).click();
	}

}
