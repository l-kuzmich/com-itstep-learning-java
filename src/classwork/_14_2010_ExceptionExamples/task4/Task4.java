package classwork._14_2010_ExceptionExamples.task4;

/*Пользователь вводит в строку с клавиатуры математическое выражение. Например, 3+8+10+11. Программа
должна посчитать результат введенного выражения.
В строке могут быть только целые числа и оператор +
(в унарном и бинарном виде). Для обработки ошибок
ввода используйте механизм исключений. */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Task4 task4 = new Task4();
        try {
            task4.validationOfSplitArray();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String[] splitByPlus() {
        return getString().split("\\+");
    }

    public void validationOfSplitArray() throws IllegalArgumentException {
        String[] strings = splitByPlus();

        for (String string : strings) {
            try {
                Integer.parseInt(string);
                System.out.println(getArraysSum(strings));
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong number " + string);
                getString();
                splitByPlus();
                validationOfSplitArray();
            }
        }
    }

    public int getArraysSum(String[] strings) {
        int sum = 0;
        for (String s : strings) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
