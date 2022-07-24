package Module6_PR2;

/*Write a program that includes and calls the storage() method*/

import java.util.Scanner;

public class Task1 {
    public int storage (String s){
        return s.length() * 2;
    }

    public static void main(String[] args) {
        Task1 obj = new Task1();

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        System.out.println("Your string: " + string);

        int lengthOfString = obj.storage(string);

        System.out.println("String storage is " + lengthOfString);
    }
}
