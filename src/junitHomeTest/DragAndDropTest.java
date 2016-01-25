package junitHomeTest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.WebDriverExample;

public class DragAndDropTest {

	private static WebDriver driver = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new WebDriverExample().getWebdriver();
	}


	@Test
	public void test() {
		driver.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
		WebDriverExample.sleep(3000);
		
		WebElement ele1 = driver.findElement(By.id("dragdiv"));
		
		WebElement ele2 = driver.findElement(By.id("dropdiv"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(ele1, ele2).build().perform();

	}

}
