package programming;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class EnglishToBanglaDate {
    public static void main(String[] args) {
        Locale bangla = Locale.forLanguageTag("bn-BD");
        DateTimeFormatter timeFormatter = DateTimeFormatter
                .ofLocalizedTime(FormatStyle.FULL)
                .withLocale(bangla);
        String formattedTime
                = ZonedDateTime.now(ZoneId.of("Asia/Dhaka")).format(timeFormatter);
        System.out.println(formattedTime);
    }
}
