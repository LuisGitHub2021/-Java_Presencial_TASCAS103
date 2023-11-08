package n1Exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ProbandoList {

	public static void main(String[] args) {
	
		int i = 0;

		List<Integer> listaEnteros = new ArrayList<>();

		while (i <= 9) {

			listaEnteros.add(i);
			i++;
		}

		for (Integer integer : listaEnteros) {
			System.out.print("\t" + integer);
		}

		List<Integer> listaEnteros2 = new ArrayList<>();

		// puedes ubicar el iterador en la posicion final de dos maneras
		// opcion a
		ListIterator<Integer> it = listaEnteros.listIterator(listaEnteros.size());
		// opcion b
		/*
		 * while(it.hasNext()) { it.next(); }
		 */

		System.out.println();
		while (it.hasPrevious()) {
			listaEnteros2.add(it.previous());
		}
		for (Integer integer : listaEnteros2) {
			System.out.print("\t" + integer);

		}

	}

}