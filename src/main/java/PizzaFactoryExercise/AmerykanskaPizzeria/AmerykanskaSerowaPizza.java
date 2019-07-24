package PizzaFactoryExercise.AmerykanskaPizzeria;

import PizzaFactoryExercise.Pizza;

public class AmerykanskaSerowaPizza extends Pizza {
	public AmerykanskaSerowaPizza() {
		nazwa = "Amerykańska Pizza z serem";
		ciasto = "Extra grube, chrupiące ciasto";
		sos = "Sos pomidorowy";


		dodatki.add("Tarty ser Reggiano");
	}
	protected void krojenie(){
		System.out.println("Kroojenie pizy na kwadratowe kawałki");
	}
}
