package sort;

// O(n log n)
public class QuickSort {

    public static int[] sort(int[] values) {
        return sort(values, 0, values.length - 1);
    }

    private static int[] sort(int[] values, int begin, int end) {
        if (begin < end) {
            final int partitionIndex = partition(values, begin, end);

            sort(values, begin, partitionIndex - 1);
            sort(values, partitionIndex + 1, end);
        }

        return values;
    }

    private static int partition(int[] values, int begin, int end) {
        final int pivot = values[end];
        int indexSmaller = (begin - 1);

        for (int j = begin; j < end; j++) {
            if(values[j] <= pivot){
                swap(values, ++indexSmaller, j);
            }
        }

        swap(values, indexSmaller + 1, end);

        return indexSmaller + 1;
    }

    private static void swap(int[] values, int i, int j) {
        int swap = values[j];

        values[j]= values[i];
        values[i] = swap;
    }
}

