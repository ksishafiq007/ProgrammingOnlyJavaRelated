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
public class ArrayCheck {

    public static void main(String[] args) {
        int x = 1234;
        String[] str1 = Integer.toString(x).split("");
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
        //or Below example
        for (String str2 : str1) {
            System.out.println(str2);
        }
        
    }
}
