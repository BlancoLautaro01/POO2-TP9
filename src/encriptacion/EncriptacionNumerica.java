package encriptacion;

import java.util.ArrayList;

public class EncriptacionNumerica implements Encriptacion {

	public String encriptar(String texto) {
		
		String textoEncriptado = "";
		for (int i = 0; i < texto.length(); i++) {
			textoEncriptado += this.switchearCharEncriptacion(texto.toLowerCase().charAt(i));
			if(i < texto.length()-1) {
				textoEncriptado += ",";
			}
		}
		return textoEncriptado;
	}
	
	public String desencriptar(String texto) {
		
		String textoDesencriptado = "";
		String numero = "";
		for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ',') {
            	textoDesencriptado += this.switchearDesencriptacion(numero);
            	numero = "";
            } else if (i == texto.length()-1) {
            	numero += (texto.charAt(i));
            	textoDesencriptado += this.switchearDesencriptacion(numero);
            } else {
            	numero += (texto.charAt(i));
            }
        }
		return textoDesencriptado;
	}
	
	private String switchearCharEncriptacion(char x) {
		String res = Character.toString(x);
		
		switch(x) {
		case 'a':
			res = "1";
			break;
		case 'b':
			res = "2";
			break;
		case 'c':
			res = "3";
			break;
		case 'd':
			res = "4";
			break;
		case 'e':
			res = "5";
			break;
		case 'f':
			res = "6";
			break;
		case 'g':
			res = "7";
			break;
		case 'h':
			res = "8";
			break;
		case 'i':
			res = "9";
			break;
		case 'j':
			res = "10";
			break;
		case 'k':
			res = "11";
			break;
		case 'l':
			res = "12";
			break;
		case 'm':
			res = "13";
			break;
		case 'n':
			res = "14";
			break;
		case 'o':
			res = "15";
			break;
		case 'p':
			res = "16";
			break;
		case 'q':
			res = "17";
			break;
		case 'r':
			res = "18";
			break;
		case 's':
			res = "19";
			break;
		case 't':
			res = "20";
			break;
		case 'u':
			res = "21";
			break;
		case 'v':
			res = "22";
			break;
		case 'w':
			res = "23";
			break;
		case 'x':
			res = "24";
			break;
		case 'y':
			res = "25";
			break;
		case 'z':
			res = "26";
			break;
		case ' ':
			res = " ";
			break;
			
		}
		return res;
	}
	
	private String switchearDesencriptacion(String x) {
		String res = x;
		
		switch(x) {
		case "1":
			res = "a";
			break;
		case "2":
			res = "b";
			break;
		case "3":
			res = "c";
			break;
		case "4":
			res = "d";
			break;
		case "5":
			res = "e";
			break;
		case "6":
			res = "f";
			break;
		case "7":
			res = "g";
			break;
		case "8":
			res = "h";
			break;
		case "9":
			res = "i";
			break;
		case "10":
			res = "j";
			break;
		case "11":
			res = "k";
			break;
		case "12":
			res = "l";
			break;
		case "13":
			res = "m";
			break;
		case "14":
			res = "n";
			break;
		case "15":
			res = "o";
			break;
		case "16":
			res = "p";
			break;
		case "17":
			res = "q";
			break;
		case "18":
			res = "r";
			break;
		case "19":
			res = "s";
			break;
		case "20":
			res = "t";
			break;
		case "21":
			res = "u";
			break;
		case "22":
			res = "v";
			break;
		case "23":
			res = "w";
			break;
		case "24":
			res = "x";
			break;
		case "25":
			res = "y";
			break;
		case "26":
			res = "z";
			break;
		}
		return res;
	}
}
