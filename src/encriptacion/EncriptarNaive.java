package encriptacion;

import java.util.ArrayList;

public class EncriptarNaive implements Encriptacion {

	public String encriptar(String texto) {
		
		ArrayList<String> palabras = new ArrayList<String>();
		String palabraActual = "";
		for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
            	palabras.add(0, palabraActual);
            	palabraActual = "";
            } else if (i == texto.length()-1) {
            	palabraActual += (texto.charAt(i));
            	palabras.add(0, palabraActual);
            } else {
            	palabraActual += (texto.charAt(i));
            }
        }
		return this.arrayToString(palabras);
	}
	
	private String arrayToString(ArrayList<String> palabras) {

		int cantPalabras = 0;
		String resultado = "";
		for(String palabra: palabras) {
			if(cantPalabras < palabras.size()-1) {
				resultado += palabra + " ";
				cantPalabras++;
			} else {
				resultado += palabra;
			}		
		}
		return resultado;
	}
	
	public String desencriptar(String texto) {
		return this.encriptar(texto);
	}
}
