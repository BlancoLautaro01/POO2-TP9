package videojuego;

public class Videojuego {

	private Estado estado = new Apagado();
	private int fichas = 0;
	
	//Getters y Setters
	public void setEstado(Estado e) {
		this.estado = e;
	}
	
	public Estado getEstado() {
		return this.estado;
	}
	
	public void setFichas(int n) {
		this.fichas = n;
	}
	
	public int getFichas() {
		return this.fichas;
	}
	
	//Implementacion
	public void ejecutar() {
		this.getEstado().ejecutar(this);
	}
	
	public void cargarFicha() {
		this.fichas++;
		if(this.fichas == 1) {
			Estado ficha = new ModoSolo();
			this.setEstado(ficha);
		} else {
			Estado fichas = new ModoMultijugador();
			this.setEstado(fichas);
		}
	}
	
	public void terminarJuego() {
		Estado apagado = new Apagado();
		this.estado = apagado;
	}
}
