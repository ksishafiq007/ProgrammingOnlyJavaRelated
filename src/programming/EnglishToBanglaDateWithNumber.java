package programming;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EnglishToBanglaDateWithNumber {
    private static final char[] banglaDigits = {'০', '১', '২', '৩', '৪', '৫', '৬', '৭', '৮', '৯'};
    private static final char[] englishDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static void main(String[] args) {
        EnglishToBanglaDateWithNumber etbd = new EnglishToBanglaDateWithNumber();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String result = etbd.getDigitBanglaFromEnglish(dtf.format(now));
        System.out.println(result);
        String resultAnother = etbd.getDigitBanglaFromEnglish(dtf2.format(now));
        System.out.println(resultAnother);
    }

    public static final String getDigitBanglaFromEnglish(String number) {
        if (number == null)
            return new String("");
        StringBuilder builder = new StringBuilder();
        try {
            for (int i = 0; i < number.length(); i++) {
                if (Character.isDigit(number.charAt(i))) {
                    if (((int) (number.charAt(i)) - 48) <= 9) {
                        builder.append(banglaDigits[(int) (number.charAt(i)) - 48]);

                    } else {
                        builder.append(number.charAt(i));
                    }

                } else {
                    builder.append(number.charAt(i));
                }
            }
        } catch (Exception e) {
            return new String("");
        }
        return builder.toString();

    }
}

