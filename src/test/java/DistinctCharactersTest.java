import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistinctCharactersTest {

    @Test
    public void findLongestFirstPart() {
        final String actual = DistinctCharacters.findLongestDistinctSubstring("abcdemoderneancien");

        assertEquals("abcdemo", actual);
    }

    @Test
    public void findLongestCompletelyUnique() {
        final String actual = DistinctCharacters.findLongestDistinctSubstring("abcdemouyzp");

        assertEquals("abcdemouyzp", actual);
    }

    @Test
    public void findLongestEmpty() {
        final String actual = DistinctCharacters.findLongestDistinctSubstring("");

        assertEquals("", actual);
    }

}
