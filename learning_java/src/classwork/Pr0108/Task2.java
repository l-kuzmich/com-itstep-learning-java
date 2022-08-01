package classwork.Pr0108;

/*Написать программу, которая создаст строку, в которой находятся все целые числа, начиная с 1, выписаны в одну строку.
* Строка должна быть длинной не более 1 000 символов
* По числу n (введенного с клавиатуры), выведите цифру на n-й позиции (используется нумерация с 1)*/

import java.util.Scanner;

public class Task2 {

    private String stringOfNumbers (){
        String s = "";
        for (int i = 1; i < 1000; i++) {
            if (s.length() >= 1000){
                break;
            }
            else {
                s = s + i;
            }
        }
        return s;
    }

    public void numberInString (String s, int n){
        char c = s.charAt(n);
        int a = Character.getNumericValue(c);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Task2 obj = new Task2();
        String string = obj.stringOfNumbers();
        System.out.println(string);

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int number = sc.nextInt();
        obj.numberInString(string, number);
    }
}
