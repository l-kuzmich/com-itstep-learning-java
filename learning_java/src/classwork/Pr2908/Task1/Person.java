package classwork.Pr2908.Task1;

import classwork.Pr2908.Task5.Book;
import classwork.Pr2908.Task6.Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private int phone;
    private String city;
    private String country;
    private String address;
    ArrayList<Book> books;
    ArrayList<Car> cars;

    private final Scanner scanner = new Scanner(System.in);

    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, LocalDate dateOfBirth, int phone) {
        this(name,dateOfBirth);
        this.phone = phone;
    }

    public Person(String name, LocalDate dateOfBirth, int phone, String city, String country, String address, ArrayList<Book> books, ArrayList<Car> cars) {
        this(name, dateOfBirth, phone);
        this.city = city;
        this.country = country;
        this.address = address;
        this.books = books;
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phone=" + phone +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", books=" + books +
                ", cars=" + cars +
                '}';
    }
}
