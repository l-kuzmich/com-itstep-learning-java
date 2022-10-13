package homework.Module3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the roots of the equation");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();

        int D = b * b - 4 * a * c;
        if (D > 0){
            double x1 = (-b + Math.sqrt(D)) / 2 * a;
            double x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("The equation has two roots: x1 = " + x1 + "; x2 = " + x2 + ".");
        }
        else if (D == 0){
            double x = - b / 2 * a;
            System.out.println("The equation has one root: x = " + x  + ".");
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}
