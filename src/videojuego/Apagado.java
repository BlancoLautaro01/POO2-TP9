package videojuego;

public class Apagado implements Estado {

	@Override
	public void ejecutar(Videojuego videojuego) {
		
		Estado prendido = new PrendidoSinFichas();
		videojuego.setEstado(prendido);
	}
}
