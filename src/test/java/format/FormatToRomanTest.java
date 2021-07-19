package format;

import format.FormatToRoman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatToRomanTest {

    @Test
    public void format0() {
        assertEquals("0", FormatToRoman.formatToRoman(0));
    }

    @Test
    public void format4() {
        assertEquals("IV", FormatToRoman.formatToRoman(4));
    }

    @Test
    public void format37() {
        assertEquals("XXXVII", FormatToRoman.formatToRoman(37));
    }

    @Test
    public void format143() {
        assertEquals("CXLIII", FormatToRoman.formatToRoman(143));
    }

    @Test
    public void format1234() {
        assertEquals("MCCXXXIV", FormatToRoman.formatToRoman(1234));
    }
}
