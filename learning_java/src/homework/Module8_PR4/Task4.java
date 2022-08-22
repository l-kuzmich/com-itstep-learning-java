package homework.Module8_PR4;

/*Create a two-dimensional array and fill it to produce a butterfly:

1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1

*/

import java.util.Scanner;

public class Task4 {

    private int[][] generateArray(int n) {
        int[][] butterflyArray = new int[n][n];

        int i, j;
        for (i = 0; i < butterflyArray.length / 2 + 1; i++) {
            for (j = 0; j < butterflyArray[i].length; j++) {
                if ((j < i) || (j >= (butterflyArray[i].length - i)))
                    butterflyArray[i][j] = 0;
                else
                    butterflyArray[i][j] = 1;

            }

        }
        for (i = butterflyArray.length - 1; i >= butterflyArray.length / 2 + 1; i--) {
            for (j = 0; j < butterflyArray[i].length; j++) {
                if ((j < (butterflyArray[i].length - 1 - i)) || (j > i))
                    butterflyArray[i][j] = 0;
                else
                    butterflyArray[i][j] = 1;
            }
        }
        return butterflyArray;
    }

    private void displayArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
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
