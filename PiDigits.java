import static java.lang.Math.PI;

public class PiDigits {

	public static void main (String[] args) {
		
		int length = 0;

		try {
			int digits = Integer.parseInt(args[0]);
			String piString = String.valueOf(Math.PI);
			length = piString.length() - 2;
			System.out.println(digits + " digit(s) of Pi:");
			System.out.println(piString.substring(0, digits+2));
		} catch (NumberFormatException n){
			System.err.println("Invalid input. Please enter an integer.");
		} catch (StringIndexOutOfBoundsException s) {
			System.err.println("Invalid input. Please enter a number less than or equal to " + length + ".");
		}

		//System.out.println(String.valueOf(Math.PI));
		//System.out.println(Double.toString(Math.PI));
		//System.out.println(Double.valueOf(Math.PI).toString());
	}
}