package homework.Module13_PR8.task5;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        List<Cycle> cycles = new ArrayList<>();

        //upcasting
        cycles.add(new Unicycle());
        cycles.add(new Bicycle());
        cycles.add(new Tricycle());

        for (Cycle c: cycles){
            c.ride();
        }

        //downcast
        Unicycle unicycle = (Unicycle) cycles.get(0);
        Bicycle bicycle = (Bicycle) cycles.get(1);
        Tricycle tricycle = (Tricycle) cycles.get(2);

        unicycle.ride();
        bicycle.ride();
        tricycle.ride();

        unicycle.balance();
        bicycle.balance();
    }
}
