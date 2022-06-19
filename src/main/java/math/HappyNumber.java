package math;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println("is happy 19? " + isHappyNumber(19));
        System.out.println("is happy 4? " + isHappyNumber(4));
    }

    public static boolean isHappyNumber(int number) {
        final Set<Integer> alreadyComputed = new HashSet<>();

        int currentNumber = number;
        while (!alreadyComputed.contains(currentNumber)) {
            alreadyComputed.add(currentNumber);

            currentNumber = sumSquareEveryDigit(currentNumber);

            if (currentNumber == 1) {
                return true;
            }
        }

        return false;
    }

    public static int sumSquareEveryDigit(int number) {
        final String numberAsString = Integer.valueOf(number).toString();
        int sum = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            final Integer numberAtPosition = Integer.valueOf(numberAsString.substring(i, i + 1));

            sum += numberAtPosition * numberAtPosition;
        }

        return sum;
    }
}
