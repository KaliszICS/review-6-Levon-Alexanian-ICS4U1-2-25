public class PracticeProblem {

	public static int sum(int a, int b) {
		return a + b;

	}


	public static int difference(int a, int b) {
		return a - b;

	}

	
	public static double product(double a, double b) {
		return a * b;

	}

	
	public static String removeFirst(String word) {
		return word.substring(1);

	}

	
	public static int combinedLength(String word, String word1) {
		return word.length() + word1.length();

	}

	
	public static boolean isEven(int a) {
		return a % 2 == 0;

	}

	
	public static boolean isOdd(int a) {
		return a % 2 != 0;

	}

	
	public static boolean isPositive(int a) {
		return a > 0;

	}
	public static boolean isNegative(int a) {
		return a < 0;

	}
}
