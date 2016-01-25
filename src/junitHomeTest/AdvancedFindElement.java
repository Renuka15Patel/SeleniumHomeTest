package junitHomeTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Constants;
import util.WebDriverExample;

public class AdvancedFindElement {

	public static WebDriver webDriver;
	@BeforeClass
	public static void beforeClass(){
		webDriver= new WebDriverExample().getWebdriver();
		
	}

	@Test
	public void test() {
		webDriver.get(Constants.FOLLOWING_PRECDING_URL);
		WebDriverExample.sleep(2000);
		webDriver.findElement(By.xpath("//td[contains(text(), 'Cat')]/preceding::input[1]")).click();
		webDriver.findElement(By.xpath("//td[contains(text(), 'Cat')]/following::input[2]")).click();
		//webDriver.findElement(By.xpath("//td[contains(text(), 'Dog')]/following::input[1]")).click();
	}

}
