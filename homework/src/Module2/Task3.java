package Module2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input double number: ");
        double number = sc.nextDouble();

        System.out.println("Rounding: " + Math.round(number));

        System.out.print("String format: ");
        System.out.format("%.0f",number);
    }
}
