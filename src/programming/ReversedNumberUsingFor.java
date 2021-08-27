package programming;

public class ReversedNumberUsingFor {
    public static void main(String[] args) {
        int number, reverse = 0;
        for (number = 987654; number != 0; number = number / 10){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);

        int number2 = 1234567, reverse2 = 0;
        for (; number2 != 0;){
            int remainder = number2 % 10;
            reverse2 = reverse2 * 10 + remainder;
            number2 = number2 / 10;
        }
        System.out.println("The reverse of the given number is: " + reverse2);

        int number3 = 786, reverse3 = 0;
        for (; number3 != 0; number3 = number3 / 10){
            int remainder = number3 % 10;
            reverse3 = reverse3 * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse3);
    }
}
