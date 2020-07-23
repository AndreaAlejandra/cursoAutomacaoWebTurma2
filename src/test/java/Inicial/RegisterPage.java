package Inicial;

import Map.RegisterMap;

public class RegisterPage {

	RegisterMap registerMap = new RegisterMap();
	
	String primeiroNome = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input";	
	String ultimoNome = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input";
	
	
	
	String elLivros = "ul.products-grid > li";
	String elPrecoLista = "span.price";
	String elTituloLivrosLista = "h2 > a";	
	
	public void setNome(CharSequence... valor) {		
		registerMap.nome.sendkeys(valor);

	}
	
	public void setUltimoNome(CharSequence... valor) {		
		registerMap.ultimoNome.sendkeys(valor);

	}
}
