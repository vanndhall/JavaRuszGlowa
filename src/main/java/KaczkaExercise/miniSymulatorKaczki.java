package KaczkaExercise;

public class miniSymulatorKaczki {
	public static void main(String[] args) {
		Kaczka dzika = new DzikaKaczka();
		dzika.wykonajKwacz();
		dzika.wykonajLec();


		System.out.println("\n_______Model Kaczki_______\n");

		Kaczka model = new ModelKaczki();
		model.wykonajLec();
		model.ustawLatanieInterfejs(new LotZNapedemRakietowym());
		model.wykonajLec();




//		Kaczka dzika = new DzikaKaczka();
//		dzika.wykonajKwacz();
//		dzika.wykonajLec();
//		System.out.println("_______hodowlana_________");
//		Kaczka hodowlana = new HdowlanaKaczka();
//		hodowlana.latanieInterfejs.lec();
//		hodowlana.wykonajLec();
//		hodowlana.wykonajKwacz();
	}
}
