package programming;

import java.util.Scanner;

public class ArmstsrongNumber {
    static boolean isArmstrong(int m)
    {
        int temp, digits=0, last=0, sum=0;
        temp = m;
        while(temp>0){
            temp = temp/10;
            digits++;
        }

        temp = m;
        while(temp>0)
        {
            last = temp % 10;
            sum +=  (Math.pow(last, digits));
            temp = temp/10;
        }

        if(m==sum){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String args[])
    {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the limit: ");
        num=sc.nextInt();
        System.out.println("Armstrong Number up to "+ num + " are: ");
        for(int m=0; m<=num; m++)
            if(isArmstrong(m)){
                System.out.print(m+ ", ");
            }
    }
}
