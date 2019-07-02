package Examples.GameStrategy.Equipment.Degrees;

public class SeventhDegree implements DegreeInterface{
	public void name() {
		System.out.println("Przedmiot siódmego stopnia");
	}
	private void ClothCalculator(double magDef, double phyDef){
		magDef *= 7;
		phyDef *= 7;
		System.out.println("Obrona magiczna: "+magDef+"\nObrona fizyczna: "+phyDef);

	}
	private void WeaponCalculator(double magAtk, double phyAtk){
		magAtk *=7;
		phyAtk *=7;
		System.out.println("Atak magiczny: "+magAtk+"\nAtak fizyczny: "+phyAtk);
	}

	public void degreeClothCalculate(double magDef, double phyDef) {
		ClothCalculator(magDef, phyDef);
	}

	public void degreeWeaponCalculate(double magAtk, double phyAtk) {

		WeaponCalculator(magAtk, phyAtk);
	}
}
