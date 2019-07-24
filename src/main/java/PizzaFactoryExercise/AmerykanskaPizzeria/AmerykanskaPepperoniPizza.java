package PizzaFactoryExercise.AmerykanskaPizzeria;

import PizzaFactoryExercise.Pizza;

public class AmerykanskaPepperoniPizza extends Pizza {
	public AmerykanskaPepperoniPizza() {
		nazwa = "Amerykańska Pizza z pepperoni";
		ciasto = "Extra grube, chrupiące ciasto";
		sos = "Sos barbecue";

		dodatki.add("Pepperoni");
		dodatki.add("Pieczarki");
	}
	protected void krojenie(){
		System.out.println("Kroojenie pizy na kwadratowe kawałki");
	}
}
