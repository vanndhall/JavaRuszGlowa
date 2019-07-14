package Examples.GameStrategy.Equipment.Cloths.Boots;

import Examples.GameStrategy.Equipment.Degrees.DegreeInterface;
import Examples.GameStrategy.Equipment.Degrees.FirstDegree;

public class LetherBoots  {

	private String name = "Lether Boots";
	private int itemLvl = 2;
	private DegreeInterface degreeInterface = new FirstDegree();

	public void wearBoots() {
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

	public void ItemLevel(int lvl) {
		System.out.println("Wymagany level: "+itemLvl);
	}

//	public void Deffence() {
//	degreeInterface.degreeClothCalculate(magDef,phyDef);
//	}

	public void Picture(String element) {
		System.out.println("____________________\n");
		System.out.println("  |uu| |uu|\n" +
				" _|uu| |uu|_\n" +
				"[____] [____]");
		System.out.println("____________________");
	}

	public String wearExcellent() {
		return "Lether Boots";
	}
}
