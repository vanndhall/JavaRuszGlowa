package Examples.GameStrategy;

import Examples.GameStrategy.Races.Blader;

public class GameApp {
	public static void main(String[] args) {


		System.out.println("\n________Blader_________");
		Race blader = new Blader();
		System.out.println("Klasa postaci: ");
		blader.doClasCharacter();
		System.out.println("Skille postaci: ");
		blader.doSkill();
		System.out.println("Atak postaci: ");
		blader.doAttack();
		System.out.println("\n");

		//System.out.println("_____________________________");
		//blader.wearingCloths();
		System.out.println("Postać nosi na sobie: ");
		System.out.println("Alchemy UPGRADE: \n");
		blader.alchemyUpgrade();




//		System.out.println("\n________Glavier_________");
//		Race glavier = new Glavier();
//		System.out.println("Klasa postaci: ");
//		glavier.doClasCharacter();
//		System.out.println("Skille postaci:");
//		glavier.doSkill();


	}
}
