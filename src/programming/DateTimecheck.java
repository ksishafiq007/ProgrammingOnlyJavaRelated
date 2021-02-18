/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

import java.util.Scanner;

public class DateTimecheck {

    public boolean check(int d) {
        int m = 31;
        if (d <= m) {

        } else {

            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Date");
        int d = sc.nextInt();
        DateTimecheck dtc = new DateTimecheck();
        dtc.check(d);
       
        System.out.print("Valid");
        
        System.out.print("Not Valid");

    }

}
