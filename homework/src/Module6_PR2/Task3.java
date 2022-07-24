package Module6_PR2;

/*Write a program that calculates velocity using
* a constant distance and a constant time*/

public class Task3 {

    final int distance = 30;
    final int time = 2;

    public int velocity (int distance, int time){
        int velocity = distance * time;
        return velocity;
    }

    public static void main(String[] args) {
        Task3 obj = new Task3();

        int velocity = obj.velocity(obj.distance, obj.time);

        System.out.println("The velocity equals " + velocity + "km/h");
    }
}
