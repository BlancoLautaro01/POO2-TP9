package encriptacion;

public class EncriptarVocales implements Encriptacion {

	public String encriptar(String texto) {
		
		char x;
		String textoEncriptado = "";
		for (int i = 0; i < texto.length(); i++) {
			x = this.switchearCharEncriptacion(texto.charAt(i));
			textoEncriptado += x;
		}
		return textoEncriptado;
	}
	
	public String desencriptar(String texto) {
		
		char x;
		String textoDesncriptado = "";
		for (int i = 0; i < texto.length(); i++) {
			x = this.switchearCharDesencriptacion(texto.charAt(i));
			textoDesncriptado += x;
		}		
		return textoDesncriptado;
	}
	
	private char switchearCharEncriptacion(char x) {
		char res = x;
		
		switch(x) {
		case 'a':
			res = 'e';
			break;
		case 'e':
			res = 'i';
			break;
		case 'i':
			res = 'o';
			break;
		case 'o':
			res = 'u';
			break;
		case 'u':
			res = 'a';
			break;
		}
		return res;
	}
	
	private char switchearCharDesencriptacion(char x) {
		char res = x;
		
		switch(x) {
		case 'a':
			res = 'u';
			break;
		case 'e':
			res = 'a';
			break;
		case 'i':
			res = 'e';
			break;
		case 'o':
			res = 'i';
			break;
		case 'u':
			res = 'o';
			break;
		}
		return res;
	}
}
