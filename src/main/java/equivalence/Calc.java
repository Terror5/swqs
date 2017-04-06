package equivalence;

public class Calc {
	
	public static double dailyWage(Profession prof, int day, double hours) {
		return 0;
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
