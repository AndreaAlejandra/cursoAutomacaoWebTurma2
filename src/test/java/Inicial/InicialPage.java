package Inicial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Map.InicialMap;
import core.Driver;

public class InicialPage {

	InicialMap inicialMap = new InicialMap();
	String elLivros = "ul.products-grid > li";
	String elPrecoLista = "span.price";
	String elTituloLivrosLista = "h2 > a";	

	public void setPesquisa(CharSequence... valor) {		
		inicialMap.pesquisa.sendkeys(valor);

	}

	public String getTituloLivro() {
		String livro = inicialMap.tituloLivro.getText();
		return livro;
	}

	public String getPreco() {
		return inicialMap.preco.getText();
	}

	public String getPrecoLista() {
		List<WebElement> livros = Driver.getDriver().findElements(By.cssSelector(elLivros));
		for (WebElement elLivro : livros) {
			WebElement elTituloLivro = elLivro.findElement(By.cssSelector(elTituloLivrosLista));
			String titulo = elTituloLivro.getText();
			if (titulo.contains("Ajasx com java")) {
				WebElement preco = elLivro.findElement(By.cssSelector("elPrecoLista"));
				return preco.getText();
				
			}
		}
		
		return null;
	}

}
