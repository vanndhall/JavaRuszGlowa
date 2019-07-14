package StarCafeExercise.Skladniki;

import StarCafeExercise.Napoj;
import StarCafeExercise.SkladnikDekorator;

public class MleczkoSojowe extends SkladnikDekorator {
	Napoj napoj;

	public MleczkoSojowe(Napoj napoj) {
		this.napoj = napoj;
	}

	public String pobierzOpis() {
		return napoj.pobierzOpis()+ ", Mleczko Sojowe";
	}

	public double koszt() {
		return napoj.koszt()+ 0.15;
	}
}
