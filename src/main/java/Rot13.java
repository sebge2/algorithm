import java.util.stream.Collectors;

public class Rot13 {

    private static final int SHIFT = 13;
    private static final int MIN = 'A';
    private static final int MAX = 'Z';
    private static final int RANGE = (MAX - MIN + 1);

    public static String transformToRot13(String value) {
        return value.chars()
                .map((int currentCharValue) -> {
                    if ((currentCharValue < MIN) || (currentCharValue > MAX)) {
                        return currentCharValue;
                    }

                    final int mappedChar = currentCharValue - MIN;
                    final int remaining = ((mappedChar + SHIFT) % RANGE);

                    return MIN + remaining;
                })
                .mapToObj(character -> ((Character) (char) character).toString())
                .collect(Collectors.joining());
    }

    public static String transformToRot13Bis(String value) {
        return value.chars()
                .map((int currentCharValue) -> {
                    final char currentChar = (char) currentCharValue;
                    if (currentChar >= 'a' && currentChar <= 'm') {
                        return currentChar + 13;
                    } else if (currentChar >= 'A' && currentChar <= 'M') {
                        return currentChar + 13;
                    } else if (currentChar >= 'n' && currentChar <= 'z') {
                        return currentChar - 13;
                    } else if (currentChar >= 'N' && currentChar <= 'Z') {
                        return currentChar - 13;
                    } else {
                        return currentChar;
                    }
                })
                .mapToObj(character -> ((Character) (char) character).toString())
                .collect(Collectors.joining());
    }
}
