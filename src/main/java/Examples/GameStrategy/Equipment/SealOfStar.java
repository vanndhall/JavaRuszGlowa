package Examples.GameStrategy.Equipment;


public class SealOfStar extends Excellent {



	public SealOfStar(Equipment equipment) {
		this.equipment = equipment;
	}

	private String sosName = "Seal of Star";
	private String sosDraw = "xXxSOSxXx";
	private int sosItemLvl = 5;
	private double sosMagDef = 5;
	private double sosPhyDef = 5;



	public void wear() {
		System.out.println(equipment.Name()+" "+sosName);
		Picture(sosDraw);
		ItemLevel(sosItemLvl);
		Deffence(sosMagDef,sosPhyDef);
	}




}
