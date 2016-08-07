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
				System.out.println("Please enter the number of digits of Pi you want displayed: ");
				digits = scan.nextInt();
				getPiDigits(digits);
				scan.close();
			} else {

				digits = Integer.parseInt(args[0]);
				getPiDigits(digits);
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

	public static void getPiDigits(int digits) {

		String piString = String.valueOf(Math.PI);
		int length = piString.length() - 2;
		System.out.println(digits + " digit(s) of Pi:");
		System.out.println(piString.substring(0, digits+2));
	}
}