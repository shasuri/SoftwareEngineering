package refactoring.extractmethod;

public class Screen {

	public void displayMessage(String string) {
		// TODO Auto-generated method stub

	}

	public void displayDollarAmount(double totalBalance) {
		// TODO Auto-generated method stub

	}

	private void displayBalnace(double totalBalance) {
		displayMessage("Balance Information:");
		displayMessage(" - Total balance:     ");
		displayDollarAmount(totalBalance);
	}
}
