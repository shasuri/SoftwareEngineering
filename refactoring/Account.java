package refactoring.movemethod.before;

public class Account {
	private int daysOverdrawn;
	private AccountType type;

	public int getDaysOverdrawn() {
		return this.daysOverdrawn;
	}

	public void setDaysOverdrawn(int daysOverdrawn) {
		this.daysOverdrawn = daysOverdrawn;
	}

	public double bankCharge() {
		double result = 4.5;
		if (daysOverdrawn > 0)
			result += type.overdraftCharge(daysOverdrawn);
		return result;
	}
}
