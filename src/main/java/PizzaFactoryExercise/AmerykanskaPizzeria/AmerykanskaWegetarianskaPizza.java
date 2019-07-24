package PizzaFactoryExercise.AmerykanskaPizzeria;

import PizzaFactoryExercise.Pizza;

public class AmerykanskaWegetarianskaPizza extends Pizza {
	public AmerykanskaWegetarianskaPizza() {
		nazwa = "Amerykańska Pizza wegetarianska";
		ciasto = "Extra grube, chrupiące ciasto";
		sos = "Sos pomidorowy";

		dodatki.add("Ogórki kiszone");
		dodatki.add("Pomidory koktajlowe");
	}

	protected void krojenie(){
		System.out.println("Kroojenie pizy na kwadratowe kawałki");
	}
}
