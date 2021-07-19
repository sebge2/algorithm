package search;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SharingTest {

    @Test
    public void sharingContiguous() {
        final List<Character> actual = Sharing.sharing(asList('a', 'e', 'e', 'e'), asList('b', 'b', 'c', 'e', 'e', 'g'));

        assertEquals(asList('e', 'e'), actual);
    }

    @Test
    public void sharingNotContiguous() {
        final List<Character> actual = Sharing.sharing(asList('a', 'e', 'e', 'e', 'h'), asList('b', 'b', 'c', 'e', 'e', 'g', 'h'));

        assertEquals(asList('e', 'e', 'h'), actual);
    }

    @Test
    public void sharingEquals() {
        final List<Character> actual = Sharing.sharing(asList('a', 'e', 'e', 'e', 'h'), asList('a', 'e', 'e', 'e', 'h'));

        assertEquals(asList('a', 'e', 'e', 'e', 'h'), actual);
    }

    @Test
    public void sharingEmpty() {
        final List<Character> actual = Sharing.sharing(asList(), asList());

        assertEquals(asList(), actual);
    }
}
