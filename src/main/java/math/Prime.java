package math;

public class Prime {

    public static boolean isPrime(int value) {
        if (value <= 3) {
            return value > 1;
        } else {
            if ((value % 2 == 0) || (value % 3 == 0)) {
                return false;
            }

            for (int i = 5; i < value; i += 2) {
                if (value % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

}
