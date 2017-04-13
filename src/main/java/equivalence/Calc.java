package equivalence;

import java.time.DateTimeException;

public class Calc {
	
	public static double dailyWage(Profession prof, int day, double hours) {
		
		double wage = 0.00d;
		
		switch (prof) {
		case BAKER: wage = 10.0d; break;
		case TEACHER: wage = 20.0d; break;
		case DOCTOR: wage = 30.0d; break;
		case RETIRED: break;
		case UNEMPLOYED: break;
		}
		
		if(hours > 12 || hours < 0) {
			throw new DateTimeException("Too many hours");
		} else {
			wage *= hours;
		}
		
		if(day > 5 && day < 8){
			wage *= 1.1d;
		} else if (day < 1 || day > 7) {
			throw new DateTimeException("weekdays out of bound");
		}
		
		return wage;
	}

	public static int monthlyCharge(int duration) {
		int amount = 0;
		if (duration >= 0) {
			amount = 2000;
		}
		if (duration > 100) {
			if (duration <= 200) {
				amount = amount + (duration - 100) * 5;
			} else {
				amount = amount + 500 + (duration - 200) * 3;
			}
		}
		return amount;
	}
}
