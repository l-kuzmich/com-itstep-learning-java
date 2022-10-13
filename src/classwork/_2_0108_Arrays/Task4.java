package classwork._2_0108_Arrays;

/*Ввести строку с клавиатуры (латиницей). Из введенной строки выбрать все слова,
начинающиеся на гласные буквы и заканчивающиеся на согласные. Вывести отобранные слова на консоль*/

import java.util.Scanner;

public class Task4 {

    private void words(String s) {
        String[] arrayOfString = s.split(" ");
        for (int i = 0; i < arrayOfString.length; i++) {
            if (arrayOfString[i].matches("^[aeiouyAEIOUY].+") && arrayOfString[i].matches(".+[qwrtpsdfghjklzxcvbnmQWRTPSDFGHJKLZXCVBNM]$")) {
                System.out.println(arrayOfString[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Task4 obj = new Task4();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the string: ");
        String string = sc.nextLine();
        obj.words(string);
    }

}
