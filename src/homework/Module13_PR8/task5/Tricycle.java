package homework.Module13_PR8.task5;

public class Tricycle extends Cycle{

    @Override
    public void ride(){
        wheels = 3;
        System.out.println("Tricycle has " + getWheels() + " wheels");
    }
}
