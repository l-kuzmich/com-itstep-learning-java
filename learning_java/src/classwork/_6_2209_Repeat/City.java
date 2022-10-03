package classwork._6_2209_Repeat;

import java.util.Objects;

public class City {
    private Country country;
    private String nameOfCity;
    private int countOfPeople;

    public City(Country country, String nameOfCity, int countOfPeople) {
        this.country = country;
        this.nameOfCity = nameOfCity;
        this.countOfPeople = countOfPeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return countOfPeople == city.countOfPeople &&
                Objects.equals(country, city.country) &&
                Objects.equals(nameOfCity, city.nameOfCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, nameOfCity, countOfPeople);
    }

    @Override
    public String toString() {
        return "City: " +
                "country is " + country  +
                ", nameOfCity is " + nameOfCity  +
                ", countOfPeople is " + countOfPeople;
    }
}
