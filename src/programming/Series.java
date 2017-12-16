/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

/**
 *
 * @author KSI
 */
public class Series {
    public static void main(String[] args){
    int n=17,i,sum=0,a=5;
   //i=1; 
//    while(i<=n){
//        sum=sum+a;
//        a=a+4;
//        i++;
//         }
    for(i=1;i<=n;i++){
        sum=sum+a;
        a=a+4;
    }
    System.out.println(sum);
    }
    
}
