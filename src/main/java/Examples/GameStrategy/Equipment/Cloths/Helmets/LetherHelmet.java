package Examples.GameStrategy.Equipment.Cloths.Helmets;

import Examples.GameStrategy.Equipment.Degrees.DegreeInterface;
import Examples.GameStrategy.Equipment.Degrees.FirstDegree;

public class LetherHelmet implements Helmet {
	private String name = "Lether Helmet";
	private int itemLvl = 3;
	private DegreeInterface degreeInterface = new FirstDegree();

	public void wearHelmet() {
		System.out.println("________________________");
		Name();
		Type();
		Picture();
		Deffence();
		ItemLevel();
	}

	public void Type() {
		degreeInterface.name();
	}

	public void Name() {
		System.out.println(name);
	}

	public void ItemLevel() {
		System.out.println("Wymagany level:" + itemLvl);
	}

	public void Deffence() {
		degreeInterface.degreeClothCalculate(magDef,phyDef);
	}

	public void Picture() {
		System.out.println("____________________\n");
		System.out.println("  [____________]\n" +
				" / ___     ___ \\\n" +
				"/ [_*_]   [_*_] \\\n" +
				"\\      [ ]      /\n" +
				" \\|  |  |  |  |/\n" +
				"  |  |  |  |  |");
		System.out.println("____________________");

	}
}
