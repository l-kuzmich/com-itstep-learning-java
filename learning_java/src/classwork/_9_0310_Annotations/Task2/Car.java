package classwork._9_0310_Annotations.Task2;

public class Car extends Automobile implements isCar{

    public Car(String name, String type) {
        super(name, type);
    }

    public void setType (){
        super.type = "Car";
    }

    @Override
    public boolean isCar() {
        return true;
    }
}
