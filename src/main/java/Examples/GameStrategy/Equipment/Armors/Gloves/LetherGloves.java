package Examples.GameStrategy.Equipment.Armors.Gloves;

import Examples.GameStrategy.Equipment.Degrees.DegreeInterface;
import Examples.GameStrategy.Equipment.Degrees.FirstDegree;

public class LetherGloves implements Gloves {

	private String name = "Lether Gloves";
	private int itemLvl = 2;
	private DegreeInterface degreeInterface = new FirstDegree();



	public void addGloves() {
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
		System.out.println("Wymagany level: "+itemLvl);
	}

	public void Deffence() {
	degreeInterface.degreeClothCalculate(magDef, phyDef);
	}
	public void Picture() {
		System.out.println("	______________");
		System.out.println("\t    _ _ _ _\n" +
				"    __ |^|^|^|^|\n" +
				"\t\\ \\| | | | |\n" +
				"\t \\ \t\t   |\n" +
				"      \\__    __|\n" +
				"         |   |");
		System.out.println("	______________");
	}

}