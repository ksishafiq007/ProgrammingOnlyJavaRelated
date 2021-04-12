package programming;

public class MathAPIExamples {
	public static void main(String[] args) {
		int a = 10;
		int b = -19;
		double x = 152.3;
		double y = 0.349;
		// absolute value
		System.out.println("|" + a + "| is " + Math.abs(a));
		System.out.println("|" + b + "| is " + Math.abs(b));
		System.out.println("|" + x + "| is " + Math.abs(x));
		System.out.println("|" + y + "| is " + Math.abs(y));

		// sqrt(x)
		int p = 2;
		int q = 3;
		System.out.println("The squire root of " + p + " is " + Math.sqrt(p));
		System.out.println("The squire root of " + q + " is " + Math.sqrt(q));

		// Rounding functions
		double m = 0.649;
		System.out.println(x + " is approximately " + Math.round(x));
		System.out.println(y + " is approximately " + Math.round(y));
		System.out.println(m + " is approximately " + Math.round(m));

		// The "ceiling" of a number
		System.out.println("The ceiling of " + a + " is " + Math.ceil(a));
		System.out.println("The ceiling of " + b + " is " + Math.ceil(b));
		System.out.println("The ceiling of " + x + " is " + Math.ceil(x));
		System.out.println("The ceiling of " + y + " is " + Math.ceil(y));

		// The "floor" of a number
		System.out.println("The floor of " + a + " is " + Math.floor(a));
		System.out.println("The floor of " + b + " is " + Math.floor(b));
		System.out.println("The floor of " + x + " is " + Math.floor(x));
		System.out.println("The floor of " + y + " is " + Math.floor(y));

	}

}
