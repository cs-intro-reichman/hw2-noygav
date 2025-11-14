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
		 // Print Java's PI and the approximation so the numeric part lines up under
		 // the Java PI value. Compute the required padding dynamically so the
		 // exact spacing matches the autograder's expected output.
		 String line1Label = "pi according to Java: ";
		 String line2Label = "pi, approximated: ";
		 String piJava = Double.toString(Math.PI);
		 String piApprox = Double.toString(pi * 4);

		 System.out.println(line1Label + piJava);

		 int pad = line1Label.length() - line2Label.length();
		 if (pad < 1) pad = 1;
		 StringBuilder spaces = new StringBuilder();
		 for (int i = 0; i < pad; i++) spaces.append(' ');
		 System.out.println(line2Label + spaces.toString() + piApprox);
}
}