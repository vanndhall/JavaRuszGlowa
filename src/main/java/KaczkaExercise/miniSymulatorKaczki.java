package KaczkaExercise;

public class miniSymulatorKaczki {
	public static void main(String[] args) {
		Kaczka dzika = new DzikaKaczka();
		dzika.wykonajKwacz();
		dzika.wykonajLec();


		System.out.println("_______hodowlana_________");
		Kaczka hodowlana = new HdowlanaKaczka();
		hodowlana.latanieInterfejs.lec();
		hodowlana.wykonajLec();
		hodowlana.wykonajKwacz();
	}
}
