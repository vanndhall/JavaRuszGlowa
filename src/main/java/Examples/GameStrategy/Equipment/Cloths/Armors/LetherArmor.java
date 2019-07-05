package Examples.GameStrategy.Equipment.Cloths.Armors;

import Examples.GameStrategy.Equipment.Degrees.DegreeInterface;
import Examples.GameStrategy.Equipment.Degrees.FirstDegree;

public class LetherArmor implements Armor {
	private String name = "Lether Armor";
	private int itemLvl = 5;
	private DegreeInterface degreeInterface = new FirstDegree();

	public void wearArmor() {
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
		System.out.println(itemLvl);
	}

	public void Deffence() {
	degreeInterface.degreeClothCalculate(magDef,phyDef);
	}

	public void Picture() {
		System.out.println("____________________\n");
		System.out.println(" ______  _______\n" +
				"|u_uuu[  ]uuuu_u| \n" +
				"|u|\\uuuuuuuuu/|u|\n" +
				"|u| |uuuuuuu| |u|\n" +
				"|u| |uuuuuuu| |u|\n" +
				"|u| |uuuuuuu| |u|\n" +
				"[W] [---*---] [W] ");
		System.out.println("____________________");

	}
}
