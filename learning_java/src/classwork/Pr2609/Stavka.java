package classwork.Pr2609;

public class Stavka extends Payment {

    private int countOfDays;

    public Stavka(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    @Override
    public double calculatePayment() {
        super.payment = countOfDays * 12;
        return ;
    }
}
