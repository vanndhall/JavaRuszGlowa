package Examples.GameStrategy.Races;

import Examples.GameStrategy.Clases.European;
import Examples.GameStrategy.Equipment.Weapon.Staff;
import Examples.GameStrategy.Race;
import Examples.GameStrategy.SkillInterface;
import Examples.GameStrategy.Skills.Fire;
import Examples.GameStrategy.Skills.Force;
import Examples.GameStrategy.Skills.Lighting;

public class Wizard extends Race {

	public Wizard(){

		//Character
		clasCharacterInterface = new European();

		//Skills
		skillInterface1 = new Force();
		skillInterface1 = new Lighting();
		skillInterface1 = new Fire();

		//Attack
		name = new Staff();
		damage = new Staff();

	}
}
