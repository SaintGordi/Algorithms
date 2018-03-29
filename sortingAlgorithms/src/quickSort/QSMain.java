package quickSort;

public class QSMain{
    /**
     * @param intArray The array to be sorted
     */
    public static int[] quickSort(int[] intArray){
        quickSort(intArray, 0, intArray.length);
        return intArray;
    }
    /**
     * @param input The array to be sorted
     * @param start The start index of the array
     * @param end The end index of the array
     */
    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        // for (int i = 0; i < input.length; i++) {
        //     System.out.println(input[i]);
        // }
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;
        

    }
}