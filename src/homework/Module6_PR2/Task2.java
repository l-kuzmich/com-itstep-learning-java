package homework.Module6_PR2;

/*Write a program that simulates coin-flipping*/

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public void flip(){
        Random random = new Random();
        int flip = random.nextInt(2) + 1;
        if (flip == 1){
            System.out.println("Head");
        } else System.out.println("Tail");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task2 obj = new Task2();

        System.out.println("Welcome to the Coin Toss Program");

        while (true){
            System.out.println("\nSelect an action\n1. Toss the coin\n2. Quit");
            int choice = sc.nextInt();
            if (choice == 1){
                obj.flip();
            } else if (choice == 2){
                System.exit(0);
            } else {
                System.out.println("Please input 1 or 2");
            }
        }
    }
}
