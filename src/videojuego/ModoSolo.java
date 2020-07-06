package videojuego;

public class ModoSolo implements Estado {

	@Override
	public void ejecutar(Videojuego videojuego) {
		
		System.out.print("Ejecutando modo Solitario");
	}
}
