package classwork._19_1011_Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Schet schet = new Schet();

        Person p1 = new Person();
        p1.name = "Ivan";
        p1.sum = 100;

        Person p2 = new Person();
        p2.name = "Petr";
        p2.sum = 200;

        ManageSchet tr1 = new ManageSchet(schet, p1);
        ManageSchet tr2 = new ManageSchet(schet, p2);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(tr1);
        service.execute(tr2);

        service.shutdown();
    }
}
