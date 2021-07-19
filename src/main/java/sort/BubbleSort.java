package sort;

// O(n²)
public class BubbleSort {

    public static int[] sort(int[] values){
        for (int i = 0; i < values.length; i++) {
            for(int j = i -1; j >= 0; j--){
                if(values[j + 1] < values[j]){
                    final int temp = values[j + 1];

                    values[j + 1] = values[j];
                    values[j] = temp;
                } else {
                    break;
                }
            }
        }

        return values;
    }
}
