package classwork._16_2710_Generic.task1;

import java.util.ArrayList;
import java.util.List;

public class Autopark<T> {

    List<T> transports;

    public Autopark() {
        this.transports = new ArrayList<>();
    }

    public List<T> getTransports() {
        return transports;
    }

    public void setTransports(List<T> transports) {
        this.transports = transports;
    }

    public void setTransports(T transport) {
        transports.add(transport);
    }
}
