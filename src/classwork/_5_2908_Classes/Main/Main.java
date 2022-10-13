package classwork._5_2908_Classes.Main;

import classwork._5_2908_Classes.Task1.Person;
import classwork._5_2908_Classes.Task2.City;
import classwork._5_2908_Classes.Task3.Country;
import classwork._5_2908_Classes.Task5.Book;
import classwork._5_2908_Classes.Task6.Car;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        Car audir8 = new Car("audi r8", "Audi", 2006, 5.204);
        cars.add(audir8);
        Car bugattiChiron = new Car("Bugatti Chiron", "Bugatti", 2016);
        cars.add(bugattiChiron);
        Car bmwi8 = new Car("BMW i8", "BMW");
        cars.add(bmwi8);

        ArrayList<Book> books = new ArrayList<>();

        Book theShadowOfTheWind = new Book("The Shadow of the Wind", "Carlos Ruiz Zafón");
        books.add(theShadowOfTheWind);
        Book carmenMola = new Book("La Bestia", "CARMEN MOLA", 2021,
                "Premio Planeta", "historical thriller",544);
        books.add(carmenMola);
        Book sira = new Book("Sira ","MARÍA DUEÑAS", "Contemporary");
        books.add(sira);

        ArrayList<Person> people = new ArrayList<>();

        Person messi = new Person("Lionel Messi", LocalDate.of(1987,6,24),
                0,"Barcelona","Spain"," ",books, cars);
        people.add(messi);
        Person goya = new Person("Francisco Goya", LocalDate.of(1746,4,5));
        people.add(goya);
        Person alonso = new Person("Fernando Alonso", LocalDate.of(1984, 7, 6),34598744);
        people.add(alonso);


        ArrayList<City> cities = new ArrayList<>();

        City madrid = new City("Madrid", "Central", "Spain",
                3223334,28001, 34, people);
        cities.add(madrid);
        City barcelona = new City("Barcelona", "Catalonia", "Spain");
        cities.add(barcelona);
        City valencia = new City("Valencia");
        cities.add(valencia);

        Country spain = new Country("Spain", "Europa",
                47450795,34,"Madrid", cities);


        System.out.println(spain.toString());






    }


}
