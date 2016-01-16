package junitHomeTest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.WebDriverExample;

public class FindElementTest {
	static WebDriver driver = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new WebDriverExample().getWebdriver();
	}

	@Test
	public void test() {
//		WebElement ele = driver.findElement(By.cssSelector("input[name='firstname'][data-type='text']"));
//		ele.sendKeys("FirdstName");
//		
//		driver.findElement(By.className("inputtext")).sendKeys("NJNJNJNJNJ");
		WebElement ele = driver.findElement(By.name("lname"));
		System.out.println(ele.isEnabled());
		
		WebElement ele2 = driver.findElement(By.name("Hidden"));
		System.out.println(ele2.isDisplayed());
		System.out.println(driver.getPageSource().contains("name=\"Hidden\""));
		
		WebElement ele3 = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/form[1]/input[1]"));
		ele3.sendKeys("David");
		
		WebElement ele4 = driver.findElement(By.tagName("select"));
	}

}
