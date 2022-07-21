package Module5_PR1;

/*Create a class called Spaceship with two fields and two methods.
Create two spaceships. Then display their fields and call methods.*/

public class Task4 {
    public static void main(String[] args) {
        Spaceship enterprise = new Spaceship();

        enterprise.nameOfSpaceship = "Enterprise";
        enterprise.speedOfSpaceship = 5;
        enterprise.displayName();
        enterprise.displaySpeed();

        Spaceship fate = new Spaceship();

        fate.nameOfSpaceship = "Fate";
        fate.speedOfSpaceship = 4;
        fate.displayName();
        fate.displaySpeed();
    }
}

class Spaceship {
    String nameOfSpaceship;
    int speedOfSpaceship;

    void displayName(){
        System.out.printf("Name: %s\n", nameOfSpaceship);
    }

    void displaySpeed(){
        System.out.printf("Speed: %d\n", speedOfSpaceship);
    }
}