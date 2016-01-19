package junitHomeTest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Constants;
import util.WebDriverExample;

public class MouseHoverTest {

	private static WebDriver driver = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new WebDriverExample().getWebdriver();
	}

	@Test
	public void test() {
		driver.get(Constants.MOUSE_HOVER_URL);
		
		WebDriverExample.sleep(3000);
		WebElement ele = driver.findElement(By.id("menu1"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		WebDriverExample.sleep(3000);
		action.moveToElement(ele).moveToElement(driver.findElement(By.linkText("Yahoo"))).click().build().perform();
	}

}
