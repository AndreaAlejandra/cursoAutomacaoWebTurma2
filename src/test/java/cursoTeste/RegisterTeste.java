package cursoTeste;

//import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Inicial.InicialPage;
import Inicial.RegisterPage;
import core.Driver;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.List;

public class RegisterTeste extends BaseTest {

		RegisterPage registerPage = new RegisterPage();
		
		@Test
		public void testeRegister() {
			Driver.setUrl("http://demo.automationtesting.in/Register.html");
			registerPage.setNome("Anderosn", Keys.ENTER);
			registerPage.setUltimoNome("Milan", Keys.ENTER);
			
			/*
			String livro = inicialPage.getTituloLivro();
			Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);			
			WebElement elPreco = Driver.getDriver().findElement(By.cssSelector("#product-price-44 > span"));
			String preco = elPreco.getText();
			Assert.assertEquals("R$519,90", preco);
			*/
		}
}
