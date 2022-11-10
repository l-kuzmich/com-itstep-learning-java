package homework.Module15_PR10;

public class MainSingleton {

    public static void main(String[] args) {
        Singleton.getInstance().sayHelloWithHashCode();
        Singleton.getInstance().sayHelloWithHashCode();
        Singleton.getInstance().sayHelloWithHashCode();
        Singleton.getInstance().sayHelloWithHashCode();
    }
}
