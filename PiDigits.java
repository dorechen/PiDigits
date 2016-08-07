import static java.lang.Math.PI;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PiDigits {

	public static void main (String[] args) {
		
		int length = 0;
		int digits = 0;

		try {

			if (args.length == 0) {

				Scanner scan = new Scanner (System.in);
				System.out.println("hey! input please!: ");
				digits = scan.nextInt();
				System.out.println(digits + " ");
			} else {

				digits = Integer.parseInt(args[0]);
				String piString = String.valueOf(Math.PI);
				length = piString.length() - 2;
				System.out.println(digits + " digit(s) of Pi:");
				System.out.println(piString.substring(0, digits+2));
			}

		} catch (NumberFormatException n){
			System.err.println("Invalid input. Please enter an integer.");
		} catch (StringIndexOutOfBoundsException s) {
			System.err.println("Invalid input. Please enter a number less than or equal to " + length + ".");
		} catch (ArrayIndexOutOfBoundsException a) {
			System.err.println("No input.");///////////
		} catch (InputMismatchException i) {
			System.err.println("Invalid input. Please enter an integer.");
		}

		//System.out.println(String.valueOf(Math.PI));
		//System.out.println(Double.toString(Math.PI));
		//System.out.println(Double.valueOf(Math.PI).toString());
	}
}