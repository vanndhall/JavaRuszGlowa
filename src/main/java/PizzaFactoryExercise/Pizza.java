package PizzaFactoryExercise;

import java.util.ArrayList;

public abstract class Pizza {
	protected String nazwa;
	protected String ciasto;
	protected String sos;
	protected ArrayList dodatki = new ArrayList();

	void przygotowanie(){
		System.out.println(
				"Przygotowanie: "+ nazwa
				+"\nWyrabianie ciasta..."
				+"\nDodawanie sosu"
				+"\nDodatki: ");
		for(int i = 0; i<dodatki.size(); i++){
			System.out.println(" "+ dodatki.get(i));
		}
	}

	protected void pieczenie(){
		System.out.println("Pieczenie: 25 minut w temperaturze 350 stopni Celcjusza");
	}

	protected void krojenie(){
		System.out.println("Krojenie pizzy na 8 równych kawałków");
	}

	protected void pakowanie(){
		System.out.println("Pakowanie pizzyy w oficjalne pudełko naszej sieci Pizzerii");
	}

	public String pobierzNazwa(){
		return nazwa;
	}
}
