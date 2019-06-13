package Examples.GameStrategy;

import Examples.GameStrategy.Races.Blader;
import Examples.GameStrategy.Races.Glavier;

public class ExampleApp {
	public static void main(String[] args) {


		System.out.println("\n________Blader_________");
		Race blader = new Blader();
		System.out.println("Klasa postaci: ");
		blader.doClasCharacter();
		System.out.println("Skille postaci: ");
		blader.doSkill();
		System.out.println("\n________Glavier_________");
		Race glavier = new Glavier();
		System.out.println("Klasa postaci: ");
		glavier.doClasCharacter();
		System.out.println("Skille postaci:");
		glavier.doSkill();

	}
}
