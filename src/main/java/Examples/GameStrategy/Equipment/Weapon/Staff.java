package Examples.GameStrategy.Equipment.Weapon;

public class Staff implements WeaponInterface {
	final int DAMAGE = 1500;
	public void name() {
		System.out.println("Berło");
	}

	public void doDamage()  {

		System.out.println("Uderza z mocą: " + DAMAGE +"hp");
	}

	public void degree() {

	}
}
