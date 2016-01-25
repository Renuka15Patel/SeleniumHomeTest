package junitHomeTest;

import java.util.Iterator;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Constants;
import util.WebDriverExample;

public class TableTest {

private static WebDriver driver = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new WebDriverExample().getWebdriver();
	}

	@Test
	public void test() {
		driver.get(Constants.TEST_URL);
		
		WebDriverExample.sleep(2000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='post-body-2641311481947341581']/div[1]/table/tbody/tr"));
		System.out.println(rows.size());
		Iterator<WebElement> iter = rows.iterator();
		while(iter.hasNext()){
			WebElement ele = (WebElement)iter.next();
			System.out.println("Third value:"+ele.findElement(By.xpath(".//td[3]")).getText());
			System.out.println(ele.getText());
		}
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id='post-body-2641311481947341581']/div[1]/table/tbody/tr[2]/td"));
		
	}

}
