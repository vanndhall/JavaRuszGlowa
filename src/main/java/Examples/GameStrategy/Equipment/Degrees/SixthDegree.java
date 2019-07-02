package Examples.GameStrategy.Equipment.Degrees;

public class SixthDegree implements DegreeInterface {
	public void name() {
		System.out.println("Przedmiot szóstego stopnia");
	}
	private void ClothCalculator(double magDef, double phyDef){
		magDef *= 6;
		phyDef *= 6;
		System.out.println("Obrona magiczna: "+magDef+"\nObrona fizyczna: "+phyDef);

	}
	private void WeaponCalculator(double magAtk, double phyAtk){
		magAtk *=6;
		phyAtk *=6;
		System.out.println("Atak magiczny: "+magAtk+"\nAtak fizyczny: "+phyAtk);
	}

	public void degreeClothCalculate(double magDef, double phyDef) {
		ClothCalculator(magDef, phyDef);
	}

	public void degreeWeaponCalculate(double magAtk, double phyAtk) {

		WeaponCalculator(magAtk, phyAtk);
	}
}
