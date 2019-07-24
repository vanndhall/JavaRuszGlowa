package PizzaFactoryExercise;

import PizzaFactoryExercise.AmerykanskaPizzeria.AmerykanskaPizzeria;
import PizzaFactoryExercise.WloskaPizzeria.WloskaPizzeria;

public class PizzaTest {
	public static void main(String[] args) {
		Pizzeria wloska = new WloskaPizzeria();
		Pizzeria amerykanska = new AmerykanskaPizzeria();

		wloska.zamowPizza("owoce morza");
		System.out.println("\n_____________________________\n");
		amerykanska.zamowPizza("wegetariańska");
	}
}
