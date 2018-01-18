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
//any number given input we will found summation for every element.
public class sumOfDigits {
     int sumofDigit(int value){
        int s=0,a,r;
        a=value;
        while(a!=0)
        {
            r=a%10;
            s=s+r;  
            a=a/10;
    }
        return s;
    }

    public static void main(String[] args) {
        int sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");
        Integer value = scanner.nextInt();
        sum=new sumOfDigits().sumofDigit(value);
        System.out.println("Sum of digit: " +value +" is " +sum);
     }
      
}
