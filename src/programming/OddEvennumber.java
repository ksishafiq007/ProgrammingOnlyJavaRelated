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
public class OddEvennumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a integer type value ");
        Integer value = scanner.nextInt();
        System.out.println((value % 2 == 0) ? "Even " : "ODD");

    }
}
