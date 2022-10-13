package homework.Module2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer number: ");
        int number = sc.nextInt();

        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Sum = " + sum);
    }
}
