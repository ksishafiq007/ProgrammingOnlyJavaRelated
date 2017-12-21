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
public class EvenNumberSum {
    int sumofEvenNumber(int value){
        int s=0,a,i;
        a=value; 
        //i=1 if Odd number will be count    
        for(i=2; i<=a;i=i+2){   
            s=s+i;
        }
        return s;
    }
    public static void main(String[] args) { 
        int sum;
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter Your Number:");
        Integer value = scanner.nextInt();
        sum=new EvenNumberSum().sumofEvenNumber(value);
        System.out.println("Sum of Even Number: " +sum);
    }
    
}
