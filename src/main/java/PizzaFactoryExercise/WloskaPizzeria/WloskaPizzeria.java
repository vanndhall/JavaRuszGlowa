package PizzaFactoryExercise.WloskaPizzeria;

import PizzaFactoryExercise.Pizza;
import PizzaFactoryExercise.Pizzeria;

public class WloskaPizzeria extends Pizzeria {
	public Pizza utworzPizza(String type) {
		if(type.equals("serowa")){
			return new WloskaSerowaPizza();
		}
		else if(type.equals("wegetariańska")){
			return new WloskaWegetarianskaPizza();
		}
		else if(type.equals("owoce morza")){
			return new WloskaOwoceMorzaPizza();
		}
		else if(type.equals("pepperoni")){
			return new WloskaPepperoniPizza();
		}
		else return null;

			}
}
