package Module2;

import java.util.Random;
import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input numbers of students: ");
        int n = sc.nextInt();
        int sum_of_cake = 0;
        int sum_of_milk = 0;

        Random rand = new Random(); //вес ученика

        for (int i = 0; i < n; i++){
            int cake = 0;
            int milk = 0;
            int weight = rand.nextInt(50-20+1) + 20;
            System.out.println(i+1 + " student: " + weight + " kg");
            cake += 1;
            if (weight < 30){
                cake += 1;
                milk += 1;
            }
            System.out.println("Milk = " + milk);
            System.out.println("Cake = " + cake);

            sum_of_cake += cake;
            sum_of_milk +=milk;
        }
        System.out.println("Sum of milk: " + sum_of_milk*200 + " ml = " + Math.ceil(sum_of_milk * 200 / 900));
        System.out.println("Sum of cake: " + sum_of_cake);

    }
}
