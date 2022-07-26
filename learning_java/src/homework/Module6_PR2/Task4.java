package homework.Module6_PR2;

/*Get a sequence of random numbers and calculate their
* arithmetic mean value. Stop the process when the next
* number generated randomly equals to 0*/

import java.util.Random;

public class Task4 {

    public double sequence(){
        Random random = new Random();

        int number = 0;
        int sum = 0;
        int i = 1;
        while ((number = random.nextInt(100)) != 0){
            //System.out.println(number);
            sum += number;
            i++;
        }
        return sum/i;
    }

    public static void main(String[] args) {
        Random random = new Random();

        Task4 obj = new Task4();

        System.out.println("Average value is " + obj.sequence());

        
    }
}
