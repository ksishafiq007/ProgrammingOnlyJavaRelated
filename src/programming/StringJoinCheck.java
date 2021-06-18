package programming;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinCheck {
    public static void main(String[] args) {
        String m="Shafiqul";
        String n="Islam";
        StringJoiner joinName = new StringJoiner(",","[","]");
        joinName.add(m);
        joinName.add(n);
        joinName.add("KSI");
        System.out.println(joinName);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        String commaSeparatedNumbers = numbers.stream()
                .map(i -> i.toString())
                .collect(Collectors.joining(":"));
        System.out.println(commaSeparatedNumbers);

    }

}
