package homework.Module2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите секунды: ");
        int s = sc.nextInt();
        long day = s / 86400;
        long hour = s % 86400 / 3600;
        long min = s / 60 % 60;
        long sec = s % 60;
        System.out.println(day + " дней, " + hour + " часов, " + min + " минут, " + sec + " секунд.");
    }
}
