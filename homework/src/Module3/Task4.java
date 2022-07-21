package Module3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите координаты точки: ");
        System.out.print("x = ");
        double x = sc.nextDouble();
        System.out.print("y = ");
        double y = sc.nextDouble();

        System.out.print("Точка принадлежит ");
        if (x > 0 && y > 0){
            System.out.println("I четверти");
        } else if (x < 0 && y > 0){
            System.out.println("II четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("III четверти");
        } else {
            System.out.println("IV четверти");
        }
    }
}
