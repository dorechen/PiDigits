import static java.lang.Math.PI;

public class PiDigits {

	public static void main (String[] args) {

		int digits = Integer.parseInt(args[0]);
		String piString = String.valueOf(Math.PI);

		try {
			System.out.println(Integer.parseInt(args[0]) + " digit(s) of Pi:");
			//int digits = Integer.parseInt(args[0]);
			//String piString = String.valueOf(Math.PI);
			System.out.println(piString.substring(0, digits));
		} catch (NumberFormatException n){
			System.err.println("Invalid input. Please enter an integer.");
		} catch (StringIndexOutOfBoundsException s) {
			System.err.println("Invalid input. Please enter a number less than " + piString.length() + ".");
		}

		//System.out.println(String.valueOf(Math.PI));
		//System.out.println(Double.toString(Math.PI));
		//System.out.println(Double.valueOf(Math.PI).toString());
	}
}