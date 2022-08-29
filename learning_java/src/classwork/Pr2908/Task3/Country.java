package classwork.Pr2908.Task3;

import classwork.Pr2908.Task2.City;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String nameOfCountry;
    private String nameOfContinent;
    private int countOfPeopleInCountry;
    private int phoneCodeOfCountry;
    private String capital;
    private ArrayList<City> citiesName;

    public Country(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public Country(String nameOfCountry, String capital) {
        this(nameOfCountry);
        this.capital = capital;
    }

    public Country(String nameOfCountry, String nameOfContinent, int countOfPeopleInCountry, int phoneCodeOfCountry, String capital, ArrayList<City> citiesName) {
        this(nameOfCountry, capital);
        this.countOfPeopleInCountry = countOfPeopleInCountry;
        this.phoneCodeOfCountry = phoneCodeOfCountry;
        this.capital = capital;
        this.citiesName = citiesName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameOfCountry='" + nameOfCountry + '\'' +
                ", nameOfContinent='" + nameOfContinent + '\'' +
                ", countOfPeopleInCountry=" + countOfPeopleInCountry +
                ", phoneCodeOfCountry=" + phoneCodeOfCountry +
                ", capital='" + capital + '\'' +
                ", citiesName=" + citiesName +
                '}';
    }
}
