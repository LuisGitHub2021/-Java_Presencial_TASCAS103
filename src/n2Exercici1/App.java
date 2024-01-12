package n2Exercici1;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Restaurant r1 = new Restaurant("Domani", 5);
		Restaurant r2 = new Restaurant("Matino", 2);
		Restaurant r3 = new Restaurant("Cera", 5);
		Restaurant r4 = new Restaurant("Notte", 8);
		Restaurant r5 = new Restaurant("Domani", 5);
		Restaurant r6 = new Restaurant("Matino", 6);

		// La interface SET NO PERMITE DUPLICADOS
		// en concesuencia el método equals y hashcode debemos sobre escribirlos con
		// nuestra clase
		// para ver si son o no iguales ya que java no compara nuestra clase si no las
		// clases ya definidadas por Java
		// HashSet no permitirá entrar en la coleccion al objeto duplicado
		// HashSet no permite ordenarla, tenemos que ir vía otra collection para
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

		// HashSet no permitirá entrar en la coleccion al objeto duplicado
		// HashSet no permite ordenarla tenemos que ir vía otra collection para
		// ordenarla
		System.out.println("\nAquí se observa como no hay objeto duplicado, HashSet no lo permite");

		for (Restaurant restaurant : puntacionRestaurantes) {
			System.out.println(restaurant.getNom() + " " + restaurant.getPuntuacion());
		}

	}

}
