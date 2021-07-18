import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PushAwayTest {

    @Test
    public void pushAway() {
        final char[] actual = PushAway.pushAway(new char[]{'a', 'b', '.', 'c', '.', '.', 'k'}, '.');

        assertArrayEquals(new char[]{'a', 'b', 'c', 'k', '.', '.', '.'}, actual);
    }

}
