package StarCafeExercise.Skladniki;

import StarCafeExercise.Napoj;
import StarCafeExercise.SkladnikDekorator;

public class Czekolada extends SkladnikDekorator {
	Napoj napoj;

	public Czekolada(Napoj napoj) {
		this.napoj = napoj;
	}

	public String pobierzOpis() {
		return napoj.pobierzOpis()+ ", Czekolada";
	}

	public double koszt() {
		return napoj.koszt()+ 0.20;
	}
}
