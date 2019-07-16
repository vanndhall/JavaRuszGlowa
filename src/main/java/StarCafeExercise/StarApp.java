package StarCafeExercise;

import StarCafeExercise.Kawy.Expresso;
import StarCafeExercise.Kawy.MocnoPalona;
import StarCafeExercise.Kawy.StarCafeSpecial;
import StarCafeExercise.Skladniki.BitaSmietana;
import StarCafeExercise.Skladniki.Czekolada;
import StarCafeExercise.Skladniki.MleczkoSojowe;

public class StarApp {
	public static void main(String[] args) {
		Napoj expresso = new Expresso();
		System.out.println(expresso.pobierzOpis()+ "  " + expresso.koszt()+ " zł");

		Napoj mocna = new MocnoPalona();
		mocna = new Czekolada(mocna);
		mocna = new Czekolada(mocna);
		mocna = new BitaSmietana(mocna);
		System.out.println(mocna.pobierzOpis()+ "  "+ mocna.koszt()+ " zł");


		Napoj star = new StarCafeSpecial();
		star = new MleczkoSojowe(star);
		star = new Czekolada(star);
		star = new BitaSmietana(star);
		System.out.println(star.pobierzOpis()+ "  "+ star.koszt()+ " zł");
	}
}
