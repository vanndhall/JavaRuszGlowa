package Examples.GameStrategy;

import Examples.GameStrategy.Equipment.Cloths.Armors.Armor;
import Examples.GameStrategy.Equipment.Cloths.Armors.LeatherArmor;
import Examples.GameStrategy.Equipment.Cloths.Boots.Boots;
import Examples.GameStrategy.Equipment.Cloths.Boots.LeatherBoots;
import Examples.GameStrategy.Equipment.Cloths.Gloves.Gloves;
import Examples.GameStrategy.Equipment.Cloths.Gloves.LeatherGloves;
import Examples.GameStrategy.Equipment.Cloths.Helmets.Helmet;
import Examples.GameStrategy.Equipment.Cloths.Helmets.LeatherHelmet;
import Examples.GameStrategy.Equipment.Cloths.Pants.LeatherPants;
import Examples.GameStrategy.Equipment.Cloths.Pants.Pants;
import Examples.GameStrategy.Equipment.Equipment;
import Examples.GameStrategy.Equipment.SealOfStar;
import Examples.GameStrategy.Equipment.Weapon.WeaponInterface;

public abstract class Race {
	protected SkillInterface skillInterface1;
	protected SkillInterface skillInterface2;
	protected SkillInterface skillInterface3;
	protected SkillInterface defaultskillInterface;
	protected WeaponInterface name;
	protected WeaponInterface damage;
	protected Gloves gloves;
	protected Helmet helmet;
	protected Armor armor;
	//protected Cloths cloths; //TODO - uzyc jej w pozniejsyzm czasie zamiast podklas typu helmet, armor
	protected Pants pants;
	protected Boots boots;

	protected ClasCharacterInterface clasCharacterInterface;

	public Race(){

	}

	public void doSkill(){
		skillInterface1.addSkill();
		skillInterface2.addSkill();
		skillInterface3.addSkill();
	}

	public void doClasCharacter(){
		clasCharacterInterface.addClas();
	}

	public void doAttack(){
		name.name();
		damage.doDamage();
	}

	public void wearingCloths(){

		//TODO - poprawic interfejs Cloths, dodac metode wear, usunac metody z interfesów dziedziczacych

		helmet.wear();
		armor.wear();
		gloves.wear();
		pants.wear();
		boots.wear();
	}

	public void alchemyUpgrade(){
		System.out.println("\nUpgraded Equipment: ");

		System.out.println("\n____________________\n");
		Equipment sosLeatherHelmet = new LeatherHelmet();
		sosLeatherHelmet = new SealOfStar(sosLeatherHelmet);
		((SealOfStar) sosLeatherHelmet).wear();

		System.out.println("\n____________________\n");
		Equipment sosLetherArmor = new LeatherArmor();
		sosLetherArmor = new SealOfStar(sosLetherArmor);
		((SealOfStar) sosLetherArmor).wear();

		System.out.println("\n____________________\n");
		Equipment sosLeatherGloves = new LeatherGloves();
		sosLeatherGloves = new SealOfStar(sosLeatherGloves);
		((SealOfStar) sosLeatherGloves).wear();

		System.out.println("\n____________________\n");
		Equipment sosLeatherPants = new LeatherPants();
		sosLeatherPants = new SealOfStar(sosLeatherPants);
		((SealOfStar) sosLeatherPants).wear();

		System.out.println("\n____________________\n");
		Equipment sosLeatherBoots = new LeatherBoots();
		sosLeatherBoots = new SealOfStar(sosLeatherBoots);
		((SealOfStar) sosLeatherBoots).wear();
	}



}
