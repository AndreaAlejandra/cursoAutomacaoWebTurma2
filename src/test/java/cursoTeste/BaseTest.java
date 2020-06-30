package cursoTeste;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
	
	
	WebDriver driver;
	
	@Before
	public void abreNavegador() {
				
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-debugging-port=9222");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://lojaexemplod.lojablindada.com/");			
		
	}
	
	@After
	
	public void fechaNavegador() {		
		driver.quit();
	}

}
