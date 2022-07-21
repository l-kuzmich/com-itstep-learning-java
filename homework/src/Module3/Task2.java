package Module3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a time (from 0 to 24): ");
        int time = sc.nextInt();

        if (time >= 5 && time <= 12){
            System.out.println("Good morning!");
        } else if (time >= 13 && time <= 18){
            System.out.println("Good day!");
        } else if (time >= 19 && time <= 23){
            System.out.println("Good evening!");
        } else if (time >= 0 && time <= 4){
            System.out.println("Good night!");
        }
    }
}
