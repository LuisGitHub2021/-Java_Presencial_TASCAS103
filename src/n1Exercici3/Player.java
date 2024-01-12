package n1Exercici3;

public class Player {

	private String name;
	private int puntuacion;

	public Player(String name) {

		this.name = name;

	}

	// getters & setters
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getName() {
		return name;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

}