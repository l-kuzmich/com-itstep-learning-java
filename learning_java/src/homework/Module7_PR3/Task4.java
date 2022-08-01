package homework.Module7_PR3;

/*Write a program to detect and print prime numbers (integers evenly divisible only by themselves and 1),
 * using two nested for loops and modulus operator (%)*/

import java.util.Scanner;

public class Task4 {

    private int[] arrayDeclaration(int n) {
        int[] a = new int[n + 1];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        return a;
    }

    public void displayArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private int[] primeNumbers(int[] a) {

        int count = 0;
        a[1] = 0;
        for (int i = 2; i * i <= a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] % i == 0 && a[j] != i) {
                    a[j] = 0;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) count++;
        }

        int[] b = new int[count];

        for (int i = 0, j = 0; i < a.length; i++) {

            if (a[i] != 0) {
                b[j] = a[i];
                j++;
            }
        }

        return b;
    }

    public static void main(String[] args) {
        Task4 obj = new Task4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array length: ");
        int n = sc.nextInt();

        int[] arrayOfNumbers = obj.arrayDeclaration(n);
        obj.displayArray(arrayOfNumbers);
        int[] primeNumbers = obj.primeNumbers(arrayOfNumbers);
        System.out.println();
        obj.displayArray(primeNumbers);
    }
}
