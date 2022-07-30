package homework.Module4;

import java.util.ArrayList;
import java.util.Scanner;

public class Task010 {

    private char [][] printZero(){
        return new char[][]{
                {' ',' ','*','*','*',' ',' '},
                {' ','*',' ',' ',' ','*',' '},
                {'*',' ',' ',' ',' ',' ','*'},
                {'*',' ',' ',' ',' ',' ','*'},
                {'*',' ',' ',' ',' ',' ','*'},
                {' ','*',' ',' ',' ','*',' '},
                {' ',' ','*','*','*',' ',' '}
        };
    }

    private char [][] printOne(){
        return new char[][]{
                {' ', ' ', '*', ' ', ' '},
                {' ', '*', '*', ' ', ' '},
                {' ', ' ', '*', ' ', ' '},
                {' ', ' ', '*', ' ', ' '},
                {' ', ' ', '*', ' ', ' '},
                {' ', ' ', '*', ' ', ' '},
                {' ', '*', '*', '*', ' '}
        };
    }

    private char [][] printTwo(){
        return new char[][]{
                {' ', '*', '*', '*', ' '},
                {'*', ' ', ' ', ' ', '*'},
                {'*', ' ', ' ', '*', ' '},
                {' ', ' ', '*', ' ', ' '},
                {' ', '*', ' ', ' ', ' '},
                {'*', ' ', ' ', ' ', ' '},
                {'*', '*', '*', '*', '*'}
        };
    }

    private char [][] printThree(){
        return new char[][]{
                {' ', '*', '*', '*', ' '},
                {'*', ' ', ' ', ' ', '*'},
                {' ', ' ', ' ', '*', ' '},
                {' ', ' ', '*', '*', ' '},
                {' ', ' ', ' ', ' ', '*'},
                {'*', ' ', ' ', ' ', '*'},
                {' ', '*', '*', '*', ' '}
        };
    }

    private char [][] printFour(){
        return new char[][]{
                {' ', ' ', ' ', ' ', '*',' '},
                {' ', ' ', ' ', '*', '*',' '},
                {' ', ' ', '*', ' ', '*',' '},
                {' ', '*', ' ', ' ', '*',' '},
                {'*', '*', '*', '*', '*','*'},
                {' ', ' ', ' ', ' ', '*',' '},
                {' ', ' ', ' ', ' ', '*',' '}
        };
    }

    private char [][] printFive(){
        return new char[][]{
                {'*', '*', '*', '*', '*'},
                {'*', ' ', ' ', ' ', ' '},
                {'*', '*', '*', '*', ' '},
                {' ', ' ', ' ', ' ', '*'},
                {' ', ' ', ' ', ' ', '*'},
                {'*', ' ', ' ', ' ', '*'},
                {' ', '*', '*', '*', ' '}
        };
    }

    private char [][] printSix(){
        return new char[][]{
                {' ', ' ', '*', '*', '*'},
                {' ', '*', ' ', ' ', ' '},
                {' ', '*', '*', '*', ' '},
                {'*', ' ', ' ', ' ', '*'},
                {'*', ' ', ' ', ' ', '*'},
                {'*', ' ', ' ', ' ', '*'},
                {' ', '*', '*', '*', ' '}
        };
    }

    private char [][] printSeven(){
        return new char[][]{
                {'*', '*', '*', '*', '*'},
                {' ', ' ', ' ', ' ', '*'},
                {' ', ' ', ' ', '*', ' '},
                {' ', ' ', '*', ' ', ' '},
                {' ', '*', ' ', ' ', ' '},
                {'*', ' ', ' ', ' ', ' '},
                {'*', ' ', ' ', ' ', ' '}
        };
    }

    private char [][] printEight(){
        return new char[][]{
                {' ', '*', '*', '*', ' '},
                {'*', ' ', ' ', ' ', '*'},
                {'*', ' ', ' ', ' ', '*'},
                {' ', '*', '*', '*', ' '},
                {'*', ' ', ' ', ' ', '*'},
                {'*', ' ', ' ', ' ', '*'},
                {' ', '*', '*', '*', ' '}
        };
    }

    private char [][] printNine(){
        return new char[][]{
                {' ', '*', '*', '*', '*'},
                {'*', ' ', ' ', ' ', '*'},
                {'*', ' ', ' ', ' ', '*'},
                {' ', '*', '*', '*', '*'},
                {' ', ' ', ' ', ' ', '*'},
                {' ', ' ', ' ', ' ', '*'},
                {' ', '*', '*', '*', ' '}
        };
    }

    public void printer(int [] a){
        Task010 obj = new Task010();
        ArrayList<char[][]> arrayList = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            switch (a[i]){
                case 0:{
                    arrayList.add(obj.printZero());
                    break;
                }
                case 1:{
                    arrayList.add(obj.printOne());
                    break;
                }
                case 2:{
                    arrayList.add(obj.printTwo());
                    break;
                }
                case 3:{
                    arrayList.add(obj.printThree());
                    break;
                }
                case 4:{
                    arrayList.add(obj.printFour());
                    break;
                }
                case 5:{
                    arrayList.add(obj.printFive());
                    break;
                }
                case 6:{
                    arrayList.add(obj.printSix());
                    break;
                }
                case 7:{
                    arrayList.add(obj.printSeven());
                    break;
                }
                case 8:{
                    arrayList.add(obj.printEight());
                    break;
                }
                case 9:{
                    arrayList.add(obj.printNine());
                    break;
                }
                default:{
                    System.out.println("nan");
                }
            }
        }

        displayArray(arrayList);
    }

    public void displayArray (ArrayList<char[][]> a){
        for (int i = 0; i < a.size(); i++) {
            char [][] c = a.get(i);
            for (int j = 0; j < c.length; j++) {
                for (int k = 0; k < c[i].length; k++) {
                    System.out.print(c[j][k]);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Task010 obj = new Task010();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the numbers");
        int number = sc.nextInt();
        int countOfNumbers = 0;

        for (int i = number ; i != 0 ; i /= 10) {
            ++countOfNumbers;
        }

        int [] arrayOfNumbers = new int[countOfNumbers];

        for (int i = arrayOfNumbers.length - 1; i >= 0; i--) {
            int digit = number % 10;
            number /= 10;
            arrayOfNumbers[i] = digit;
        }

        obj.printer(arrayOfNumbers);

    }
}
