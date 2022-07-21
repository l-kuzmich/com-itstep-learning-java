package Module3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an animal: ");
        System.out.println("1 - cat");
        System.out.println("2 - dog");
        System.out.println("3 - chicken");
        System.out.println("4 - frog");
        System.out.println("5 - pig");
        System.out.println("6 - moose");
        System.out.println("7 - fish");
        System.out.println("8 - lion");
        System.out.println("9 - owl");
        System.out.println("10 - sheep");
        System.out.print("Enter number to see they sound:");
        int animal = sc.nextInt();

        switch (animal){
            case 1 : {
                System.out.println("мяуу");
                break;
            }
            case 2 : {
                System.out.println("гав гав");
                break;
            }
            case 3 : {
                System.out.println("ко ко ко");
                break;
            }
            case 4 : {
                System.out.println("ква квааа");
                break;
            }
            case 5 : {
                System.out.println("хрю хрю");
                break;
            }
            case 6 : {
                System.out.println("пи пи пи");
                break;
            }
            case 7 : {
                System.out.println("бульк бульк");
                break;
            }
            case 8 : {
                System.out.println("ROAR");
                break;
            }
            case 9 : {
                System.out.println("уху уху");
                break;
            }
            case 10 : {
                System.out.println("беее бее");
                break;
            }
            default:
                System.out.println("I need the number from 1 to 10");
        }
    }
}
