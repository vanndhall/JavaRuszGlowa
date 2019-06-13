package Examples.GameStrategy.Equipment.Weapon;

public class Blade implements Weapon {

	public void name() {
		System.out.println("Grube ostrze");
	}

	public void doDamage() {
		System.out.println("Uderza z mocą: " + 50 +"hp");
	}
}
