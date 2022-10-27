package classwork._16_2710_Generic.task1;


import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        MainClass mainClass = new MainClass();

        Autopark<Transport> autopark = new Autopark<>();


        Transport<Car> car = new Transport<>();
        Car audi = new Car("Audi", "R8");
        car.setTransport(audi);

        Transport<Moto> moto = new Transport<>();
        Moto m = new Moto("k");
        moto.setTransport(m);

        autopark.transports.add(car);
        autopark.transports.add(moto);


        mainClass.print(autopark);
    }

    public void print(Autopark<Transport> items) {
        System.out.println(items.getTransports());
    }

}
