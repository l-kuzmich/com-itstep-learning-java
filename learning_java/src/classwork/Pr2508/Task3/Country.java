package classwork.Pr2508.Task3;

import java.util.Scanner;

public class Country {
    private final Scanner scanner = new Scanner(System.in);

    private String nameOfCountry;
    private String nameOfContinent;
    private int countOfPeopleInCountry;
    private int phoneCodeOfCountry;
    private String capital;
    private String[] citiesName;

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry() {
        System.out.println("Input name of country");
        this.nameOfCountry = scanner.nextLine();
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public void setNameOfContinent() {
        System.out.println("Input name of continent");
        this.nameOfContinent = scanner.nextLine();
    }

    public int getCountOfPeopleInCountry() {
        return countOfPeopleInCountry;
    }

    public void setCountOfPeopleInCountry() {
        System.out.println("Input count of people in the country");
        this.countOfPeopleInCountry = scanner.nextInt();
    }

    public int getPhoneCodeOfCountry() {
        return phoneCodeOfCountry;
    }

    public void setPhoneCodeOfCountry() {
        System.out.println("Input phone code of the country");
        this.phoneCodeOfCountry = scanner.nextInt();
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital() {
        System.out.println("Input capital of the country");
        this.capital = scanner.nextLine();
    }

    public String[] getCitiesName() {
        return citiesName;
    }

    public void setCitiesName() {
        System.out.println("Input cities names separated by a space");
        String cities = scanner.nextLine();
        this.citiesName = cities.split(" ");
    }
}

