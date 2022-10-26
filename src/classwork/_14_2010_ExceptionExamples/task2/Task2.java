package classwork._14_2010_ExceptionExamples.task2;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();

        try
        {
            task2.stringToInt();
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public String getString() throws IllegalArgumentException, NoSuchElementException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string");
        return scanner.nextLine();
    }

    public void stringToInt() throws IllegalArgumentException {
        String str = getString();
        if (!str.contains("0") || !str.contains("1")){
            throw new IllegalArgumentException("String can be binary int");
        } else {
            System.out.println(Integer.parseInt(str,2));
        }
    }
}
