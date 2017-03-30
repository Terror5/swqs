package atm;

public class Cash {
	private int count5;
	private int count20;
	private int count50;
	
	public Cash(int count5, int count20, int count50) {
		this.count5 = count5;
		this.count20 = count20;
		this.count50 = count50;
	}

	public int getCount5() {
		return count5;
	}

	public int getCount20() {
		return count20;
	}

	public int getCount50() {
		return count50;
	}
	
	public String toString() {
		return count5 + " x €5, " + count20 + " x €20, " + count50 + " x €50";
	}
}
