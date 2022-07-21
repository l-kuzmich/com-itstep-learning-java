package Module4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number");
        int number = sc.nextInt();

        int countOfNumbers = 0;

        for (int i = number ; i != 0 ; i /= 10)
            ++countOfNumbers;
        System.out.println(countOfNumbers);

        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.print("Sum of numbers: " + sum);
    }
}
