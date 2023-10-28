package n1Exercici1;

import java.util.ArrayList;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Month> listMonths=new ArrayList<Month>();
		listMonths.add(new Month("Enero"));
		listMonths.add(new Month("Febrero"));
		listMonths.add(new Month("Marzo"));
		listMonths.add(new Month("Abril"));
		listMonths.add(new Month("Mayo"));
		listMonths.add(new Month("Junio"));
		listMonths.add(new Month("Julio"));
		listMonths.add(new Month("Septiembre"));
		listMonths.add(new Month("Octubre"));
		listMonths.add(new Month("Noviembre"));
		listMonths.add(new Month("Diciembre"));
		
		Month month8=new Month("Agosto");
		
		for (Month month : listMonths) {
			System.out.print("\t"+ month.name);
		}
		
		listMonths.add(7, month8);
		System.out.println("");
		for (Month month : listMonths) {
			System.out.print("\t"+month.name);
		}
	
	}

	private String name;
	
	public Month (String name) {
		this.name=name;
	}
	
	
	
}
