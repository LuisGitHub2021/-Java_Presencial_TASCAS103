package n1Exercici3;

public class App {

	public static void main(String[] args) {

		System.out.println(
				"Bienvenido al Juego de adivinar capitales! "
				+ "*contesta en inglés y en caso de capitales de más de una palabra con guion bajo para unirlas");
		boolean jugar = true;
		while (jugar) {

			Jugador.iniciar();
			jugar = Entrada.llegirBoolean("Quieres otra partida? s/n");
		}
	}

}