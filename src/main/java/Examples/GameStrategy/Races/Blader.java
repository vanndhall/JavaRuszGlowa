package Examples.GameStrategy.Races;

import Examples.GameStrategy.Clases.Chinese;
import Examples.GameStrategy.Equipment.Weapon.Blade;
import Examples.GameStrategy.Race;
import Examples.GameStrategy.SkillInterface;
import Examples.GameStrategy.Skills.Cold;
import Examples.GameStrategy.Skills.Fire;
import Examples.GameStrategy.Skills.Force;

import java.util.ArrayList;
import java.util.List;

public class Blader extends Race {

	public Blader(){

		//Clas
		clasCharacterInterface = new Chinese();


		//skills
		skillInterface1 = new Fire();
		skillInterface2 = new Cold();
		skillInterface3 = new Force();


		//Attack
		name = new Blade();
		damage = new Blade();



	}



//	}
	public void addSkillToList() {
//		ArrayList skills = new SkillInterface();
//		skills.add(defaultskillInterface = new Fire());
//		skillList.add(defaultskillInterface = new Cold());
//		skillList.add(defaultskillInterface = new Force());
//
//		for (SkillInterface skillvalue : skillList
//		) {
//
//			System.out.println(skillvalue);
//
//		}

	}


}
