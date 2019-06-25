package KaczkaExercise;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DzikaKaczkaTest {

	@Test
	public void shoulDzikaKaczka(){
		//given
		Kaczka dzika = new DzikaKaczka();
		LatamBoMamSkrzydla latam = new LatamBoMamSkrzydla();
		latam.lec();
		//when
		dzika.wykonajLec();
		dzika.wykonajKwacz();
		//then

	}


}