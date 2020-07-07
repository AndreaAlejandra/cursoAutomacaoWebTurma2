package Inicial;

import java.sql.Driver;

import javax.print.DocFlavor.BYTE_ARRAY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cursoTeste.driver;

public class InicialPage {
	String elPesquisa = "Search";
	String elTituloLivro = "//h2/a";		
	
	public void setPesquisa(CharSequence... valor) {
		WebElement pesquisa = driver.getDriver().findElement(By.id(elPesquisa));
		pesquisa.sendKeys(valor);
		
	}
	public String getTituloLivro() {
	WebElement tituloLivro = Driver.getDriver().findElement(By.xpath(elTituloLivro));
	String livro = tituloLivro.getText();
	return livro;
	}
	
	/*public String getPreco() {
		WebElement preco = Driver.getDriver().findElement(By.)
	}*/
	

}
