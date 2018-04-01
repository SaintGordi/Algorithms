
import bubbleSort.BSMain;
import insertionSort.ISMain;
import mergeSort.MSMain;
import quickSort.QSMain;
import selectionSort.SSMain;

import java.util.Random;

public class Main{
    public static final String algorithm = "MS";

    public static void main(String[] args){
        int amount = 1000;
//        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        int[] intArray = new int[amount];


        long startTime, duration = 0;
        initArray(1 , 5000, amount, intArray);
        print2DIntArray(intArray , duration);
        switch (algorithm){
            case("QS"):
                startTime = System.currentTimeMillis();
                QSMain.quickSort(intArray);
                duration = System.currentTimeMillis() - startTime;
                print2DIntArray(intArray , duration);
                break;
            case("IS"):
                startTime = System.currentTimeMillis();
                ISMain.insertionSort(intArray);
                duration = System.currentTimeMillis() - startTime;
                print2DIntArray(intArray , duration);
                break;
            case("BS"):
                startTime = System.currentTimeMillis();
                BSMain.bubbleSort(intArray);
                duration = System.currentTimeMillis() - startTime;
                print2DIntArray(intArray , duration);
                break;
            case("SS"):
                startTime = System.currentTimeMillis();
                SSMain.selectionSort(intArray);
                duration = System.currentTimeMillis() - startTime;
                print2DIntArray(intArray , duration);
                break;
            case("MS"):
                startTime = System.currentTimeMillis();
                MSMain.mergeSort(intArray, 0, intArray.length - 1);
                duration = System.currentTimeMillis() - startTime;
                print2DIntArray(intArray , duration);
                break;

        }
    }

    public static void print2DIntArray(int[] intArray, long duration){
        for (int anIntArray : intArray) {
            System.out.print(anIntArray + " ");
        }

        System.out.println("\nDuration: " + duration);
    }

    public static void initArray(int min, int max, int amount, int[] intArray){
        Random random = new Random();

        for (int i = 0; i < amount; i++) {

            int num = min + random.nextInt(max);
            intArray[i] = num;
        }

    }
}