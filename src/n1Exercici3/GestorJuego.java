package n1Exercici3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;

public class GestorJuego {

	public void iniciar() {

		Player player = new Player(registroPlayer());
		Juego juego = new Juego();

		FileReader lectorCountries = juego.leerCountriesCapitales();
		HashMap<String, String> listadoPaisCapitales = juego.cargarCountriesCapitales(lectorCountries);
		List<Integer> listPosiciones = juego
				.crearlistadoPosiciones(juego.cargarCountriesCapitales(juego.leerCountriesCapitales()));
		player.setPuntuacion(juego.jugar(listPosiciones, listadoPaisCapitales));
		File clasificacion = new File("src/n1Exercici3/clasificacion.txt");
		FileWriter clasificacionWriter = juego.crearArchivoClasificacion(clasificacion);
		juego.registrarResultado(clasificacionWriter, player);
		juego.mostrarResultado(lectorCountries, clasificacion, player);

	}

	public String registroPlayer() {
		String name = null;
		try {
			name = Entrada.llegirString("Nombre del jugador: ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return name;
	}

}