package equivalence;

import static org.junit.Assert.*;

import java.time.DateTimeException;

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

	@Test(expected=NullPointerException.class)
	public void invalidProfession() {
		assertEquals(0, Calc.dailyWage(null, 0, 0),0.001d);
	}
	
	@Test
	public void validProfessionBakerValidDayValidHours() {
		assertEquals(120, Calc.dailyWage(Profession.BAKER, 1, 12),0.001d);
	}

	@Test
	public void validProfessionDoctorValidBonusDayValidHours() {
		assertEquals(396, Calc.dailyWage(Profession.DOCTOR, 6, 12),0.001d);
	}
	
	@Test
	public void validProfessionTeacherValidDayValidHours() {
		assertEquals(200, Calc.dailyWage(Profession.TEACHER, 1, 10),0.001d);
	}
	
	@Test(expected=DateTimeException.class)
	public void validProfessionRetiredInvalidDayLower() {
		assertEquals(0, Calc.dailyWage(Profession.RETIRED, 0, 10),0.001d);
	}
	
	@Test(expected=DateTimeException.class)
	public void validProfessionUnemployedInvalidDayUpper() {
		assertEquals(0, Calc.dailyWage(Profession.UNEMPLOYED, 8, 10),0.001d);
	}
	
	@Test(expected=DateTimeException.class)
	public void validProfessionUnemployedInvalidHoursLower() {
		assertEquals(0, Calc.dailyWage(Profession.UNEMPLOYED, 1, -1),0.001d);
	}
	
	@Test(expected=DateTimeException.class)
	public void validProfessionUnemployedInvalidHoursUpper() {
		assertEquals(0, Calc.dailyWage(Profession.UNEMPLOYED, 1, 13),0.001d);
	}
	
	/*
	 * TEST OF MONTHLY CHARGE
	 */
	
	@Test
	public void statementCoverageDurationLower() {
		assertEquals(2500, Calc.monthlyCharge(200));
	}
	
	@Test
	public void statementCoverageDurationUpper() {
		assertEquals(2503, Calc.monthlyCharge(201));
	}
	
	@Test
	public void branchCoverageDurationLower() {
		assertEquals(0, Calc.monthlyCharge(-1));
	}
	
	@Test
	public void pathCoverageDurationLower() {
		assertEquals(2000, Calc.monthlyCharge(0));
	}
	
	
	
}
