package homework.Module2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите годовой процент: ");
        int R = sc.nextInt(); //процент
        System.out.print("Введите исходную сумму вклада: ");
        int A = sc.nextInt(); //исходная величина вклада
        final int T = 2; //количество периодов
        double S = A*Math.pow((1+R),T);
        System.out.println("Сумма вклада в банке через два года: " + S);
    }
}
