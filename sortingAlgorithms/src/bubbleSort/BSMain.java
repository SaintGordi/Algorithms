package bubbleSort;
/**
 * BIG-O: O(n^2)
 * Pros:
 * Cons:
 * Stable:
 * Logic: get the first element and compares it with the next one if the next number is smaller, it swaps them and then checks again the next one
 *
 *
 */
public class BSMain{

    public static int[] bubbleSort(int[] intArray){

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
                lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        return intArray;
    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}