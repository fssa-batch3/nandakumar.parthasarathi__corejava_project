package day05.solved;

public class Rectangle extends Polygon {
	@Override
	public double area(double a, double b) {
		System.out.println("Calculating Rectangle area");
		return a * b;
	}
}
