package classwork._16_2710_Generic.task1;

import java.util.List;

public class Transport <T>{

    T transport;

    public void setTransport(T transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "transport=" + transport +
                '}';
    }
}
