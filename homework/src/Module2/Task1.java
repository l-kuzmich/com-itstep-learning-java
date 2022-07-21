package Module2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("x/y = " + x/y);
        System.out.println("x%y = " + x%y);
        System.out.println("sqrt(x) = " + Math.sqrt(x));
    }
}
