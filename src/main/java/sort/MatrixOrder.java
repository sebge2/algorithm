package sort;

public class MatrixOrder {

    public static int[] order(int[][] matrix) {
        final int numberRows = matrix.length;

        if (numberRows == 0) {
            return new int[]{};
        }

        final int numberColumns = matrix[0].length;
        if(numberColumns == 0){
            return new int[]{};
        }

        final int[] rowPointers = new int[numberRows];
        final int[] result = new int[numberRows * numberColumns];

        for (int i = 0; i < (numberRows * numberColumns); i++) {
            final int lowestRowIndex = findLowestRowIndex(rowPointers, matrix);

            result[i] = matrix[lowestRowIndex][rowPointers[lowestRowIndex]];
            rowPointers[lowestRowIndex]++;
        }

        return result;
    }

    private static int findLowestRowIndex(int[] rowPointers, int[][] matrix) {
        int lowestRowIndex = -1;

        for (int rowPointerIndex = 0; rowPointerIndex < rowPointers.length; rowPointerIndex++) {
            if(rowPointers[rowPointerIndex] < matrix[0].length){
                if((lowestRowIndex < 0) || matrix[rowPointerIndex][rowPointers[rowPointerIndex]] < matrix[lowestRowIndex][rowPointers[lowestRowIndex]]){
                    lowestRowIndex = rowPointerIndex;
                }
            }
        }

        return lowestRowIndex;
    }
}
