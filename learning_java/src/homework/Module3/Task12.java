package homework.Module3;

import java.util.Scanner;

public class Task12 {
    static int digitsSum (int n){
        int sum = 0;
        for ( ; n != 0; n /= 10){
            sum += n % 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of ticket: ");
        if (!sc.hasNextInt()){
            System.out.println("It's not a number");
        }

        int ticket = sc.nextInt();
        if (ticket < 1 || ticket > 999999){
            System.out.println("Wrong input");
        }

        System.out.printf("Is %slucky.\n", (digitsSum (ticket / 1000) == digitsSum(ticket % 1000) ) ? "" : "not ");
    }
}
