package Module4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the height");
        int h = sc.nextInt();

        for(int i = 1; i <= h; i++)
        {
            for (int sp = 1; sp <= h - i; sp++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= h * 3; c++){
                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println();

        for(int i = 1; i <= h; i++)
        {
            for (int sp = 1; sp <= h - i; sp++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= h * 3; c++){
                if (c == 1 || i == 1 || i == h || c == h * 3){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
