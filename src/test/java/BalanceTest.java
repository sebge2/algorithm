import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BalanceTest {

    @Test
    public void balance() {
        final int[][] actual = Balance.balance(new int[]{2, 4, 1, 8, 7, 6});

        assertArrayEquals(
                new int[]{2, 4, 1, 8},
                actual[0]
        );

        assertArrayEquals(
                new int[]{7, 6},
                actual[1]
        );
    }

    @Test
    public void balanceOnly0() {
        final int[][] actual = Balance.balance(new int[]{0,0,0});

        assertArrayEquals(
                new int[]{},
                actual[0]
        );

        assertArrayEquals(
                new int[]{0,0,0},
                actual[1]
        );
    }

}
