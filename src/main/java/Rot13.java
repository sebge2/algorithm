import java.util.stream.Collectors;

public class Rot13 {

    private static final int SHIFT = 13;
    private static final int MIN = 'A';
    private static final int MAX = 'Z';
    private static final int RANGE = (MAX - MIN + 1);

    public static String transformToRot13(String value) {
        return value.chars()
                .map((int character) -> {
                    if ((character < MIN) || (character > MAX)) {
                        return character;
                    }

                    final int mappedChar = character - MIN;
                    final int rest = ((mappedChar + SHIFT) % RANGE);

                    return MIN + rest;
                })
                .mapToObj(character -> ((Character) (char) character).toString())
                .collect(Collectors.joining());
    }
}
