package Examples.GameStrategy.Equipment.Weapon;

public class Blade implements WeaponInterface {
	final int DAMAGE = 500;

	public void name() {
		System .out.println("Grube ostrze");
	}

	public void doDamage() {
		System.out.println("Uderza z mocą: " + DAMAGE +"hp");
	}

	public void degree() {

	}
}
