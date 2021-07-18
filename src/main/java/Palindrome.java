import java.util.stream.Stream;

public class Palindrome {

    public static String[] filterPalindromes(String[] values) {
        return Stream.of(values)
                .filter(Palindrome::isPalindrome)
                .toArray(String[]::new);

    }

    public static boolean isPalindrome(String text) {
        int i = 0;
        int j = text.length() - 1;

        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

}
