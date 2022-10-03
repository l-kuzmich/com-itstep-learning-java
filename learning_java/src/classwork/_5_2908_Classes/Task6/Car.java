package classwork._5_2908_Classes.Task6;

public class Car {
    private String name;
    private String manufacturer;
    private int yearOfRelease;
    private double engineCapacity;

    public Car(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public Car(String name, String manufacturer, int yearOfRelease) {
        this(name, manufacturer);
        this.yearOfRelease = yearOfRelease;
    }

    public Car(String name, String manufacturer, int yearOfRelease, double engineCapacity) {
        this(name, manufacturer, yearOfRelease);
        this.engineCapacity = engineCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
