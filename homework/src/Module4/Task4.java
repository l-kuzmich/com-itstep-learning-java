package Module4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the height");
        int h = sc.nextInt();

        for (int i = 1; i <= h; i++){
            for (int sp = 1; sp <= h - i; sp++){
                System.out.print(" ");
            }
            for (int c = 1; c <= (i * 2) - 1; c++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = h - 1; i >= 1; i--){
            for (int sp = h - i; sp >= 1; sp--){
                System.out.print(" ");
            }
            for (int c = (i * 2) - 1; c > 0; c--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i < h; i++){
            for (int sp = 1; sp <= h - i; sp++){
                System.out.print(" ");
            }
            for (int c = 1; c < (i * 2) - 1; c++){
                if (c == 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j <= h - i; j++) {
                if (j == 0) System.out.print("*");
            }
            System.out.println();
        }
        for (int i = h  ; i > 0; i--) {
            for (int sp = h - i; sp > 0; sp--) {
                System.out.print(" ");
            }
            for (int c = (i * 2) - 2; c > 0; c--) {
                if (c == (i * 2) - 2) {
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
