package Inicial;

import java.util.List;

import org.openqa.selenium.WebElement;

import Map.InicialMap;

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
		List<WebElement> livros = inicialMap.livros.getElements();
		for (WebElement elLivro : livros) {
			inicialMap.tituloLivroLista.setWebElement(elLivro);			
			String titulo = inicialMap.tituloLivroLista.getText();
			if (titulo.contains("Ajax com java")) {
				inicialMap.precoLista.setWebElement(elLivro);
				
				return inicialMap.precoLista.getText();
				
			}
		}
		
		return null;
	}

}
