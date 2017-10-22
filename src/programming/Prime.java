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
public class Prime {
    public static boolean isPrime(int k) {
        boolean flag = false;
        for (int i = 2; i <=k / 2; i++) {
            if (k % i == 0) {
                 flag = true;
                System.out.println("Prime from Divisors = " + i);
                break;
            }
            
        }
        return flag;
    }

    public static void main(String[] args) {
        int k, n = 50;
        for (k = 2; k <= n / 2; k++) {
            if (n % k == 0) {
                //System.out.println(k);
                isPrime(k);
                
        }
    }
}
    
}
