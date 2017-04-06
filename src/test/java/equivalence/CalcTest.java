package equivalence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void invalidProfession() {
		assertEquals(0, Calc.dailyWage(null, 0, 0),0.001d);
	}
	
	@Test
	public void validProfessionBaker() {
		assertEquals(0, Calc.dailyWage(Profession.BAKER, 0, 0),0.001d);
	}

	@Test
	public void validProfessionDoctor() {
		assertEquals(0, Calc.dailyWage(Profession.DOCTOR, 0, 0),0.001d);
	}
	
	@Test
	public void validProfessionRetired() {
		assertEquals(0, Calc.dailyWage(Profession.RETIRED, 0, 0),0.001d);
	}
	
	@Test
	public void validProfessionTeacher() {
		assertEquals(0, Calc.dailyWage(Profession.TEACHER, 0, 0),0.001d);
	}
	
	@Test
	public void validProfessionUnemployed() {
		assertEquals(0, Calc.dailyWage(Profession.UNEMPLOYED, 0, 0),0.001d);
	}
	
	
	
	
	
	/*
	 * TEST OF MONTHLY CHARGE
	 */

}
