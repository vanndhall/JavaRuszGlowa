package Examples.GameStrategy;

import Examples.GameStrategy.Equipment.Cloths.Armors.Armor;
import Examples.GameStrategy.Equipment.Cloths.Cloths;
import Examples.GameStrategy.Equipment.Cloths.Gloves.Gloves;
import Examples.GameStrategy.Equipment.Cloths.Helmets.Helmet;
import Examples.GameStrategy.Equipment.Cloths.Pants.Pants;
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

		helmet.wearHelmet();
		armor.wearArmor();
		gloves.wearGloves();
		pants.wearPants();

	}



}
