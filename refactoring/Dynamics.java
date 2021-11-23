package refactoring.symbolicconstant.before;

public class Dynamics {
	/**
	 *
	 */
	private static final double GRAVITY = 9.81;

	public double getPotentialEnergy(final double mass, final double height) {
		return mass * GRAVITY * height;
	}

	public double getWeight(final double mass) {
		return mass * GRAVITY;
	}
}
