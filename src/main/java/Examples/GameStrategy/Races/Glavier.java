package Examples.GameStrategy.Races;

import Examples.GameStrategy.Clases.European;
import Examples.GameStrategy.Race;
import Examples.GameStrategy.Skills.Cold;
import Examples.GameStrategy.Skills.Fire;
import Examples.GameStrategy.Skills.Lighting;

public class Glavier extends Race {

	public Glavier(){

		clasCharacterInterface = new European();
		skillInterface1 = new Lighting();
		skillInterface2 = new Cold();
		skillInterface3 = new Fire();
	}
}
