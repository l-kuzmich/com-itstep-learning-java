package classwork._2_0108_Arrays;

/*Ввести строку с клавиатуры. В строке должны содержаться слова, которые могут быть раздельные пробелами и двоеточиями.
Необходимо вычислить количество слов в строке, у которых четное количество букв*/

import java.util.Scanner;

public class Task5 {

    private int numbersOfWords(String s){
        int numbersOfLetter = 0;
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() % 2 == 0){
                numbersOfLetter++;
            }
        }
        return numbersOfLetter;
    }

    public static void main(String[] args) {
        Task5 obj = new Task5();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the string: ");
        String string = sc.nextLine();
        System.out.println("Numbers of words " + obj.numbersOfWords(string));
    }
}
