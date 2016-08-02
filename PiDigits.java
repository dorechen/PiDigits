import static java.lang.Math.PI;

public class PiDigits {

	public static void main (String[] args) {

		try {
			System.out.println(Integer.parseInt(args[0]));
		} catch (NumberFormatException n){
			System.err.println("Invalid input. Please enter an integer.");
		}
		//System.out.println(String.valueOf(Math.PI));
		//System.out.println(Double.toString(Math.PI));
		//System.out.println(Double.valueOf(Math.PI).toString());
	}
}