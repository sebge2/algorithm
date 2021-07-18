import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TailTest {

    @TempDir
    Path tempDir;

    @Test
    public void tail3Lines() throws IOException {
        final Path tempFile = Files.createFile(tempDir.resolve("my-content.txt"));

        Files.writeString(tempFile, "first\nsecond\nfourth\nfifth");

        assertEquals(
                asList("fourth", "fifth"),
                Tail.tail(tempFile.toFile(), 2)
        );
    }
}
