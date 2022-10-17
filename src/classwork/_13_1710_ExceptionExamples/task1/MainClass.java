package classwork._13_1710_ExceptionExamples.task1;

import java.util.Scanner;

public class MainClass {
    Scanner scanner = new Scanner(System.in);
    Integer number = 0;

    public static void main(String[] args) {

        MainClass obj = new MainClass();
        obj.getCorrectNumberFromConsole();
        int number = 0;

        System.out.println("Number " + number + " in range from 0 to 9");


    }

    public void getCorrectNumberFromConsole (){
        String s = null;
        try {
            System.out.println("Please input a number");
            s = scanner.nextLine();

        }catch (NumberFormatException e){

        }
    }

    public int StringToInt (String s) throws NumberFormatException{
       return Integer.parseInt(s);
    }

    public void verifyInputedNumber () throws IllegalArgumentException{
        if (number < 0 || number > 9){
            throw new IllegalArgumentException("Not in range from 0 to 9");
        }
    }

}
