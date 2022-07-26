package homework.Module4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number");
        int number = sc.nextInt();

        while (number > 0){
            int digit = number % 10;
            number /= 10;
            System.out.print(digit);
        }
    }
}
