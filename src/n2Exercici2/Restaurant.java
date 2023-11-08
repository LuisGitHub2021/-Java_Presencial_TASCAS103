package n2Exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Restaurant implements Comparable<Restaurant> {

	public static void main(String[] args) {

		Restaurant r1 = new Restaurant("Domani", 5);
		Restaurant r2 = new Restaurant("Matino", 2);
		Restaurant r3 = new Restaurant("Cera", 5);
		Restaurant r4 = new Restaurant("Notte", 8);
		Restaurant r5 = new Restaurant("Domani", 5);
		Restaurant r6 = new Restaurant("Matino", 6);

		// La interface SET NO PERMITE DUPLICADOS
		// en concesuencia el método equals y hashcode debemos sobre escribirlos con
		// nuesta clase
		// para ver si son o no iguales ya que java no compara nuestra clase si no las
		// clases ya definidadas por Java
		// HashSet no permitirá entrar en la coleccion al objeto duplicado
		// HashSet no permite ordenarla tenemos que ir vía otra collection para
		// ordenarla

		Set<Restaurant> puntacionRestaurantes = new HashSet<Restaurant>();

		puntacionRestaurantes.add(r1);
		puntacionRestaurantes.add(r2);
		puntacionRestaurantes.add(r3);
		puntacionRestaurantes.add(r4);
		puntacionRestaurantes.add(r5);
		puntacionRestaurantes.add(r6);

		System.out.println("Con el HashCode vemos si son el mismo objeto");
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		System.out.println(r3.hashCode());
		System.out.println(r4.hashCode());
		System.out.println(r5.hashCode());
		System.out.println(r6.hashCode());

		System.out.println();
		for (Restaurant restaurant : puntacionRestaurantes) {
			System.out.println(restaurant.getNom() + " " + restaurant.getPuntuacion());
		}

		System.out.println("\nLa List restaurantes");
		// HashSet no permite ordenarla tenemos que ir vía otra collection para
		// ordenarla
		List<Restaurant> restaurantes = new ArrayList<Restaurant>(puntacionRestaurantes);
		for (Restaurant restaurant : restaurantes) {
			System.out.println(restaurant);
		}

		System.out.println("\nOrdenado alfabeticamente por el nombre");
		Collections.sort(restaurantes);
		for (Restaurant restaurant : restaurantes) {
			System.out.println(restaurant);
		}

		System.out.println("\nOrdenado por puntuacion ascendente");
		Collections.sort(restaurantes, new clasificacionPuntuacionAscendente());
		for (Restaurant restaurant : restaurantes) {
			System.out.println(restaurant);
		}

	}

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

	@Override
	public int compareTo(Restaurant restaurant) {

		return this.nom.compareTo(restaurant.nom);
	}

}