import java.util.Arrays;

public class PlaneSeat {

    public static int getRow(String sequence) {
        return getElementFromSequence(sequence, 0, 31);
    }

    public static int getSeatInRow(String sequence) {
        return getElementFromSequence(sequence, 0, 3);
    }

    public static int getElementFromSequence(String sequence, int min, int max) {
        int currentMin = min;
        int currentMax = max;

        for (char value : sequence.toCharArray()) {
            if (value == 'F' || value == 'L') {
                currentMax = currentMin + ((currentMax - currentMin) / 2);
            } else {
                currentMin = currentMin + ((currentMax - currentMin) / 2) + 1;
            }
        }

        return currentMin;
    }

    public static int[] getSeat(String ticket) {
        final int endRowSequence = Integer.max(ticket.lastIndexOf('F'), ticket.lastIndexOf('B'));
        final String rowSequence = ticket.substring(0, endRowSequence + 1);
        final String seatInRowSequence = ticket.substring(endRowSequence + 1);

        return new int[]{getRow(rowSequence), getSeatInRow(seatInRowSequence)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                getSeat("FBBFFRL")
        ));
    }
}
