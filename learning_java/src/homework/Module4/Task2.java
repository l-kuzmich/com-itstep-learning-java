package homework.Module4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the height");
        int h = sc.nextInt();

        for (int i = h; i >= 1; i--){
            for (int sp = h - i; sp >= 1; sp--){
                System.out.print(" ");
            }
            for (int c = i - 1; c >= 0; c--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = h - 1; i >= 1; i--){
            if (i == h - 1){
                for (int j = 0; j < h; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }

            for (int sp = h - i; sp >= 1; sp--){
                System.out.print(" ");
            }
            for (int c = i - 2; c >= 0 ; c--){
                if (c == i - 2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = h - i; j >= 0; j--) {
                if (j == h - i) System.out.print("*");
            }

            System.out.println();


        }
    }
}
