package junitHomeTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Constants;
import util.WebDriverExample;

public class JavaScriptTest {
	static WebDriver driver = null;

	@BeforeClass
	public static void beforeClass() {
		driver = new WebDriverExample().getWebdriver();
		driver.get(Constants.TEST_URL);
	}

	@AfterClass
	public static void closeBrowser() {
		WebDriverExample webDriverExample = new WebDriverExample();
		webDriverExample.closeWebDriver(driver);
	}

	//@Test
	public void findAlert() {
		WebElement alertElement = driver.findElement(By
				.xpath("//input[@value='Show Me Alert']"));
		alertElement.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.getText();
		WebDriverExample.sleep(2000);
		alert1.dismiss();

		WebElement conformationElement = driver
				.findElement(By
						.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/button[1]"));
		conformationElement.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.getText();
		WebDriverExample.sleep(2000);
		alert2.dismiss();

		WebElement promptElement = driver
				.findElement(By
						.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/button[2]"));
		promptElement.click();

		Alert alert3 = driver.switchTo().alert();
		alert3.getText();
		WebDriverExample.sleep(2000);
		alert3.dismiss();
	}
	@Ignore
		public void test2(){
			
			WebElement ele2 = driver.findElement(By.tagName("button"));
			ele2.click();
			WebDriverExample.sleep(3000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
			alert.sendKeys("fdnhjvdbfj");
			
			System.out.println(driver.getPageSource().contains("You pressed OK!"));
		}
		
	@Ignore
	public void myOwnAlert(){
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("alert('This is My own alert.')");
		WebDriverExample.sleep(3000);
	}
	
	@Test
	public void disableElement(){
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		String toDisable = "document.getElementsByName('fname')[0].setAttribute('disabled','');";
		exe.executeScript(toDisable);
		WebDriverExample.sleep(3000);
	}
	
	@Test
	public void enableElement(){
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		String toEnable = "document.getElementsByName('lname')[0].removeAttribute('disabled','');";
		exe.executeScript(toEnable);
		WebDriverExample.sleep(3000);
		
		WebElement lastNameElement = driver.findElement(By.id("u_0_3"));
		lastNameElement.sendKeys("Prajapati");
	}
}
