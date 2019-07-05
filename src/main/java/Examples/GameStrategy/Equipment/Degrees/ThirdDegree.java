package Examples.GameStrategy.Equipment.Degrees;

public class ThirdDegree implements DegreeInterface {
	public void name() {
		System.out.println("Przedmiot trzeciego stopnia");
	}
	private void ClothCalculator(double magDef, double phyDef){
		magDef *= 3;
		phyDef *= 3;
		System.out.println("Obrona magiczna: "+magDef+"\nObrona fizyczna: "+phyDef);

	}
	private void WeaponCalculator(double magAtk, double phyAtk){
		magAtk *=3;
		phyAtk *=3;
		System.out.println("Atak magiczny: "+magAtk+"\nAtak fizyczny: "+phyAtk);
	}

	public void degreeClothCalculate(double magDef, double phyDef) {
		ClothCalculator(magDef, phyDef);
	}

	public void degreeWeaponCalculate(double magAtk, double phyAtk) {

		WeaponCalculator(magAtk, phyAtk);
	}
}
