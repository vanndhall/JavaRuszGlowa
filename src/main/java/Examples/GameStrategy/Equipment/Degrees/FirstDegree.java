package Examples.GameStrategy.Equipment.Degrees;

public class FirstDegree implements DegreeInterface {
	public void name() {
		System.out.println("Przedmiot pierwszego stopnia!");
	}
	private void ClothCalculator(double magDef, double phyDef){
		magDef *= 1;
		phyDef *= 1;
		System.out.println("Obrona magiczna: "+magDef+"\nObrona fizyczna: "+phyDef);

	}
	private void WeaponCalculator(double magAtk, double phyAtk){
		magAtk *=1;
		phyAtk *=1;
		System.out.println("Atak magiczny: "+magAtk+"\nAtak fizyczny: "+phyAtk);
	}

	public void degreeClothCalculate(double magDef, double phyDef) {
		ClothCalculator(magDef, phyDef);
	}

	public void degreeWeaponCalculate(double magAtk, double phyAtk) {

		WeaponCalculator(magAtk, phyAtk);
	}



}
