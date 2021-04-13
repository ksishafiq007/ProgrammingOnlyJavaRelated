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

		// Comparison operators
		// min
		System.out.println("min(" + a + "," + b + ") is " + Math.min(a, b));
		System.out.println("min(" + x + "," + y + ") is " + Math.min(x, y));
		System.out.println("min(" + a + "," + x + ") is " + Math.min(a, x));
		System.out.println("min(" + y + "," + b + ") is " + Math.min(y, b));

		// max
		System.out.println("max(" + a + "," + b + ") is " + Math.max(a, b));
		System.out.println("max(" + x + "," + y + ") is " + Math.max(x, y));
		System.out.println("max(" + a + "," + x + ") is " + Math.max(a, x));
		System.out.println("max(" + y + "," + b + ") is " + Math.max(y, b));

		// Math E & PI
		System.out.println("Pi is " + Math.PI);
		System.out.println("e is " + Math.E);

		// Trigonometric operations
		// All arguments in radians
		// Convert a 45 degree angle to radians
		double angle = 45.0 * 2.0 * Math.PI / 360;
		System.out.println("cos(" + angle + ") is " + Math.cos(angle));
		System.out.println("sin(" + angle + ") is " + Math.sin(angle));
		double angle2 = 60.0 * 2.0 * Math.PI / 360;
		System.out.println("cos(" + angle + ") is " + Math.cos(angle2));
		System.out.println("sin(" + angle + ") is " + Math.sin(angle2));
		
		// Inverse Trigonometric operations
	    // All values are returned as radians
		double value=0.707;
		System.out.println("acos(" + value + ") is " + Math.acos(value));
		System.out.println("asin(" + value + ") is " + Math.asin(value));
		System.out.println("atan(" + value + ") is " + Math.atan(value));
		

	}

}
