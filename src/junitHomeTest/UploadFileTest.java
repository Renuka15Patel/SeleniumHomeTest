package junitHomeTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Constants;
import util.WebDriverExample;

public class UploadFileTest {
	static WebDriver driver = null;

	@BeforeClass
	public static void beforeClass() {
		driver = new WebDriverExample().getWebdriver();
		driver.get(Constants.UPLOAD_URL);

	}

	//@AfterClass
	public static void closeBrowser() {
		WebDriverExample webDriverExample = new WebDriverExample();
		webDriverExample.closeWebDriver(driver);
	}
	//@After
	public void sleep() {
		WebDriverExample.sleep(3000);

	}
	//@Test
	public void fillElement(){
		
	}

	//@Test
	public void enableElement() {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		String toEnable = "document.getElementsByName('fileData')[0].removeAttribute('disabled','');";
		exe.executeScript(toEnable);
		WebDriverExample.sleep(3000);
	}

	//@Test
	public void uploadfile() {

		WebElement element = driver.findElement(By.id("fileData"));
		element.sendKeys("/Users/manisa/Desktop/Manisha Prajapati Resume.docx");
	}
	
	@Test
	public void uploadTest(){
		driver.get(Constants.TEST_URL);
		WebDriverExample.sleep(3000);
		WebElement ele = driver.findElement(By.name("img"));
		ele.sendKeys("/Users/manisa/Desktop/Manisha Prajapati Resume.docx");
		
	}

}
