package classwork._14_2010_ExceptionExamples.task3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();

        try {
            System.out.println(Arrays.binarySearch(task3.getArray(),4,44, 1));
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bounds");
        }

        int [] b = null;
        try {
            System.out.println(Arrays.compare(task3.getArray(), 1, 2, b, 1, 3));
        } catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        } catch (IllegalArgumentException ex){
            System.out.println("Illegal Argument Exception");
        }

    }

    public int[] getArray () throws IllegalArgumentException, NoSuchElementException {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }




}
