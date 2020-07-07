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
				
		//"https://lojaexemplod.lojablindada.com/"
		cursoTeste.driver.abreNavegador("https://lojaexemplod.lojablindada.com/");		
		
	}
	
	@After
	
	public void fechaNavegador() {		
		driver.fechaNavegador();
	}

}
