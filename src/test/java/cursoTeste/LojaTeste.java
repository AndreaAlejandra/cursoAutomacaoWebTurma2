package cursoTeste;

//import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Inicial.InicialPage;
import core.Driver;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.List;

public class LojaTeste extends BaseTest {
	InicialPage inicialPage = new InicialPage();

	@Test
	public void testPesquisaLivro() {
		Driver.setUrl("https://lojaexemplod.lojablindada.com/");
		inicialPage.setPesquisa("fortaleza digital", Keys.ENTER);
		String livro = inicialPage.getTituloLivro();
		Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
		// Thread.correntThread(.sleep(5000);
		WebElement elPreco = Driver.getDriver().findElement(By.cssSelector("#product-price-44 > span"));
		String preco = elPreco.getText();
		Assert.assertEquals("R$519,90", preco);

	}

	@Test
	public void testPesquisaLivro_AssertThat() {
		Driver.setUrl("https://lojaexemplod.lojablindada.com/");
		inicialPage.setPesquisa("fortaleza digital", Keys.ENTER);
		String livro = inicialPage.getTituloLivro();
		Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
		// Thread.correntThread(.sleep(5000);
		String preco = inicialPage.getPreco();		
		assertThat("R$519,90", is(preco));

	}

	@Test
	public void testClickLista() {
		Driver.setUrl("https://lojaexemplod.lojablindada.com/");
		// ul.products-grid > li
		inicialPage.setPesquisa("html", Keys.ENTER);
		String preco = inicialPage.getPrecoLista();
		assertThat("R$444,50", is(preco));

		
			}

		

	}


