package programming;

import java.util.Random;

public class RandomUsingRandomClass {
    public static void main(String[] args) {
        Random random = new Random();
        // Generates random integers 0 to 49
        int x = random.nextInt(50);
// Generates random integers 0 to 999
        int y = random.nextInt(1000);
        // Generates random integers 0 to 99999
        int z = random.nextInt(100000);
// Prints random integer values
        System.out.println("Randomly Generated Integers Values");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
// Generates Random doubles values
        double a = random.nextDouble();
        double b = random.nextDouble();
        double c = random.nextDouble();
// Prints random double values
        System.out.println("Randomly Generated Double Values");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
// Generates Random float values
        float f=random.nextFloat();
        float i=random.nextFloat();
// Prints random float values
        System.out.println("Randomly Generated Float Values");
        System.out.println(f);
        System.out.println(i);
// Generates Random Long values
        long p = random.nextLong();
        long q = random.nextLong();
// Prints random long values
        System.out.println("Randomly Generated Long Values");
        System.out.println(p);
        System.out.println(q);
// Generates Random boolean values
        boolean m=random.nextBoolean();
        boolean n=random.nextBoolean();
// Prints random boolean values
        System.out.println("Randomly Generated Boolean Values");
        System.out.println(m);
        System.out.println(n);
    }
}
