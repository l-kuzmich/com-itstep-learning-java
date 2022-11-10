package homework.Module13_PR8.task5;

public class Bicycle extends Cycle{

    @Override
    public void ride(){
        wheels = 2;
        System.out.println("Bicycle has " + getWheels() + " wheels");
    }

    public void balance(){
        System.out.println("Bicycle has balance");
    }
}
