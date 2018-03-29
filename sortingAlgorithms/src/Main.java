
import bubbleSort.BSMain;
import quickSort.QSMain;

public class Main{

    public static void main(String[] args){
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        QSMain.quickSort(intArray);
        print2DIntArray(intArray);

        BSMain.bubbleSort(intArray);
        print2DIntArray(intArray);
    }

    public static void print2DIntArray(int[] intArray){
        for (int anIntArray : intArray) {
            System.out.println(anIntArray);
        }
    }
}