package classwork._14_2010_ExceptionExamples.task4;

/*Пользователь вводит в строку с клавиатуры математическое выражение. Например, 3+8+10+11. Программа
должна посчитать результат введенного выражения.
В строке могут быть только целые числа и оператор +
(в унарном и бинарном виде). Для обработки ошибок
ввода используйте механизм исключений. */

import java.util.Scanner;

public class Task4 {

    public String inputtedString = "";
    String [] array;

    public static void main(String[] args) {

        Task4 task4 = new Task4();
        task4.array = task4.prepareArrayNumber();

        try {
            task4.validationOfSplitArray();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(task4.getArraysSum());
    }

    public String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String[] splitByPlus(String s) {
        return s.split("\\+");
    }

    public String [] prepareArrayNumber () {
        inputtedString = getString();
        return  array = splitByPlus(inputtedString);
    }

    public void validationOfSplitArray() throws IllegalArgumentException {
        for (String string : array) {
            try {
                Integer.parseInt(string);
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong number " + string);
                prepareArrayNumber();
                validationOfSplitArray();
            }
        }
    }

    public int getArraysSum() {
        int sum = 0;
        for (String s : array) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
