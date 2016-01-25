package junitHomeTest;

import org.junit.runner.Description;
import org.junit.rules.TestWatcher;
import org.openqa.selenium.WebDriver;

public class TestListener extends TestWatcher{
	
	private WebDriver driver;
	private static int i = 0;
	
	public TestListener(WebDriver driver){
		this.driver = driver;
	}
	
	@Override
	protected void failed(Throwable e, Description desc){
		System.out.println("Error occured"+i);
		i++;
	}

}
