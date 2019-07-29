import java.util.Scanner;

public class Validator {
	public static double getDouble(Scanner sc) {
		while (true) {
			if (sc.hasNextDouble()) {
				return sc.nextDouble();
			} else {
				System.err.println("Error: not a valid double.");
				sc.nextLine();
			}
		}
	}
	
	public static boolean getYesNo(Scanner sc) {
		while (true) {
			String line = sc.nextLine().toLowerCase().trim();
			if (line.equals("y") || line.equals("yes")) {
				return true;
			} else if (line.equals("n") || line.equals("no")) {
				return false;
			} else {
				System.out.println("Please input y/n or yes/no.");
			}
		}
	}
}