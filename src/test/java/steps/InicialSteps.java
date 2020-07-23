package steps;

import core.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class InicialSteps {
	@Dado("Que estou na pagina loja virtual")
	public void queEstouNaPaginaLojavirtual() {
		Driver.setUrl("http.//www.lojaexemplodelivros.com.br/");
	}
	
	@Quando("Realizo a busca do livro {String}")
		public void realizoABuscaDoLivro(String titulo) {
			throw new io.cucumber.java.PendingException();
		}
	
	@Entao("valido o titulo sendo {String}")
	public void validoOTituloSendo(String titulo) {
		throw new io.cucumber.java.PendingException();
	}
	
	@Entao("o preco sendo{String}")
	public void oPrecoSendo(String preco) {
		throw new io.cucumber.java.PendingException();
	}
	
	@Quando("clico no livro pesquisado")
	public void clicoNoLivroPesquisado() {
		throw new io.cucumber.java.PendingException();
	}	
	
	@Quando("confirmo o titulo sendo {string} e o preco sendo {string}")
	public void confirmoOTituloSendoEOPrecoSendo(String titulo, String preco) {
		throw new io.cucumber.java.PendingException();
	}
}

