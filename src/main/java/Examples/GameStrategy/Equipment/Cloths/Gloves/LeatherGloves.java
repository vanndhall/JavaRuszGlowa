package Examples.GameStrategy.Equipment.Cloths.Gloves;

import Examples.GameStrategy.Equipment.Degrees.DegreeInterface;
import Examples.GameStrategy.Equipment.Degrees.FirstDegree;

public class LeatherGloves extends Gloves {

	private String name = "Leather Gloves ";
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
		System.out.println("\t    _ _ _ _\n" +
				"    __ |^|^|^|^|" + element + "\n"+
				"\t\\ \\| | | | |\n" +
				"\t \\ \t\t   |\n" +
				"      \\__    __|\n" +
				"         |   |");
		System.out.println("____________________");

	}
}