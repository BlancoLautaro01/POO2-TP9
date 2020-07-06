package encriptacion;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncriptacionNumericaTest {

	String texto1 = "equisde";
	String texto2 = "equisde otra vez";
	EncriptacionNumerica obj = new EncriptacionNumerica();
		
	@Test
	public void testEncriptacionNumerica1Palabra() {
			
		assertEquals(texto1, "equisde");
			
		texto1 = obj.encriptar(texto1);
		assertEquals(texto1, "5,17,21,9,19,4,5");
			
		texto1 = obj.desencriptar(texto1);
		assertEquals(texto1, "equisde");
			
	}
	
	@Test
	public void testEncriptacionNumerica3Palabras() {
			
		assertEquals(texto2, "equisde otra vez");
			
		texto2 = obj.encriptar(texto2);
		assertEquals(texto2, "5,17,21,9,19,4,5, ,15,20,18,1, ,22,5,26");
			
		texto2 = obj.desencriptar(texto2);
		assertEquals(texto2, "equisde otra vez");
			
	}
}