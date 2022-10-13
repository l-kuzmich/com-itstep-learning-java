package classwork._9_0310_Annotations.Task2;

public class Automobile implements isAutomobile{
    String name;
    String type;

    @Override
    public boolean isAutomobile() {
        return true;
    }

    public Automobile(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
