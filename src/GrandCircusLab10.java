import java.util.Scanner;

public class GrandCircusLab10 {
	
	private static double getRadius(Scanner sc) {
		while (true) {
			if (sc.hasNextDouble()) {
				return sc.nextDouble();
			} else {
				System.err.println("Error: not a valid double.");
				sc.nextLine();
			}
		}
	}
	
	private static boolean getYesNo(Scanner sc) {
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

	public static void main(String[] args) {	
		final Scanner sc = new Scanner(System.in);
		boolean cont = true;
		int circles = 0;
		while (cont) {
			System.out.println("Please input a circle radius.");
			final Circle circ = new Circle(getRadius(sc));
			++circles;
			sc.nextLine(); // discard garbage line
			System.out.println(circ.getFormattedArea());
			System.out.println(circ.getFormattedCircumference());
			System.out.println("Make another circle? (y/n)");
			cont = getYesNo(sc);
		}
		String s = "";
		if (circles != 1) {
			s = "s";
		}
		System.out.println("Goodbye. You made " + circles + " circle"+s+".");
	}
}
