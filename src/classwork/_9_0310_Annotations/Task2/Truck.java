package classwork._9_0310_Annotations.Task2;

public class Truck extends Automobile implements isTruck{
    public Truck(String name, String type) {
        super(name, type);
    }

    @Override
    public boolean isTruck() {
        return true;
    }
}
