package Examples.GameStrategy.Equipment.Cloths.Armors;

import Examples.GameStrategy.Equipment.Degrees.DegreeInterface;
import Examples.GameStrategy.Equipment.Degrees.FirstDegree;

public class LeatherArmor extends Armor {

	private String name = "Leather Armor ";
	private int itemLvl = 5;
	private String normal= "";
	private DegreeInterface firstDegree = new FirstDegree();

	public String Name(){
		return name;
	}

	public void wear() {
		System.out.println("________________________");
		System.out.println(name);
		Type(firstDegree);
		Picture(normal);
		Deffence(magDef,phyDef);
		ItemLevel(itemLvl);
	}

	public void Deffence(double magDef, double phyDef) {
	firstDegree.degreeClothCalculate(magDef,phyDef);
	}

	public void Picture(String element) {
		System.out.println("____________________\n"+
				" ______  _______\n" +
				"|u_uuu[  ]uuuu_u| " + element + "\n"+
				"|u|\\uuuuuuuuu/|u|\n" +
				"|u| |uuuuuuu| |u|\n" +
				"|u| |uuuuuuu| |u|\n" +
				"|u| |uuuuuuu| |u|\n" +
				"[W] [---*---] [W]\n"+
				"____________________");
	}


}
