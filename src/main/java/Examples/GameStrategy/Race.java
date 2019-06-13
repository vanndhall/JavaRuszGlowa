package Examples.GameStrategy;

import Examples.GameStrategy.Equipment.Weapon.Weapon;

public abstract class Race {
	protected SkillInterface skillInterface1;
	protected SkillInterface skillInterface2;
	protected SkillInterface skillInterface3;
	protected Weapon name;
	protected Weapon damage;

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

}
