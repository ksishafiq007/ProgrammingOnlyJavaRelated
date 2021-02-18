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
//sum=1+x+x^2/2!+x^3/3!+x^4/4!+.......
public class SumofdigitsfractionSerieswithplus {
     float sumofDigit(int value,int value2){
        float s=1,term=1;
        int n,x,i;
        n=value;
        x=value2;
        for(i=1;i<n;i++){
            
            term=term*x/(float)i;
            s=s+term;
            
        }
        return s;
    }
    public static void main(String[] args){
    float sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of terms:");
        Integer value = scanner.nextInt();
        System.out.println("Enter X Value:");
        Integer value2 = scanner.nextInt();
        sum=new SumofdigitsfractionSerieswithplus().sumofDigit(value,value2);
        System.out.println("Sum of Series: "+sum);
}
}