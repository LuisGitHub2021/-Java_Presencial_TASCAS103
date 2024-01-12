package n2Exercici1;

import java.util.Objects;

public class Restaurant {

	private String nom;
	private int puntuacion;

	public Restaurant(String nom, int puntuacion) {
		this.nom = nom;
		this.puntuacion = puntuacion;

	}

	public String getNom() {
		return nom;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nom, puntuacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(nom, other.nom) && puntuacion == other.puntuacion;
	}

	@Override
	public String toString() {
		return "Restaurant [nom=" + nom + ", puntuacion=" + puntuacion + "]";
	}

}