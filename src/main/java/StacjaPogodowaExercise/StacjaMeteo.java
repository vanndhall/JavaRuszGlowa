package StacjaPogodowaExercise;

import StacjaPogodowaExercise.DanePogodowe;
import StacjaPogodowaExercise.Obserwatorzy.PrognozaWyswietlanie;
import StacjaPogodowaExercise.Obserwatorzy.StatystykaWyswietlanie;
import StacjaPogodowaExercise.Obserwatorzy.WarunkiBiezaceWyswietlanie;

public class StacjaMeteo {
	public static void main(String[] args) {
		DanePogodowe danePogodowe = new DanePogodowe();

		WarunkiBiezaceWyswietlanie warunkiBiezaceWyswietlanie = new WarunkiBiezaceWyswietlanie(danePogodowe);

		StatystykaWyswietlanie statystykaWyswietlanie = new StatystykaWyswietlanie(danePogodowe);

		PrognozaWyswietlanie prognozaWyswietlanie = new PrognozaWyswietlanie(danePogodowe);

		danePogodowe.ustawOdczyty(26.6f, 65 , 1013.1f);
		danePogodowe.ustawOdczyty(27.7f, 70 , 997.0f);
		danePogodowe.ustawOdczyty(25.5f, 90 , 997.0f);
	}
}
