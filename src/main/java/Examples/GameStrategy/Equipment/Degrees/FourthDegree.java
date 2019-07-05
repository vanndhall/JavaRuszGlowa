package Examples.GameStrategy.Equipment.Degrees;

public class FourthDegree implements DegreeInterface {
	public void name() {
		System.out.println("Przedmiot czwartego stopnia");
	}
	private void ClothCalculator(double magDef, double phyDef){
		magDef *= 4;
		phyDef *= 4;
		System.out.println("Obrona magiczna: "+magDef+"\nObrona fizyczna: "+phyDef);

	}
	private void WeaponCalculator(double magAtk, double phyAtk){
		magAtk *=4;
		phyAtk *=4;
		System.out.println("Atak magiczny: "+magAtk+"\nAtak fizyczny: "+phyAtk);
	}

	public void degreeClothCalculate(double magDef, double phyDef) {
		ClothCalculator(magDef, phyDef);
	}

	public void degreeWeaponCalculate(double magAtk, double phyAtk) {

		WeaponCalculator(magAtk, phyAtk);
	}
}
