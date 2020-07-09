package core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

	private static WebDriver driver;
	
	@Before
	public static void abreNavegador(String url) {
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		//WebDriver Driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-debugging-port=9222");
		WebDriver driver = new ChromeDriver(options);		
		driver.manage().window().maximize();
		driver.get(url);			
		
	}
	
	@After
	public static void fechaNavegador() {
		
		driver.quit();
		
}
	public static WebDriver getDriver() {
	return driver;		
	}
	
	public static void setUrl(String url) {
		driver.get(url);
	}
	
	
	
}
