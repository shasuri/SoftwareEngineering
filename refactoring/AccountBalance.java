package refactoring.extractmethod.before;

import refactoring.extractmethod.BankDatabase;
import refactoring.extractmethod.Screen;

public class AccountBalance {
	public void execute(BankDatabase bankDatabase, int accountNumber, Screen screen) {
		// get the total balance for the account involved
		double totalBalance = bankDatabase.getTotalBalance(accountNumber);

		// display the balance information on the screen
		displayBalnace(screen, totalBalance);
	}
}
