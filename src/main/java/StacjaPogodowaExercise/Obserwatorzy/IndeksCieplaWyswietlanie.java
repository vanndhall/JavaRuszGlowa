package StacjaPogodowaExercise.Obserwatorzy;

import StacjaPogodowaExercise.Obserwator;
import StacjaPogodowaExercise.Podmiot;
import StacjaPogodowaExercise.WyswietlElement;

public class IndeksCieplaWyswietlanie implements Obserwator, WyswietlElement {

	float indeksCiepla = 0.0f;
	private final Podmiot danePogodowe;

	public IndeksCieplaWyswietlanie(Podmiot danePogodowe) {
		this.danePogodowe = danePogodowe;
		danePogodowe.zarejestrujObserwatra(this);
	}

	public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
		float t = temp;
		float rh = wilgotnosc;
		indeksCiepla = (float)
				(
						(16.923 + (0.185212 * t)) +
								(5.37941 * rh) -
								(0.100254 * t * rh) +
								(0.00941695 * (t * t)) +
								(0.00728898 * (rh * rh)) +
								(0.000345372 * (t * t * rh)) -
								(0.000814971 * (t * rh * rh)) +
								(0.0000102102 * (t * t * rh * rh)) -
								(0.000038646 * (t * t * t)) +
								(0.0000291583 * (rh * rh * rh)) +
								(0.00000142721 * (t * t * t * rh)) +
								(0.000000197483 * (t * rh * rh * rh)) -
								(0.0000000218429 * (t * t * t * rh * rh)) +
								(0.000000000843296 * (t * t * rh * rh * rh)) -
								(0.0000000000481975 * (t * t * t * rh * rh * rh)));

	}

	public void wyswietl() {

			System.out.println("Indeks ciepła to " + indeksCiepla);
	}
}
