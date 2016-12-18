import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {	
	static double result;

	// Operators
	
	public static double square(double a) {
		return Math.pow(a, 2);
	}
	
	// w = width
	// h = height
	public static double rectangle(double w, double h) {
		return w * h;
	}
	
	// b = base
	// h = height
	public static double triangle(double b, double h) {
		return b * h;
	}
	
	// r = radius
	public static double circle(double r) {
		return Math.PI * (Math.pow(r, 2));
	}
	
	// Menu
		
	public static void menu() {
		System.out.println("****************************************");
		System.out.println("****                                ****");
		System.out.println("**** @app    Area Calculator        ****");
		System.out.println("**** @author Miguel Barra           ****");
		System.out.println("****                                ****");
		System.out.println("****************************************");
		System.out.println("");
	}
	
	// shape menu
	public static void shape(String shape) {
		menu();
		System.out.println(shape);
		System.out.println(""); // just a break line
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// Dictionary 
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("1", "SQUARE");
		dictionary.put("2", "RECTANGLE");
		dictionary.put("3", "TRIANGLE");
		dictionary.put("4", "CIRCLE");
		
		menu();
		
		System.out.print("Please select:");
		
		// just a break line
		System.out.println("");
		
		System.out.println("1. Area of a square");
		System.out.println("2. Area of a rectangle");
		System.out.println("3. Area of a triangle");
		System.out.println("4. Area of a circle");
		System.out.println("0. Exit \n");
		
		System.out.print("Enter selection [1-4] > ");
		
		Scanner scanner = new Scanner(System.in);
		
		int option = scanner.nextInt();
		
		switch (option) {
		case 1:
		case 2:
		case 3:
		case 4:			
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			String strOption = String.valueOf(option);
			String value = dictionary.get(strOption);
			shape(value);
			switch (option) {
				case 1:
					System.out.print("length of side: ");
					double a = scanner.nextDouble();
					result = square(a);
					// System.out.print("The area is: ");
					// System.out.printf("%.0f", result);
					break;
				case 2:
					System.out.print("width: ");
					double wRectangle = scanner.nextDouble();
					System.out.print("height: ");
					double hRectangle = scanner.nextDouble();
					result = rectangle(wRectangle, hRectangle);
					break;
				case 3:
					System.out.print("base: ");
					double bTriangle = scanner.nextDouble();
					System.out.print("vertical height: ");
					double hTriangle = scanner.nextDouble();
					result = triangle(bTriangle, hTriangle);
					break;
				case 4:
					System.out.print("radius: ");
					double radius = scanner.nextDouble();
					result = circle(radius);
					break;
			}
		}
		scanner.close();
	}
}
