package Examples.GameStrategy.Equipment.Cloths.Pants;

import Examples.GameStrategy.Equipment.Degrees.DegreeInterface;
import Examples.GameStrategy.Equipment.Degrees.FirstDegree;

public class LetherPants implements Pants {

	private String name = "Lether Pants";
	private int itemLvl = 4;
	private DegreeInterface degreeInterface = new FirstDegree();

	public void wearPants() {
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
		System.out.println("[W][--*--][W]\n" +
				"|uuuuu!uuuuu| \n" +
				"|uuuu/\\uuuuu|\n" +
				"|uuuu| |uuuu| \n" +
				"|uuuu| |uuuu| \n" +
				"|uuuu| |uuuu|");
		System.out.println("____________________");
	}
}
