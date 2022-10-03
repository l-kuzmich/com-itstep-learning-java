package classwork._1_2107_Strings;

/*Написать программу, которая определит, сколько слов Вы ввели в консоли*/

import java.util.Scanner;

public class Task1 {

    public int howManyWords (String string){
        int numbersOfWords = 0;

        string = string.trim();
        if (string.length() != 0){
            numbersOfWords++;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ' && string.charAt(i + 1) != ' '){
                    numbersOfWords++;
                }
            }
        } else return 0;
        return numbersOfWords;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the string: ");

        String words = sc.nextLine();

        Task1 obj = new Task1();

        System.out.println(obj.howManyWords(words));

    }
}
