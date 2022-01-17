package programming;

import java.util.Scanner;

public class NthNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth prime number: ");

        int n = sc.nextInt();
        int num=1, count=0, i;
        while (count < n)
        {
            num=num+1;
            for (i = 2; i <= num; i++)
            {
                if (num % i == 0)
                {
                    break;
                }
            }
            System.out.println("Number check :"+num +"....."+i);
            if (i == num)
            {
                count = count+1;
            }
        }
        System.out.println("The " +n +"th prime number is: " + num);
    }
}

