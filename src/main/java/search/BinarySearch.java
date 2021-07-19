package search;

// O(log n)
public class BinarySearch {

    public static int searchIndex(int[] values, int valueToSearch) {
        return searchIndex(values, valueToSearch, 0, values.length);
    }

    private static int searchIndex(int[] values, int valueToSearch, int begin, int end) {
        if(values.length == 0){
            return -1;
        } else {
            int middle = begin + ((end - begin) / 2);

            if(values[middle] == valueToSearch){
                return middle;
            } else if (values[middle] > valueToSearch){
                return searchIndex(values, valueToSearch, begin, middle - 1);
            } else {
                return searchIndex(values, valueToSearch, middle + 1, end);
            }
        }
    }
}
