package StacjaPogodowaExercise;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot {
	private ArrayList obserwatorzy;
	private float temperatura;
	private float wilgotnosc;
	private float cisnienie;

	public DanePogodowe(){
		obserwatorzy = new ArrayList();

	}

	public void zarejestrujObserwatra(Obserwator o) {
		obserwatorzy.add(o);
	}

	public void usunObserwatora(Obserwator o) {
		int i = obserwatorzy.indexOf(o);   // pobiera nr indeksu  Obiektu
		if( i>=0){							// nastepnie warunek- jeżeli nr indeksu tego obiektu ejst wiekszy badz równy 0
			obserwatorzy.remove(i);			// usuń nr indexu tego obiektu(wraz z tym obiektem)
		}

	}

	public void powiadomObserwatorow() {
	for(int i =0; i< obserwatorzy.size();i++){
		Obserwator Obs = (Obserwator)obserwatorzy.get(i);
		Obs.aktualizacja(temperatura,wilgotnosc,cisnienie);
		}
	}

	public void odczytyZmiana(){
		powiadomObserwatorow();
	}
	public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie){
		this.temperatura = temperatura;
		this.cisnienie = cisnienie;
		this.wilgotnosc = wilgotnosc;
		odczytyZmiana();
	}
}
