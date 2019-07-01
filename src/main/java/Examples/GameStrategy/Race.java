package Examples.GameStrategy;

import Examples.GameStrategy.Equipment.Armors.Gloves.Gloves;
import Examples.GameStrategy.Equipment.Armors.Gloves.LetherGloves;
import Examples.GameStrategy.Equipment.Equipment;
import Examples.GameStrategy.Equipment.Weapon.WeaponInterface;

public abstract class Race {
	protected SkillInterface skillInterface1;
	protected SkillInterface skillInterface2;
	protected SkillInterface skillInterface3;
	protected SkillInterface defaultskillInterface;
	protected WeaponInterface name;
	protected WeaponInterface damage;
	protected Gloves gloves;

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
	gloves.addGloves();
	}



}
