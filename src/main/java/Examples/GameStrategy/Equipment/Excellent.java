package Examples.GameStrategy.Equipment;

public abstract class Excellent extends Equipment {

	public Equipment equipment;

//	public String Name() {
//		equipment.Name() + ;
//	}

	public void Picture(String element) {
		equipment.Picture(element);
	}

	public void ItemLevel(int lvl) {
		equipment.ItemLevel(lvl);
	}

	public void Deffence(double magDef, double phyDef) {
		equipment.Deffence(magDef, phyDef);
	}
}
