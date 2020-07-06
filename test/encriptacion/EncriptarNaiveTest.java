package encriptacion;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncriptarNaiveTest {

	String texto1 = "palabras a cambiar";
	String texto2 = "";
	String texto3 = "palabra";
	EncriptarNaive obj = new EncriptarNaive();
	
	@Test
	public void testEncriptacionNaive3Palabras() {
		
		assertEquals(texto1, "palabras a cambiar");
		
		texto1 = obj.encriptar(texto1);
		assertEquals(texto1, "cambiar a palabras");
		
		texto1 = obj.desencriptar(texto1);
		assertEquals(texto1, "palabras a cambiar");
		
	}	
	
	@Test
	public void testEncriptacionNaive0Palabras() {
		
		assertEquals(texto2, "");
		
		texto2 = obj.encriptar(texto2);
		assertEquals(texto2, "");
		
		texto2 = obj.desencriptar(texto2);
		assertEquals(texto2, "");
		
	}
	
	@Test
	public void testEncriptacionNaive1Palabras() {
		
		assertEquals(texto3, "palabra");
		
		texto3 = obj.encriptar(texto3);
		assertEquals(texto3, "palabra");
		
		texto3 = obj.desencriptar(texto3);
		assertEquals(texto3, "palabra");
		
	}
}
