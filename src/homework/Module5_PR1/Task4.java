package homework.Module5_PR1;

/*Create a class called Spaceship with two fields and two methods.
Create two spaceships. Then display their fields and call methods.*/

public class Task4 {
    public static void main(String[] args) {
        Spaceship enterprise = new Spaceship();

        enterprise.nameOfSpaceship = "Enterprise";
        enterprise.speedOfSpaceship = 5;
        enterprise.displaySpaceshipName();
        enterprise.displaySpaceshipSpeed();

        Spaceship fate = new Spaceship();

        fate.nameOfSpaceship = "Fate";
        fate.speedOfSpaceship = 4;
        fate.displaySpaceshipName();
        fate.displaySpaceshipSpeed();
    }
}

class Spaceship {

    public String nameOfSpaceship;
    public int speedOfSpaceship;

    public void displaySpaceshipName(){
        System.out.printf("Name: %s\n", this.nameOfSpaceship);
    }

    void displaySpaceshipSpeed(){
        System.out.printf("Speed: %d\n", this.speedOfSpaceship);
    }
}