

public class Geometry {

	public static final double pie = 3.1315;

	public static double circleArea(double radius) {
		double circleArea = pie * radius * radius;
		return circleArea;
	}

	public static double rectangleArea(double length, double width) {
		double rectangleArea = length * width;
		return rectangleArea;
	}

	public static double triangleArea(double base, double height) {
		double triangleArea = .5 * base * height;
		return triangleArea;
	}

}
