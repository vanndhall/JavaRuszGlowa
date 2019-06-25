package StacjaPogodowaExercise.Obserwatorzy;

import StacjaPogodowaExercise.Obserwator;
import StacjaPogodowaExercise.Podmiot;
import StacjaPogodowaExercise.WyswietlElement;

public class StatystykaWyswietlanie implements Obserwator, WyswietlElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int liczbaOdczytow;
	private Podmiot DanePogodowe;

	public StatystykaWyswietlanie( Podmiot DanePogodowe) {
		this.DanePogodowe = DanePogodowe;
		DanePogodowe.zarejestrujObserwatra(this);
	}

	public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
		tempSum += temp;
		liczbaOdczytow++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}

		if (temp < minTemp) {
			minTemp = temp;
		}
		wyswietl();
	}

	public void wyswietl() {
		System.out.println("Średnia/Maksymalna/Minimalna temperatura = " + (tempSum / liczbaOdczytow)
				+ "/" + maxTemp + "/" + minTemp);
	}
}
