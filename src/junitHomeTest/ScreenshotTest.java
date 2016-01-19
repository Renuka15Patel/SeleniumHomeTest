package junitHomeTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import util.Constants;
import util.WebDriverExample;

public class ScreenshotTest {

private static WebDriver driver = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new WebDriverExample().getWebdriver();
	}
	
	
	@Test
	public void test() {
		driver.get(Constants.GOOGLE_URL);
		
		WebDriverExample.sleep(3000);
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("screenshot.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
