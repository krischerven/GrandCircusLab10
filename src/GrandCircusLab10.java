import java.util.Scanner;

public class GrandCircusLab10 {

	public static void main(String[] args) {	
		final Scanner sc = new Scanner(System.in);
		boolean cont = true;
		int circles = 0;
		while (cont) {
			System.out.println("Please input a circle radius.");
			final Circle circ = new Circle(Validator.getDouble(sc));
			++circles;
			sc.nextLine(); // discard garbage line
			System.out.println(circ.getFormattedArea());
			System.out.println(circ.getFormattedCircumference());
			System.out.println("Make another circle? (y/n)");
			cont = Validator.getYesNo(sc);
		}
		String s = "";
		if (circles != 1) {
			s = "s";
		}
		System.out.println("Goodbye. You made " + circles + " circle"+s+".");
	}
}
