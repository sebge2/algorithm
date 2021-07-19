package sort;

import org.junit.jupiter.api.Test;
import sort.MatrixOrder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MatrixOrderTest {

    @Test
    public void order() {
        final int[][] matrix = new int[][]{
                new int[]{0, 4, 6, 7},
                new int[]{2, 8, 12, 15},
                new int[]{2, 10, 14, 16}
        };

        final int[] actual = MatrixOrder.order(matrix);

        assertArrayEquals(
                new int[]{0, 2, 2, 4, 6, 7, 8, 10, 12, 14, 15, 16},
                actual
        );
    }

}
