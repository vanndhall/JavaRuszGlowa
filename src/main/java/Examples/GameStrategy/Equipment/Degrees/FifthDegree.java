package Examples.GameStrategy.Equipment.Degrees;

public class FifthDegree implements DegreeInterface {
	public void name() {
		System.out.println("Przedmiot piątego stopnia");
	}
	private void ClothCalculator(double magDef, double phyDef){
		magDef *= 5;
		phyDef *= 5;
		System.out.println("Obrona magiczna: "+magDef+"\nObrona fizyczna: "+phyDef);

	}
	private void WeaponCalculator(double magAtk, double phyAtk){
		magAtk *=5;
		phyAtk *=5;
		System.out.println("Atak magiczny: "+magAtk+"\nAtak fizyczny: "+phyAtk);
	}

	public void degreeClothCalculate(double magDef, double phyDef) {
		ClothCalculator(magDef, phyDef);
	}

	public void degreeWeaponCalculate(double magAtk, double phyAtk) {

		WeaponCalculator(magAtk, phyAtk);
	}
}
