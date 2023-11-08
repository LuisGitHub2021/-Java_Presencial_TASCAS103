package n2Exercici2;

import java.util.Comparator;

public class clasificacionPuntuacionAscendente implements Comparator<Restaurant> {

	@Override
	public int compare(Restaurant r1, Restaurant r2) {
		return r1.getPuntuacion() - r2.getPuntuacion();
	}

}