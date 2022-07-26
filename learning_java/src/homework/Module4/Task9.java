package homework.Module4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество ярусов");
        int numberOfTiers = sc.nextInt();
        System.out.println("Введите высоту");
        int h = sc.nextInt();

        for (int k = 0; k < numberOfTiers; k++) {
            for (int i = 1; i <= h + k; i++) {

                for (int sp = numberOfTiers - k; sp > 0; sp--) {
                    System.out.print(" ");
                }


                for (int sp = 1; sp <= h - i + k; sp++) {
                    System.out.print(" ");
                }
                for (int c = 1; c <= (i * 2) - 1; c++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
