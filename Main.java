import java.util.*;
import java.lang.*;

public class Main {

	public static void menuDisplay() {
		System.out.println();
		System.out.println("1. Calculate circle area.");
		System.out.println("2. Calculate rectangle area.");
		System.out.println("3. Calculate triangle area.");
		System.out.println("4. quit.");
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int answer = 0;

		while (answer != 4) {
			menuDisplay();
			System.out.println("Enter a choice: ");
			answer = scan.nextInt();

			while ((answer != 1) && (answer != 2) && (answer != 3) && (answer != 4)) {
				System.out.println("Wrong answer, enter something from the menu");
				menuDisplay();
				answer = scan.nextInt();
			}
			
			switch (answer) {
			case 1:
				System.out.println("Enter a radius");
				double radius = scan.nextDouble();
				System.out.println("Circle area is: ");
				System.out.print(Geometry.circleArea(radius));
				System.out.println();
				break;

			case 2:
				System.out.println("Enter a length: ");
				double length = scan.nextDouble();
				System.out.println("Enter a width: ");
				double width = scan.nextDouble();
				System.out.println("Rectangle area is: ");
				System.out.println(Geometry.rectangleArea(length, width));
				System.out.println();
				break;

			case 3:
				System.out.println("Enter a base: ");
				double base = scan.nextDouble();
				System.out.println("Enter a height: ");
				double height = scan.nextDouble();
				System.out.println("Triangle area is: ");
				System.out.println(Geometry.triangleArea(base, height));
				System.out.println();
				break;

			case 4:
				System.out.println();
				System.out.println("You have chosen to leave");
				break;

			}// case
		} // program loop
		System.out.println("Goodbye");

	}// main
}// class