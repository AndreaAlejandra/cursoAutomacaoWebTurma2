package cursoTeste;



import org.junit.After;
import org.junit.Before;
import core.Driver;



public class BaseTest {
	
	
	
	@Before
	public void abreNavegador() {		
			
		
	}
	
	@After
	
	public void fechaNavegador() {		
		Driver.fechaNavegador();
	}

}
