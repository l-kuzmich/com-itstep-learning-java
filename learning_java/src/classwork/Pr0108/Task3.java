package classwork.Pr0108;

/*Подсчитать среднюю длину слова, во введенном с клавиатуры предложении*/

import java.util.Scanner;

public class Task3 {

    public void averageWordLength(String s) {
        String[] arrayOfString = s.split(" ");
        double sumOfWordLength = 0;
        for (int i = 0; i < arrayOfString.length; i++) {
            sumOfWordLength += arrayOfString[i].length();
        }
        System.out.println("Average word length is " + sumOfWordLength/arrayOfString.length);
    }

    public static void main(String[] args) {
        Task3 obj = new Task3();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the string: ");
        String string = sc.nextLine();
        obj.averageWordLength(string);
    }
}
