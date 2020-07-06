package encriptacion;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncriptarVocalesTest {
	
	String texto1 = "trenvia";
	String texto2 = "encriptar estas palabras";
	EncriptarVocales obj = new EncriptarVocales();
	
	@Test
	public void testEncriptacionVocales1Palabra() {
		
		assertEquals(texto1, "trenvia");
		
		texto1 = obj.encriptar(texto1);
		assertEquals(texto1, "trinvoe");
		
		texto1 = obj.desencriptar(texto1);
		assertEquals(texto1, "trenvia");
	}
	
	@Test
	public void testEncriptacionNaive3Palabras() {
		
		assertEquals(texto2, "encriptar estas palabras");
		
		texto2 = obj.encriptar(texto2);
		assertEquals(texto2, "incropter istes pelebres");
		
		texto2 = obj.desencriptar(texto2);
		assertEquals(texto2, "encriptar estas palabras");
		
	}	
}