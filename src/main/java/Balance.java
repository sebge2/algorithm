import java.util.stream.IntStream;

public class Balance {

    public static int[][] balance(int[] number){
        final int totalSum = IntStream.of(number).reduce(0, Integer::sum);

        int leftSum = 0;
        int indexSecondList = 0;

        while((indexSecondList < number.length) && (leftSum < (totalSum - leftSum))){
            leftSum += number[indexSecondList];
            indexSecondList++;
        }

        final int[][] result= new int[2][];
        result[0] = new int[indexSecondList];
        for (int i = 0; i < indexSecondList; i++) {
            result[0][i] = number[i];
        }

        result[1] = new int[number.length - indexSecondList];
        for (int i = indexSecondList; i < number.length; i++) {
            result[1][i - indexSecondList] = number[i];
        }

        return result;
    }
}
