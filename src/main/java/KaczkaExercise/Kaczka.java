package KaczkaExercise;

public abstract class Kaczka {
	LatanieInterfejs latanieInterfejs;
	KwakanieInterfejs kwakanieInterfejs;

	public void ustawLatanieInterfejs (LatanieInterfejs li){
		latanieInterfejs = li;
	}

	public void ustawKwakanieInterfejs(KwakanieInterfejs ki){
		kwakanieInterfejs = ki;
	}

	public Kaczka(){

	}

	public abstract void wyswietl();

	public void wykonajLec(){
		latanieInterfejs.lec();
	}

	public void wykonajKwacz(){
		kwakanieInterfejs.kwacz();
	}

	public void plywaj(){
		System.out.println("Wszystkie kaczki pływają, nawet te sztuczne! :)");
	}

}
