package homework.Module3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the letter: ");
        String letter = sc.next();
        if (letter.matches("^[a-zA-Z]")){
            System.out.println("It's English");
        }
        else if (letter.matches("^[а-яА-Я]")){
            System.out.println("It's Russian");
        }
        else if (letter.matches("^\\d")){
            System.out.println("It's a number");
        }
        else {
            System.out.println("Nobody knows");
        }
    }
}
