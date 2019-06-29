package Examples.GameStrategy.Equipment.Weapon;

public class Sword implements WeaponInterface {
	public void name() {
		System.out.println("Miecz");
	}

	public void doDamage() {
		System.out.println("Uderza z mocą: " + 50 +"hp");
	}

	public void degree() {

	}
}
