package classwork._6_2209_Repeat;

import java.util.Objects;

public class Country {
    private String nameOfCountry;
    private String continent;

    public Country(String nameOfCountry, String continent) {
        this.nameOfCountry = nameOfCountry;
        this.continent = continent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(nameOfCountry, country.nameOfCountry) &&
                Objects.equals(continent, country.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfCountry, continent);
    }

    @Override
    public String toString() {
        return "Country: " +
                "name Of Country is " + nameOfCountry +
                ", continent is " + continent;
    }
}
