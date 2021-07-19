package sort;

import org.junit.jupiter.api.Test;
import sort.BubbleSort;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void sort(){
        final int[] actual = BubbleSort.bubbleSort(new int[]{7, 1, 8, 9, 3});

        assertArrayEquals(new int[]{1,3,7,8,9}, actual);
    }

}
