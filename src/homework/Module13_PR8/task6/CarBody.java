package homework.Module13_PR8.task6;

public enum CarBody {
    COUPE(9, 300),
    CABRIOLET(10, 500),
    SEDAN(12,600),
    ;

    private int consumption;
    private int price;

    CarBody(int consumption, int price) {
        this.consumption = consumption;
        this.price = price;
    }

    public int getConsumption(){
        return this.consumption;
    }

    public int getPrice() {
        return this.price;
    }
}
