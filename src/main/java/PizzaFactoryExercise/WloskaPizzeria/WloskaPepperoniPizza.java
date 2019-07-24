package PizzaFactoryExercise.WloskaPizzeria;

import PizzaFactoryExercise.Pizza;

public class WloskaPepperoniPizza extends Pizza {

	public WloskaPepperoniPizza() {
		nazwa = "Włoska pizza pepperoni z sosem Marinara";
		ciasto = "Cienkie kruche ciasto";
		sos = "Sos Marinara";

		dodatki.add("Pepperoni");
		dodatki.add("Pieczarki");
	}
}
