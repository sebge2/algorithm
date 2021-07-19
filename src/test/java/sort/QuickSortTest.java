package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickSortTest {

    @Test
    public void sort() {
        final int[] actual = QuickSort.sort(new int[]{10, 80, 30, 90, 40, 50, 70});

        assertArrayEquals(new int[]{10, 30, 40, 50, 70, 80, 90}, actual);
    }

}
