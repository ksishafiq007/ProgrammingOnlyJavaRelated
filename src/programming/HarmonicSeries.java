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
public class HarmonicSeries {
    int n;
    
    public static void main(String[] args){
        float i,sum,t;
        System.out.println("1+1/2+1/3+1/4+.........+1/n");
        System.out.println("Enter the value of");
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        sum=0;
        for(i=1;i<=n;i++){
        t=1/i;
        sum=sum+t;      
        }
        System.out.println(sum);
        
    }
    
    
}
