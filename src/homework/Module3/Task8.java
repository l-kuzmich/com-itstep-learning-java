package homework.Module3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();

        if (x % 2 == 0 && y % 2 == 0 || x % 2 != 0 && y % 2 != 0){
            System.out.println("YES");
        }
    }
}
