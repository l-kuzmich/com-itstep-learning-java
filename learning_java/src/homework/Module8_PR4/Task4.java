package homework.Module8_PR4;

/*Create a two-dimensional array and fill it to produce a butterfly:

1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1

*/

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    private int[][] generateArray(int n) {
        int[][] butterflyArray = new int[n][n];

        for (int i = 0; i < butterflyArray.length; i++) {
            Arrays.fill(butterflyArray[i], 1);
        }

        for (int i = 0; i <= butterflyArray.length / 2; i++) {
            for (int j = 0; j < i; j++) {
                butterflyArray[i][j] = 0;
            }
        }

        for (int i = butterflyArray.length / 2; i > 0; i--) {
            for (int j = butterflyArray[i].length - 1; j > i; j--) {
                butterflyArray[i][j] = 0;
            }
        }


        return butterflyArray;
    }

    private void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Task4 obj = new Task4();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input butterfly length");
        int n = sc.nextInt();

        int[][] butterflyArray = new int[n][n];
        butterflyArray = obj.generateArray(n);

        obj.displayArray(butterflyArray);
    }
}
