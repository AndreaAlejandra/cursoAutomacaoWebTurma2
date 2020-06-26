package cursoTeste;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LojaTeste {
	
	WebDriver driver;
	public void abreNavegador() {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-debugging-port=9222");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://lojaexemplod.lojablindada.com/");		
		
	}
	
	public void fechaNavegador() {		
		driver.quit();
	}
	
	@Test
	public void realizaPesquisa() {
		abreNavegador();
		WebElement pesquisa = driver.findElement(By.id("search"));
		pesquisa.sendKeys("fortaleza digital", Keys.ENTER);
		
	}
	

}
