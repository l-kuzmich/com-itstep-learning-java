package Module3;

import java.util.Scanner;

public class Task6 {
    static boolean isLeapYear(int y){
        if (y % 4 == 0){
            if (y % 100 == 0){
                return y % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        boolean v = isLeapYear(year);
        if (year > 0 && year < 2050) {
            {
                if (v){
                    System.out.println(year + " year has 366 days");
                } else {
                    System.out.println(year + " year has 365 days");
                }
            }
        } else {
            System.out.println("Error year input");
        }
    }
}
