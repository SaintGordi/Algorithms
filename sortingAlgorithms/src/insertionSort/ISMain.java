package insertionSort;
/**
 * BIG-O:
 * Pros:
 * Cons:
 * Stable:
 * Logic:
 *
 */
public class ISMain {

    public static int[] insertionSort(int[] intArray){

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }

        return intArray;
    }
}
