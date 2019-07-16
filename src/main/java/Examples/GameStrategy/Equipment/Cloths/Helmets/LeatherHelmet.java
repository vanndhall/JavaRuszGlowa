package Examples.GameStrategy.Equipment.Cloths.Helmets;

import Examples.GameStrategy.Equipment.Degrees.DegreeInterface;
import Examples.GameStrategy.Equipment.Degrees.FirstDegree;

public class LeatherHelmet extends Helmet {
	private String name = "Leather Helmet ";
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
		System.out.println("  [____________] " + element + "\n"+
				" / ___     ___ \\\n" +
				"/ [_*_]   [_*_] \\\n" +
				"\\      [ ]      /\n" +
				" \\|  |  |  |  |/\n" +
				"  |  |  |  |  |");
		System.out.println("____________________");

	}

}
