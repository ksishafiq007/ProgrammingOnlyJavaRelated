package programming;

import java.util.Scanner;

public class PrimeNumberCheckFromUserInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        if (isPrimeCheck(n)){
            System.out.println(n + " is a prime number");
        }else {
            System.out.println(n + " is not a prime number");
        }

    }
    public static boolean isPrimeCheck(int n){
        if (n<-1){
            return false;
        }
        for (int i=2;i<Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
