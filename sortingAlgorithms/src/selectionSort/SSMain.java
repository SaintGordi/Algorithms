package selectionSort;

public class SSMain {

    public static int[] selectionSort(int[] intArray){

        for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex-- ){
            int largest = 0;

            for(int j = 1; j <= lastUnsortedIndex; j++){
                if(intArray[j] > intArray[largest]){
                    largest = j;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
        }

        return intArray;
    }

    private static void swap(int[] intArray, int largest, int lastUnsortedIndex){
        if(largest == lastUnsortedIndex)
            return;

        int temp = intArray[largest];
        intArray[largest] = intArray[lastUnsortedIndex];
        intArray[lastUnsortedIndex] = temp;
    }

}
