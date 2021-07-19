package search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    @Test
    public void search() {
        final int actual = BinarySearch.searchIndex(new int[]{0, 5, 8, 50, 100, 200}, 100);

        assertEquals(4, actual);
    }

}
