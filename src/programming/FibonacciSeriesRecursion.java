/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

import java.util.Scanner;

/**
 *
 * @author KSI
 */
public class FibonacciSeriesRecursion {

    static int first = 0, second = 1, sum;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Number:");
        Integer value = scanner.nextInt();
        System.out.print(first + " " + second + " ");
        new FibonacciSeriesRecursion().fibonacci(value);

    }

    void fibonacci(int value) {

        if (value > 0) {

            sum = first + second;
            first = second;
            second = sum;
            System.out.print(sum + " ");
            fibonacci(value - 1);
        }
    }

}
