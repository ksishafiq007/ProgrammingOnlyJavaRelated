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
public class LeapyearCheck {

    public static void main(String[] args) {

        System.out.println("Enter your year");
        Scanner sc = new Scanner(System.in);
        Integer year = sc.nextInt();

        if (year % 4 != 0) {
            System.out.println("It is a not Leap Year");
        } else {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("It is a Leap Year:" + year);
                } else {
                    System.out.println("It is  not a Leap Year:" + year);
                }
            } else {
                System.out.println("It is a Leap Year:" + year);
            }
        }
    }
}
