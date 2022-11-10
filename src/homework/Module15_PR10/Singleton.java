package homework.Module15_PR10;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {}

    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void sayHelloWithHashCode(){
        System.out.println("show hashcode " + hashCode());
    }
}
