import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TailTest {

    @TempDir
    Path tempDir;

    @Test
    public void tail2LinesEven() throws IOException {
        final Path tempFile = Files.createFile(tempDir.resolve("my-content.txt"));
        Files.writeString(tempFile, "first\nsecond\nfourth\nfifth");

        final String[] actual = Tail.tail2(tempFile.toFile(), 2);

        assertArrayEquals(
                new String[]{"fourth", "fifth"},
                actual
        );
    }

    @Test
    public void tail2LinesOdd() throws IOException {
        final Path tempFile = Files.createFile(tempDir.resolve("my-content.txt"));
        Files.writeString(tempFile, "first\nsecond\nfourth\nfifth\nsixth");

        final String[] actual = Tail.tail2(tempFile.toFile(), 2);

        assertArrayEquals(
                new String[]{"fifth", "sixth"},
                actual
        );
    }

    @Test
    public void tail2LinesLessAvailable() throws IOException {
        final Path tempFile = Files.createFile(tempDir.resolve("my-content.txt"));
        Files.writeString(tempFile, "first");

        final String[] actual = Tail.tail2(tempFile.toFile(), 2);

        assertArrayEquals(
                new String[]{"first"},
                actual
        );
    }
}
