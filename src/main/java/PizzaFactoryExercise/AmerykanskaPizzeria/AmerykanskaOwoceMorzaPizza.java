package PizzaFactoryExercise.AmerykanskaPizzeria;

import PizzaFactoryExercise.Pizza;

public class AmerykanskaOwoceMorzaPizza extends Pizza {
	public AmerykanskaOwoceMorzaPizza() {
		nazwa = "Amerykańska Pizza z owocami morza";
		ciasto = "Extra grube, chrupiące ciasto";
		sos = "Sos z pomidorów śliwkowych";

		dodatki.add("Grubo tarty ser Mozzarella");
	}
	protected void krojenie(){
		System.out.println("Krojenie pizy na kwadratowe kawałki");
	}
}
