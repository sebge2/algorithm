import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Tail {

    public static List<String> tail(File file, int numberLines) throws IOException {
        final List<String> tail = new ArrayList<>();

        Files.readAllLines(file.toPath()).stream()
//                .filter(line -> !line.isEmpty())
                .forEach(line -> {
                    if (tail.size() == numberLines) {
                        tail.remove(0);
                    }

                    tail.add(line);
                });

        return tail;
    }
}
