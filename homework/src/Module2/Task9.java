package Module2;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        double a = sc.nextDouble();
        if (a % 1 == 0){
            System.out.println("The number is integer");
        }
        else System.out.println("The number is double");
    }
}
