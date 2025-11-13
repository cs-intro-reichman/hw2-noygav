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
		 System.out.println("pi according to Java: " + Math.PI);
		 System.out.println("pi, approximated: " + pi * 4);
}
}