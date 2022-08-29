package classwork.Pr2908.Task2;

import classwork.Pr2908.Task1.Person;

import java.util.ArrayList;

public class City {
    private String nameOfCity;
    private String region;
    private String country;
    private int countOfPeople;
    private int postalCode; //почтовый индекс
    private int phoneCode;
    private ArrayList<Person> people;

    public City(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public City(String nameOfCity, String region, String country) {
        this(nameOfCity);
        this.region = region;
        this.country = country;
    }

    public City(String nameOfCity, String region, String country, int countOfPeople, int postalCode, int phoneCode, ArrayList<Person> people) {
        this(nameOfCity, region, country);
        this.countOfPeople = countOfPeople;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
        this.people = people;
    }

    @Override
    public String toString() {
        return "\nCity{" +
                "nameOfCity='" + nameOfCity + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", countOfPeople=" + countOfPeople +
                ", postalCode=" + postalCode +
                ", phoneCode=" + phoneCode +
                ", people=" + people +
                '}';
    }
}
