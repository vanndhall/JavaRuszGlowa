package Examples.GameStrategy.Races;

import Examples.GameStrategy.Clases.Chinese;
import Examples.GameStrategy.Equipment.Weapon.Blade;
import Examples.GameStrategy.Race;
import Examples.GameStrategy.Skills.Cold;
import Examples.GameStrategy.Skills.Fire;
import Examples.GameStrategy.Skills.Force;

public class Blader extends Race {

	public Blader(){


		//skills
		skillInterface1 = new Fire();
		skillInterface2 = new Cold();
		skillInterface3 = new Force();

		//Clas
		clasCharacterInterface = new Chinese();

		//Attack
		name = new Blade();
		damage = new Blade();



	}



	@Override
	public String toString() {

		return null;
	}

//	}
	public void addSkillToList() {




//		List<SkillInterface> skillList = new ArrayList();
//		skillList.add(skillInterface = new Fire());
//		skillList.add(skillInterface = new Cold());
//		skillList.add(skillInterface = new Force());
//
//		for (SkillInterface skillvalue : skillList
//		) {
//
//			System.out.println(skillvalue.toString());
//
//		}
//
//	}
	}

}
