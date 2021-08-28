package programming;

public class NumberToWord {

    public static  void numberToWords(char num[]){
        int len=num.length;
        //System.out.println(len);

        if (len == 0){
            System.out.println("The string is empty");
            return;
        }

        if (len > 4){
            System.out.println("\n The given number has more than 4 digits.");
            return;
        }

    }
    public static void main(String[] args) {
        numberToWords("786".toCharArray());
        numberToWords("".toCharArray());
        numberToWords("1000".toCharArray());
        numberToWords("12345".toCharArray());
    }
}
