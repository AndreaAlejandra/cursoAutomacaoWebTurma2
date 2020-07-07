package cursoTeste;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class driver {

	public static WebDriver driver;
	
	@Before
	public static void abreNavegador(String url) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
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
	
	
	
}
