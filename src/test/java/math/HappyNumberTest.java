package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HappyNumberTest {

    @Test
    public void isPrime19() {
        final boolean actual = HappyNumber.isHappyNumber(19);

        assertTrue(actual);
    }

    @Test
    public void isPrime4() {
        final boolean actual = HappyNumber.isHappyNumber(4);

        assertFalse(actual);
    }
}