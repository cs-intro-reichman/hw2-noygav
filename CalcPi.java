// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int numOfTerms =Integer.parseInt(args[0]);
		int div = 1;
		int sign = -1;
		double pi = 0.0;
		for(int i=0; i< numOfTerms; i++)
		 {
			sign *= -1;
			pi += (double)sign / (double)div;
			div += 2;
		 }
		 // Print Java's PI and the approximation; right-align the approximated value so
		 // it lines up visually under the Java PI value (padding to match expected output).
		 System.out.printf("pi according to Java: %s%n", Math.PI);
		 System.out.printf("pi, approximated: %20s%n", Double.toString(pi * 4));
}
}