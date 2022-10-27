package classwork._16_2710_Generic.task1;

public class Moto <T> {

    private T name;

    Moto(T name){
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "name=" + name +
                '}';
    }
}
