package n1Exercici3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Juego {

	public FileReader leerCountriesCapitales() {

		FileReader lectorCountries = null;

		try {
			File countries = new File("src/n1Exercici3/countries.txt");
			lectorCountries = new FileReader(countries);
		} catch (FileNotFoundException e) {
			System.out.println("No podemos acceder al archivo de paises y capitales, dirección incorrecta");
		}

		return lectorCountries;

	}

	public HashMap<String, String> cargarCountriesCapitales(FileReader lectorCountries) {

		BufferedReader almacenCountries = new BufferedReader(lectorCountries);

		HashMap<String, String> listadoPaisCapitales = new HashMap<String, String>();

		try {
			String todoCountriesString = almacenCountries.readLine();

			while (todoCountriesString != null) {

				// array donde poner las diferentes subcadenas del String principal
				String[] paisCapital = todoCountriesString.split(" ");

				// añadir al HashMap los elementos
				listadoPaisCapitales.put(paisCapital[0], paisCapital[1]);

				todoCountriesString = almacenCountries.readLine();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		try {
			// cerramos el lector
			if (null != lectorCountries)
				lectorCountries.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return listadoPaisCapitales;

	}

	public List<Integer> crearlistadoPosiciones(HashMap<String, String> listadoPaisCapitales) {

		List<Integer> listPosiciones = new ArrayList<Integer>();
		for (int i = 0; i < listadoPaisCapitales.size(); i++) {
			listPosiciones.add(i);
		}

		return listPosiciones;

	}

	public int jugar(List<Integer> listPosiciones, HashMap<String, String> listadoPaisCapitales) {
		int numero;
		Object pais = null;
		String candidatoRespuesta = null;
		int punts = 0;

		for (int i = 0; i < 10; i++) {

			Collections.shuffle(listPosiciones);
			numero = listPosiciones.get(0);
			listPosiciones.remove(0);

			pais = listadoPaisCapitales.keySet().toArray()[numero];
			System.out.println(pais);

			// solicitar respuesta OK
			try {
				candidatoRespuesta = Entrada.llegirString("Capital:");
			} catch (Exception e) {

				e.printStackTrace();
			}

			// valorar repuesta y mostrar resultado
			if (listadoPaisCapitales.get(pais).equalsIgnoreCase(candidatoRespuesta)) {
				punts++;

				System.out.println("Has conseguido: " + punts + " pt");

			} else {
				System.out.println("La respuesta correcta es: " + listadoPaisCapitales.get(pais));

			}

		}

		return punts;

	}

	public FileWriter crearArchivoClasificacion(File clasificacion) {

		FileWriter clasificacionWriter = null;

		try {
			clasificacionWriter = new FileWriter(clasificacion.getAbsoluteFile(), true);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return clasificacionWriter;

	}

	public void registrarResultado(FileWriter clasificacionWriter, Player player) {

		PrintWriter escribirClasificacion = new PrintWriter(clasificacionWriter);

		// Esta es la linea que escribe en el archivo
		escribirClasificacion.println(player.getName() + " " + player.getPuntuacion() + "pt");
		try {
			// cerramos el archivo
			if (null != clasificacionWriter)
				clasificacionWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void mostrarResultado(FileReader lectorCountries, File clasificacion, Player player) {
		if (lectorCountries != null && clasificacion != null) {
			System.out.println("Total: " + player.getName() + " " + player.getPuntuacion() + "pt");
		}
	}
}