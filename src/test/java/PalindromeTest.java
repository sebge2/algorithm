import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    public void test(){
        final String[] values = {"saw","madam","level","taco","tomot"};

        final String[] actual = Palindrome.filterPalindromes(values);

        assertArrayEquals(
                new String[]{"madam", "level", "tomot"},
                actual
        );
    }

}
