package Examples.GameStrategy.Equipment.Weapon;

public class Bow implements WeaponInterface {
	final int DAMAGE = 550;

	public void name()  {
		System .out.println("Łuk");
	}

	public void doDamage()  {
		System.out.println("Uderza z mocą: " + DAMAGE +"hp");
	}

	public void degree() {

	}
}
