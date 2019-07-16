package Examples.GameStrategy.Equipment.Cloths.Boots;

import Examples.GameStrategy.Equipment.Cloths.Cloths;
import Examples.GameStrategy.Equipment.Degrees.DegreeInterface;
import Examples.GameStrategy.Equipment.Degrees.FirstDegree;

public class LeatherBoots extends Boots {

	private String name = "Leather Boots ";
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
		System.out.println("____________________\n");
		System.out.println("  |uu| |uu| " + element + "\n" +
				" _|uu| |uu|_\n" +
				"[____] [____]");
		System.out.println("____________________");
	}


}
