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


        String[] oneDigits = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] twoDigits = new String[]{"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] multipleOfTens = new String[]{"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] powerOfTens = new String[]{"Hundred","Thousand"};
        System.out.print(String.valueOf(num) + ": ");

        if (len == 1){
            System.out.println(oneDigits[num[0]-'0']);
            return;
        }

        int x = 0;
        while (x < num.length){
            if (len >= 3){
                if (num[x]-'0' != 0){
                    System.out.print(oneDigits[num[x]-'0'] + " ");
                    System.out.print(powerOfTens[len-3] + " ");
                }
                --len;
            } else {
                if (num[x]-'0' == 1){
                    int sum = num[x]-'0' + num[x + 1]-'0';
                    System.out.println(twoDigits[sum]);
                    return;
                } else if (num[x]-'0' == 2 && num[x + 1]-'0' == 0){
                    System.out.println("Twenty");
                    return;
                } else {
                    int i= (num[x] - '0');
                    if (i > 0){
                        System.out.print(multipleOfTens[i] + " ");
                    } else {
                        System.out.print("");
                    }
                    ++x;
                    if (num[x] - '0' !=0){
                        System.out.println(oneDigits[num[x] - '0']);
                    }
                }
            }
            ++x;
        }
    }
    public static void main(String[] args) {

        numberToWords("3".toCharArray());
        numberToWords("786".toCharArray());
        numberToWords("".toCharArray());
        numberToWords("1359".toCharArray());
        numberToWords("1111".toCharArray());
        numberToWords("673".toCharArray());
        numberToWords("85".toCharArray());
        numberToWords("5".toCharArray());
        numberToWords("0".toCharArray());
        numberToWords("20".toCharArray());
        numberToWords("1000".toCharArray());
        numberToWords("12345".toCharArray());
    }
}
