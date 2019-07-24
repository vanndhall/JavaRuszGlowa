package PizzaFactoryExercise.AmerykanskaPizzeria;

import PizzaFactoryExercise.Pizza;
import PizzaFactoryExercise.Pizzeria;

public class AmerykanskaPizzeria extends Pizzeria {
	public Pizza utworzPizza(String type) {
		if(type.equals("serowa")){
			return new AmerykanskaSerowaPizza();
		}
		else if(type.equals("wegetariańska")){
			return new AmerykanskaWegetarianskaPizza();
		}
		else if(type.equals("owoce morza")){
			return new AmerykanskaOwoceMorzaPizza();
		}
		else if(type.equals("pepperoni")){
			return new AmerykanskaPepperoniPizza();
		}
		else return null;
	}
}
