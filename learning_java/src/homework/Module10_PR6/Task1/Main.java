package homework.Module10_PR6.Task1;

public class Main {
    public static void main(String[] args) {
        Creatable first = new Creatable();
        Creatable a = new FirstClass();

        first.print();
        a.print();

        a.print(3);
        a.print("f");
    }
}
