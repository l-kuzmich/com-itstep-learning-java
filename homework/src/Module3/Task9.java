package Module3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input coordinates of the beginning: ");
        System.out.print("x1 = ");
        int x1 = sc.nextInt();
        System.out.print("y1 = ");
        int y1 = sc.nextInt();


        System.out.println("Input coordinates of the ending: ");
        System.out.print("x2 = ");
        int x2 = sc.nextInt();
        System.out.print("y2 = ");
        int y2 = sc.nextInt();

        if (y1 > y2){
            System.out.println("It's descent (спуск)");
        }
        else if (y2 > y1){
            System.out.println("It's ascent (подъем)");
        }
        else if (x1 == x2){
            System.out.println("It's sheer (отвесная)");
        }
        else {
            System.out.println("It's smooth road");
        }
    }
}
