package Module4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the height");
        int h = sc.nextInt();

        int y = 3;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < i * (y - 1); j++) {
                System.out.print(" ");
            }
            if (i % 2 == 1) {
                System.out.print(" ");
                System.out.print("*");
                System.out.print(" ");
            } else {
                for (int k = 0; k < y; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
