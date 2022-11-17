package homework.Module8_PR4;

import java.util.Random;
import java.util.Scanner;

/*Create an array of random numbers. Print it and reverse the order of elements.
Print it once again. Try to use a single array to solve the task.*/

public class Task3 {

    private int[] generateRandomArray (int arrayLength){
        int[] array = new int[arrayLength];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private void displayArray (int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private int[] reverseArray (int[] array){
        int[] reverseArray = new int[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[j] = array[i];
            j++;
        }

        /*int indexInt;
        for (int i = 0; i<= array.length; i++) {
            indexInt = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 -i] = indexInt;
        }*/

        return reverseArray;
    }

    public static void main(String[] args) {
        Task3 obj = new Task3();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input array's length");
        int arrayLength = sc.nextInt();

        int[] arrayOfNumbers;
        arrayOfNumbers = obj.generateRandomArray(arrayLength);

        obj.displayArray(arrayOfNumbers);

        arrayOfNumbers = obj.reverseArray(arrayOfNumbers);

        obj.displayArray(arrayOfNumbers);
    }
}
