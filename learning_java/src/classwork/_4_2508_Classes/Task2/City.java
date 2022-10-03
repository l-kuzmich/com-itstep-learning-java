package classwork._4_2508_Classes.Task2;

import java.util.Scanner;

public class City {
    private String nameOfCity;
    private String region;
    private String country;
    private int countOfPeople;
    private int postalCode; //почтовый индекс
    private int phoneCode;
    private final Scanner scanner = new Scanner(System.in);

    public String getNameOfCity() {
        return nameOfCity;
    }

    public void setNameOfCity() {
        System.out.println("Input name of city");
        this.nameOfCity = scanner.nextLine();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion() {
        System.out.println("Input name of region");
        this.region = scanner.nextLine();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry() {
        System.out.println("Input name of country");
        this.country = scanner.nextLine();
    }

    public int getCountOfPeople() {
        return countOfPeople;
    }

    public void setCountOfPeople() {
        System.out.println("Input count of people");
        this.countOfPeople = scanner.nextInt();
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode() {
        System.out.println("Input postal code");
        this.postalCode = scanner.nextInt();
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode() {
        System.out.println("Input phone code");
        this.phoneCode = scanner.nextInt();
    }
}
