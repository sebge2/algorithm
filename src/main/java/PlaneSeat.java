import java.util.Arrays;

public class PlaneSeat {

    public static int getRow(String sequence) {
        return getElementFromSequence(sequence, 1, 32);
    }

    public static int getSeatInRow(String sequence) {
        return getElementFromSequence(sequence, 1, 4);
    }

    public static int getElementFromSequence(String sequence, int min, int max) {
        int currentMin = min;
        int currentMax = max;

        for (char value : sequence.toCharArray()) {
            final int rangeLength = (currentMax - currentMin + 1) / 2;

            if (value == 'F' || value == 'L') {
                currentMax = currentMin + rangeLength - 1;
            } else {
                currentMin = currentMin + rangeLength;
            }
        }

        return currentMin;
    }

    public static int[] getSeat(String ticket) {
        final String rowSequence = ticket.substring(0, 5);
        final String seatInRowSequence = ticket.substring(5);

        return new int[]{getRow(rowSequence), getSeatInRow(seatInRowSequence)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                getSeat("FBBFFRL")
        ));
    }
}


/*
FBBFFRL

[1-32] => 16 [1-16] [17-32] F
[1-16] => 8 [1-8] [9-16] B
[9-16] => 4 [9-12] [13-16] B
[13-16] => 2 [13-14] [15-16] F
[13-14] => 1 [13] [14] F
[13]

[1-4] => 4 [1,2] [3-4] R
[3-4] => 2 [3] [4] L
[3]

13,3


 */