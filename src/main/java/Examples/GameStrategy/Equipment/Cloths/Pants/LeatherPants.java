package Examples.GameStrategy.Equipment.Cloths.Pants;

import Examples.GameStrategy.Equipment.Degrees.DegreeInterface;
import Examples.GameStrategy.Equipment.Degrees.FirstDegree;

public class LeatherPants extends Pants {

	private String name = "Leather Pants ";
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


	public void Picture(String element)  {
		System.out.println("____________________\n");
		System.out.println("[W][--*--][W]" + element + "\n" +
				"|uuuuu!uuuuu| \n" +
				"|uuuu/\\uuuuu|\n" +
				"|uuuu| |uuuu| \n" +
				"|uuuu| |uuuu| \n" +
				"|uuuu| |uuuu|");
		System.out.println("____________________");
	}


}
