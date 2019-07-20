package Examples.GameStrategy.Races;

import Examples.GameStrategy.Clases.Chinese;
import Examples.GameStrategy.Equipment.Cloths.Armors.LeatherArmor;
import Examples.GameStrategy.Equipment.Cloths.Boots.LeatherBoots;
import Examples.GameStrategy.Equipment.Cloths.Gloves.LeatherGloves;
import Examples.GameStrategy.Equipment.Cloths.Helmets.LeatherHelmet;
import Examples.GameStrategy.Equipment.Cloths.Pants.LeatherPants;
import Examples.GameStrategy.Equipment.Weapon.Blade;
import Examples.GameStrategy.Race;
import Examples.GameStrategy.Skills.Cold.Cold;
import Examples.GameStrategy.Skills.Fire.Fire;
import Examples.GameStrategy.Skills.Force.Force;

public class Blader extends Race {

	public Blader(){

		//Clas
		clasCharacterInterface = new Chinese();


		//skills
		//skillInterface1 = new Fire();
		//skillInterface2 = new Cold();
		//skillInterface3 = new Force();


		//Attack
		name = new Blade();
		damage = new Blade();

		//Clothes

		helmet = new LeatherHelmet();
		armor = new LeatherArmor();
		gloves = new LeatherGloves();
		pants = new LeatherPants();
		boots = new LeatherBoots();


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
