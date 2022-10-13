package classwork._9_0310_Annotations.Task2;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Automobile> automobiles = new ArrayList<>();
        automobiles.add(new Car("Audi R 8", "Car"));
        automobiles.add(new Car("Bugatti Veron", "Car"));
        automobiles.add(new Truck("Mersedes", "Truck"));
        for (Automobile a: automobiles) {
            System.out.println(a);
        }

        System.out.println(automobiles.get(0).isAutomobile());

    }
}
