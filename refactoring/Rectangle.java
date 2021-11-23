package refactoring.splittemporaryvariable.before;

public class Rectangle {
	private int width, height;
	
	public void printInfo() {
		double temp = 2 * (width + height);
		System.out.println(temp);
		temp = width * height;
		System.out.println(temp);
	}
}
