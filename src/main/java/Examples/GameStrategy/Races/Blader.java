package Examples.GameStrategy.Races;

import Examples.GameStrategy.Clases.Chinese;
import Examples.GameStrategy.Equipment.Cloths.Armors.LetherArmor;
import Examples.GameStrategy.Equipment.Cloths.Gloves.LetherGloves;
import Examples.GameStrategy.Equipment.Cloths.Helmets.LetherHelmet;
import Examples.GameStrategy.Equipment.Cloths.Pants.LetherPants;
import Examples.GameStrategy.Equipment.Weapon.Blade;
import Examples.GameStrategy.Race;
import Examples.GameStrategy.Skills.Cold;
import Examples.GameStrategy.Skills.Fire;
import Examples.GameStrategy.Skills.Force;

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

		//Clothes

		helmet = new LetherHelmet();
		armor = new LetherArmor();
		gloves = new LetherGloves();
		armor = new LetherArmor();
		pants = new LetherPants();


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
