package classwork._2_0108_Arrays;

/*Ввести с клавиатуры строку текста, а затем один символ. Показать на консоль индексы и количество совпадений (ищем
* вхождения символа в строку). В случае если совпадений не найдено, вывести соответствующий текст*/

import java.util.Scanner;

public class Task1 {

    public void howManyContains (String s, String c){
        int numbersOfContains = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c.charAt(0)){
                numbersOfContains++;
                System.out.print(i + " ");
            }
            else if (!s.contains(c)){
                System.out.println("No contains");
            }
        }
        System.out.println("\nNumber of contains: " + numbersOfContains);

    }

    public static void main(String[] args) {
        Task1 obj = new Task1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: ");
        String string = sc.nextLine();
        System.out.println("Input symbol: ");
        String symbol = sc.nextLine();

        obj.howManyContains(string, symbol);
    }

}
