package Examples.GameStrategy.Equipment.Cloths.Gloves;

import Examples.GameStrategy.Equipment.Degrees.DegreeInterface;
import Examples.GameStrategy.Equipment.Degrees.FirstDegree;

public class LetherGloves implements Gloves {

	private String name = "Lether Gloves";
	private int itemLvl = 2;
	private DegreeInterface degreeInterface = new FirstDegree();



	public void wearGloves() {
		System.out.println("________________________");
		Name();
		Type();
		Picture(name);
		//Deffence();
		ItemLevel(itemLvl);

	}

	public void Type() {
		degreeInterface.name();
	}

	public void Name() {
		System.out.println(name);
	}

	public void ItemLevel(int itemLvl) {
		System.out.println("Wymagany level: "+itemLvl);
	}

//	public void Deffence() {
//	degreeInterface.degreeClothCalculate(magDef, phyDef);
//	}
	public void Picture(String element) {
		System.out.println("____________________\n");
		System.out.println("\t    _ _ _ _\n" +
				"    __ |^|^|^|^|\n" +
				"\t\\ \\| | | | |\n" +
				"\t \\ \t\t   |\n" +
				"      \\__    __|\n" +
				"         |   |");
		System.out.println("____________________");

	}

	public String wearExcellent() {
		return "Lether Gloves";
	}
}