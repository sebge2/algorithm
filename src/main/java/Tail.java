import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// O(lines + nbLines)
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

    public static String[] tail2(File file, int numberLines) throws IOException {
        final String[] tail = new String[numberLines];
        final AtomicInteger counter = new AtomicInteger(0); // next element position
        AtomicBoolean overflow = new AtomicBoolean(false);

        Files.readAllLines(file.toPath()).stream()
//                .filter(line -> !line.isEmpty())
                .forEach(line -> {
                    final int currentIndex = counter.getAndIncrement();

                    tail[currentIndex] = line;
                    counter.set(((currentIndex + 1) % numberLines));

                    if (counter.get() < currentIndex) {
                        overflow.set(true);
                    }
                });

        String[] tailReordered;
        if (overflow.get()) {
            tailReordered = new String[numberLines];
//            int tailReorderedIndex = 0;

            for (int i = counter.get(); i < numberLines; i++) {
                tailReordered[i - counter.get()] = tail[i];
//                tailReordered[tailReorderedIndex++] = tail[i];
            }

            for (int i = 0; i < counter.get(); i++) {
//                tailReordered[i - (counter.get() + 1)] = tail[i];
                tailReordered[numberLines - counter.get() + i] = tail[i];
            }
        } else {
            tailReordered = Arrays.copyOfRange(tail, 0, counter.get());
        }

        return tailReordered;
    }
}
