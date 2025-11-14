// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		if (args.length < 2) {
			System.out.println("Usage: java Collatz <N> <v|c>");
			return;
		}

		int n = 0;
		try {
			n = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.out.println("First argument must be an integer (N).");
			return;
		}

		String mode = args[1];

		boolean verbose = mode.equals("v");

		// Iterate seeds from 1 to n
		if (verbose) {
			for (int seed = 1; seed <= n; seed++) {
				long cur = seed; // use long to avoid overflow for intermediate values
				int count = 0;
				// print sequence until we reach 1 after at least one step (matches examples)
				StringBuilder sb = new StringBuilder();
				while (true) {
					sb.append(cur).append(" ");
					count++;
					if (cur == 1 && count > 1) {
						break;
					}
					if (cur % 2 == 0) {
						cur = cur / 2;
					} else {
						cur = 3 * cur + 1;
					}
				}
				sb.append("(").append(count).append(")");
				System.out.println(sb.toString().trim());
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		} else {
			// concise mode (any non-"v" mode is treated as concise per assignment)
			// We still need to verify sequences internally but only print summary.
			for (int seed = 1; seed <= n; seed++) {
				long cur = seed;
				int count = 0;
				while (true) {
					count++;
					if (cur == 1 && count > 1) {
						break;
					}
					if (cur % 2 == 0) {
						cur = cur / 2;
					} else {
						cur = 3 * cur + 1;
					}
				}
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
	}
}
