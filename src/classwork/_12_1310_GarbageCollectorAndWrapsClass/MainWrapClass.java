package classwork._12_1310_GarbageCollectorAndWrapsClass;

public class MainWrapClass {
    public static void main(String[] args) {
        Integer a = 12;
        Integer b = 12;

        if (a.equals(b)) {
            System.out.println("equals");
        } else {
            System.out.println("not");
        }

        if (a == b){
            System.out.println("equals");
        } else {
            System.out.println("not");
        }

        System.out.println(a.compareTo(b));

        //Byte f = new Byte("grr");
    }
}
