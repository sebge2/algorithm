package format;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

public class FormatToRoman {

    private static final List<Map.Entry<String, Integer>> UNITS = Arrays.asList(
            new AbstractMap.SimpleEntry<>("M", 1000),

            new AbstractMap.SimpleEntry<>("CM", 900),
            new AbstractMap.SimpleEntry<>("DCCC", 800),
            new AbstractMap.SimpleEntry<>("DCC", 700),
            new AbstractMap.SimpleEntry<>("DC", 600),
            new AbstractMap.SimpleEntry<>("D", 500),
            new AbstractMap.SimpleEntry<>("CD", 400),
            new AbstractMap.SimpleEntry<>("CCC", 300),
            new AbstractMap.SimpleEntry<>("CC", 200),
            new AbstractMap.SimpleEntry<>("C", 100),

            new AbstractMap.SimpleEntry<>("XC", 90),
            new AbstractMap.SimpleEntry<>("LXXX", 80),
            new AbstractMap.SimpleEntry<>("LXX", 70),
            new AbstractMap.SimpleEntry<>("LX", 60),
            new AbstractMap.SimpleEntry<>("L", 50),
            new AbstractMap.SimpleEntry<>("XL", 40),
            new AbstractMap.SimpleEntry<>("XXX", 30),
            new AbstractMap.SimpleEntry<>("XX", 20),
            new AbstractMap.SimpleEntry<>("X", 10),

            new AbstractMap.SimpleEntry<>("IX", 9),
            new AbstractMap.SimpleEntry<>("VIII", 8),
            new AbstractMap.SimpleEntry<>("VII", 7),
            new AbstractMap.SimpleEntry<>("VI", 6),
            new AbstractMap.SimpleEntry<>("V", 5),
            new AbstractMap.SimpleEntry<>("IV", 4),
            new AbstractMap.SimpleEntry<>("III", 3),
            new AbstractMap.SimpleEntry<>("II", 2),
            new AbstractMap.SimpleEntry<>("I", 1)
    );

    public static String formatToRoman(int number) {
        if(number == 0){
            return "0";
        }

        final StringBuilder result = new StringBuilder();

        int remaining = number;

        for (Map.Entry<String, Integer> unit : UNITS) {
            final int valueInUnit = getValueInUnit(remaining, unit.getValue());

            result.append(repeat(unit.getKey(), valueInUnit));

            remaining -= valueInUnit * unit.getValue();
        }

        return result.toString();
    }

    private static int getValueInUnit(int number, int unit) {
        return (number - (number % unit)) / unit;
    }

    private static String repeat(String unit, int times) {
        return IntStream.range(0, times)
                .mapToObj(i -> unit)
                .collect(joining());
    }
}
