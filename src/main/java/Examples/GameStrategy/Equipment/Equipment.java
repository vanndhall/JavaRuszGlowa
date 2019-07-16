package Examples.GameStrategy.Equipment;

import Examples.GameStrategy.Equipment.Degrees.DegreeInterface;

public abstract class Equipment {
	public String name = "EQUIPMENT ";

	protected void wear(){
	}

	protected String Name(){

		return name;
	}

	protected void Type(DegreeInterface degreeInterface){
		degreeInterface.name();
	}

	protected void Picture(String element){}

	protected void ItemLevel(int lvl){
		System.out.println("Wymagany level: "+lvl);
	}

	protected void Deffence(double magDef, double phyDef){

	}


}
