package junitHomeTest;

import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.Constants;
import util.WebDriverExample;

public class WebElementTest {

	public static WebDriver webDriver;

	@BeforeClass
	public static void beforeClass() {
		webDriver = new WebDriverExample().getWebdriver();
	}

	@After
	public void afterTest() {
		WebDriverExample.sleep(2000);
	}

	@AfterClass
	public static void closeBrowser() {
		WebDriverExample webDriverExample = new WebDriverExample();
		webDriverExample.closeWebDriver(webDriver);
	}

	@Test
	public void testFillSignUp() {
		webDriver.get(Constants.URL);

		WebElement firstNameElement = webDriver.findElement(By.id("u_0_1"));
		//firstNameElement.sendKeys("Manisha");
		this.fillInputText(firstNameElement, "Manisha");
		WebElement lastNameElement = webDriver.findElement(By.id("u_0_3"));
		lastNameElement.sendKeys("Prajapati");
		WebElement emailOrPhoneElement = webDriver.findElement(By.id("u_0_5"));
		emailOrPhoneElement.sendKeys("maaneesaa2@email.com");
		WebElement reEnterEmailElement = webDriver.findElement(By.id("u_0_8"));
		reEnterEmailElement.sendKeys("maaneesaa2@email.com");
		WebElement passwordElement = webDriver.findElement(By.id("u_0_a"));
		passwordElement.sendKeys("Manisha123");
		List<WebElement> list =  webDriver.findElements(By.tagName("input"));
		Iterator<WebElement> iter = list.iterator();
		while(iter.hasNext()){
			WebElement ele = (WebElement)iter.next();
			ele.clear();
		}
		WebElement ele = webDriver.findElement(By.name("manisha prajapati"));
		System.out.println(ele.isEnabled());
		Select sel = new Select(webDriver.findElement(By.name("year")));
		sel.selectByValue("2016");
		WebElement monthElement = webDriver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/form/div[1]/div[5]/div[2]/span/span/select[1]"));
		monthElement.sendKeys("");
	}
	
	public void fillInputText(WebElement ele, String value){
		ele.sendKeys(value);
	}
	
	public void clearField(WebElement ele){
		ele.clear();
		
	}

	@Test
	public void clickButton() {

		WebElement signUpElement = webDriver.findElement(By.id("u_0_i"));
		signUpElement.click();
	}

	@Test
	public void testRemoveSignUp() {
		WebElement firstNameElement = webDriver.findElement(By.id("u_0_1"));
		firstNameElement.clear();
		WebElement lastNameElement = webDriver.findElement(By.id("u_0_3"));
		lastNameElement.clear();
		WebElement emailOrPhoneElement = webDriver.findElement(By.id("u_0_5"));
		emailOrPhoneElement.clear();
		WebElement reEnterEmailElement = webDriver.findElement(By.id("u_0_8"));
		reEnterEmailElement.clear();
		WebElement passwordElement = webDriver.findElement(By.id("u_0_a"));
		passwordElement.clear();
	}
	// @Test
	// public void testLink(){
	// WebElement lookForElement1 =
	// webDriver.findElement(By.linkText("Privacy"));
	// lookForElement1.click();
	//
	// WebElement lookForElement2 =
	// webDriver.findElement(By.partialLinkText("Create"));
	// lookForElement2.click();
	// }
}
