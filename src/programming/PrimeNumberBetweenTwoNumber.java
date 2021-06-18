package programming;

import java.util.Scanner;

public class PrimeNumberBetweenTwoNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int startNumber=scanner.nextInt();
        System.out.println("Enter the last number:");
        int lastNumber=scanner.nextInt();
        System.out.println("List of prime numbers between " + startNumber + " and " + lastNumber);
        for (int i=startNumber;i<=lastNumber;i++){
            if (isPrimeCheck(i)){
                System.out.println(i);
            }

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
