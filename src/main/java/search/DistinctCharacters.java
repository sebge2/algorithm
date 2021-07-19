package search;

public class DistinctCharacters {

    public static String findLongestDistinctSubstring(String value) {
        StringBuilder longestChain = new StringBuilder();
        StringBuilder currentChain = new StringBuilder();

        for (int i = 0; i < value.length(); i++) {
            final char currentCharacter = value.charAt(i);

            if (currentChain.indexOf(currentCharacter + "") >= 0) {
                currentChain = new StringBuilder();
            }

            currentChain.append(currentCharacter);

            if (currentChain.length() > longestChain.length()) {
                longestChain = currentChain;
            }
        }

        return longestChain.toString();
    }
}
