package homework.Module3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int floor = 6;

        System.out.println("Input number of the apartment: ");
        int ap = sc.nextInt();
        System.out.println("How many apartments per floor? ");
        int ap_per_floor = sc.nextInt();

        if (ap > 0 && ap_per_floor >= 1){
            int entrance = (ap - 1) / (floor * ap_per_floor) + 1;
            System.out.println("The entrance is " + entrance);
        }
        else {
            System.out.println("Error data");
        }
    }
}
