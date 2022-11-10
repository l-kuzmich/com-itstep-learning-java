package homework.Module13_PR8.task6;

public class MainClass {
    public static void main(String[] args) {
        for (CarBody c : CarBody.values()) {
            System.out.print(c + " ");
            System.out.print(c.getConsumption() + " ");
            System.out.print(c.getPrice());
            System.out.println();
        }

        Car cabriolet = new Car();
        cabriolet.bodyType = CarBody.CABRIOLET;

        System.out.println(cabriolet.bodyType);
    }
}
