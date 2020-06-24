package MediaTeste;

import org.junit.Test;

import media.CalculoMedia;

import org.junit.Assert;

public class Media {
	@Test
	public void validaReprovado(){
		CalculoMedia calculomedia = new CalculoMedia(5,5);		 
		String situacao = calculomedia.getSituacao();
		Assert.assertEquals("Reprovado", situacao);
	}
	
	@Test
	public void validaAprovado() {
		CalculoMedia calculoMedia = new CalculoMedia();
		calculoMedia.setNota1(7);
		calculoMedia.setNota2(7);
		Assert.assertEquals("Aprovado", calculoMedia.getSituacao());
		
		
	}
	
	@Test
	public void assertTrue() {
		boolean x = true;
		
		Assert.assertTrue(x);
	}
	
	@Test
	public void erro() throws Exception {
		throw new Exception("Simulação de erro!");
		
		
	}
	
	

}
