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
public class FibonacciSeries { 
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter Your Number:");
        Integer value = scanner.nextInt();
       new FibonacciSeries().fibonacci(value);
    }
    void fibonacci(int value){
        int a,b,c,i;
        a=0;
        b=1;
        i=1;
        System.out.print(a+" "+b);
        while(i<=value){
        c=a+b;
        a=b;
        b=c;
        System.out.print(" "+b);
        i++;
        }
     
    }
}
