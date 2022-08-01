package homework.Module8_PR4;

/*Sort an array of random generated numbers.*/

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    private int[] randomArray (int n){
        Random random = new Random();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public void displayArray (int[] a){
        for (int k : a){
            System.out.print(k + " ");
        }
    }

    private int[] sort (int[] a){
        int j = 0;
        boolean swapNeeded;
        while (j < a.length - 1) {
            swapNeeded = false;
            for (int i = 0; i < a.length - j - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int buff = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = buff;
                    swapNeeded = true;
                }
            }
            if (!swapNeeded){
                break;
            }
            j++;
        }
        return a;
    }

    public static void main(String[] args) {
        Task1 obj = new Task1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array length");
        int n = sc.nextInt();
        int[] arrayOfNumbers = obj.randomArray(n);
        obj.displayArray(arrayOfNumbers);
        System.out.println();
        int[] sortedArray = obj.sort(arrayOfNumbers);
        obj.displayArray(sortedArray);
    }
}
