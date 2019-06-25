package StacjaPogodowaExercise.Obserwatorzy;

import StacjaPogodowaExercise.Obserwator;
import StacjaPogodowaExercise.Podmiot;
import StacjaPogodowaExercise.WyswietlElement;

public class WarunkiBiezaceWyswietlanie implements Obserwator, WyswietlElement {
	private float temperatura;
	private float wilgotnosc;
	private Podmiot DanePogodowe;

	public WarunkiBiezaceWyswietlanie(Podmiot DanePogodowe){
		this.DanePogodowe = DanePogodowe;
		DanePogodowe.zarejestrujObserwatra(this);
	}

	public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
		this.temperatura = temperatura;
		this.wilgotnosc = wilgotnosc;
		wyswietl();
	}

	public void wyswietl() {
		System.out.println("Warunki bieżące "+ temperatura + " stopni Celcjusza oraz "+ wilgotnosc+"% wilgotność");
	}


}
