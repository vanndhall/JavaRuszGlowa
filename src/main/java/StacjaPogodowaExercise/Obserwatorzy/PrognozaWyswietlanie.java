package StacjaPogodowaExercise.Obserwatorzy;

import StacjaPogodowaExercise.Obserwator;
import StacjaPogodowaExercise.Podmiot;
import StacjaPogodowaExercise.WyswietlElement;

public class PrognozaWyswietlanie implements Obserwator, WyswietlElement {

	private float aktualneCisnienie = 29.92f;
	private float ostatnieCisnienie;
	private Podmiot DanePogodowe;

	public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
		ostatnieCisnienie = aktualneCisnienie;
		aktualneCisnienie = cisnienie;


	}

	public void wyswietl() {
		System.out.print("Prognoza: ");
		if (aktualneCisnienie > ostatnieCisnienie) {
			System.out.println("Poprawa pogody po drodze!");
		} else if (aktualneCisnienie == ostatnieCisnienie) {
			System.out.println("Więcej tego samego");
		} else if (aktualneCisnienie < ostatnieCisnienie) {
			System.out.println("Uważaj na chłodniejszą, deszczową pogodę");
		}
	}
}
