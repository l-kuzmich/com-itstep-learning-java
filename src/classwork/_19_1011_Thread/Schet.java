package classwork._19_1011_Thread;

import java.util.Scanner;

public class Schet extends Thread implements Runnable {

    Scanner scanner = new Scanner(System.in);

    private int ostatok = 1000;

    public void getMoney(int value) {
        /*System.out.println("Введите сумму для снятия");
        value = scanner.nextInt();*/

        if (ostatok < value) {
            throw new IllegalArgumentException("Недостаточно средств");
            //System.out.println("Недостаточно средств");
        }
        System.out.println("Операция прошла успешно");
        getOstatok();
        ostatok -= value;

    }

    public void getOstatok() {
        System.out.println("Остаток на счету " + ostatok);
    }

}
