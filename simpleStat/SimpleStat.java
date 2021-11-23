import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SimpleStat {

	private static final int ZERO = 0;
	private static final int INITIAL_SUM = 0;
	private static final int INITIAL_PRODUCT = 1;

	public static void main(String[] args) {
		List<Integer> statArray = getStatArray();

		final long statsSum = getStatsSum(statArray);
		final long statsProduct = getStatsProduct(statArray);

		printSum(statsSum);
		printProduct(statsProduct);
	}

	private static long getStatsProduct(List<Integer> statArray) {
		long statsProduct = INITIAL_PRODUCT;
		for (int statIndex : statArray) {
			statsProduct *= statIndex;
		}
		return statsProduct;
	}

	private static long getStatsSum(List<Integer> statArray) {
		long statsSum = INITIAL_SUM;
		for (int statIndex : statArray) {
			statsSum += statIndex;
		}
		return statsSum;
	}

	private static List<Integer> getStatArray() {
		Scanner statScanner = new Scanner(System.in);
		System.out.println("Enter integer ( 0 or minus for Exit)");

		List<Integer> statArray = new ArrayList<>();
		while (true) {
			int nextStat;
			try {
				nextStat = getNextStat(statScanner);
			} catch (InputMismatchException e) {
				printInvalidInputMsg();
				clearInvalidStat(statScanner);
				continue;
			}

			boolean isInputEnd = nextStat <= ZERO;
			if (isInputEnd)
				break;

			statArray.add(nextStat);
		}

		statScanner.close();
		return statArray;
	}

	private static void printInvalidInputMsg() {
		System.out.println("Invalid input detected!");
	}

	private static void clearInvalidStat(Scanner statScanner) {
		statScanner.nextLine();
	}

	private static int getNextStat(Scanner statScanner) throws InputMismatchException {
		return statScanner.nextInt();
	}

	private static void printProduct(final long product) {
		System.out.println("Product: " + product);
	}

	private static void printSum(final long sum) {
		System.out.println("Sum: " + sum);
	}
}