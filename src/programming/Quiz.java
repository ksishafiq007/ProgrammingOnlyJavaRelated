/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

public class Quiz {

    int x = 7;
    

    public Quiz() {
         System.out.println("kkkkkkkk"+x);
        x++;
        //System.out.println("*******a******" + x);
    }

    public Quiz(int i) {
         System.out.println("p"+x);
         System.out.println(i);
        x=x+i;
       System.out.println("*******c****"+x);
       
    }

    public int getValue(int i) {
        System.out.println("tttttt"+x);
        x += i;
       System.out.println("*******b*******" + x);
        return x;
    }

    public static void main(String[] args) {
     new Quiz(new Quiz().getValue(3));
     
      
    }

}
