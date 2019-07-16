package StarCafeExercise.Skladniki;

import StarCafeExercise.Napoj;
import StarCafeExercise.SkladnikDekorator;

public class BitaSmietana extends SkladnikDekorator {
	Napoj napoj;

	public BitaSmietana(Napoj napoj) {
		this.napoj = napoj;
	}

	public String pobierzOpis() {
		return napoj.pobierzOpis()+ ", Bita Śmietana";
	}

	public double koszt() {
		return napoj.koszt()+ 0.10;
	}
}
