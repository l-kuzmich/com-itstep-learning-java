package classwork.Pr2209;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main ob = new Main();

        ArrayList<City> cityArrayList = new ArrayList<>();
        Country Belarus  = new Country("Belarus", "Europe");
        City Vitebsk = new City(Belarus, "Vitebsk", 150000);
        City Minsk = new City(Belarus, "Minsk", 1000000);
        City Grodno = new City(Belarus, "Grodno", 120000);
        City Gomel = new City(Belarus, "Gomel", 160000);
        City Brest = new City(Belarus, "Brest", 180000);

        cityArrayList.add(Vitebsk);
        cityArrayList.add(Minsk);
        cityArrayList.add(Gomel);
        cityArrayList.add(Grodno);
        cityArrayList.add(Brest);

        System.out.println(Belarus.toString());

        for (City city: cityArrayList) {
            System.out.println(city);
        }

        System.out.println(ob.equalsHCode(Vitebsk, Brest));
    }

    public String equalsHCode (City city, City city2){
        return city.hashCode() == city2.hashCode() ? "true" : "false";
    }
}
