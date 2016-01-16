package junitHomeTest;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import util.WebDriverExample;


public class JunitTest1 {
	public static WebDriver webDriver;
	@BeforeClass
	public static void beforeClass(){
		JunitTest1.webDriver= new WebDriverExample().getWebdriver();
		
		
		
	}
	
	@AfterClass
	public static void afterClasss(){
		new WebDriverExample().closeWebDriver(JunitTest1.webDriver);
		
	}
	@Before
	public void beforeTest(){
		System.out.println("got here");
	}
	
	@After
	
	public void afterTest(){
		System.out.println("leave here");
		
	}
	
	@Test
	public void testOne(){
		Assert.assertTrue(true);
		
		
	}
	
	@Test
	public void testTwo(){
		Assert.assertTrue(false);
	}
	
}
