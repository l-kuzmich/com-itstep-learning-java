package classwork.Pr2908.Task7;

public class Contractor {
    public int a;

    static void showA(int a) {
        a = 7;
        System.out.println(a);
    }

    public Contractor(int a) {
        this.a = 8;
        System.out.println(a);
    }

    {
        a = 6;
    }

    public static void main(String[] args) {
        int a = 5;
        Contractor contractor = new Contractor(a);
        System.out.println(contractor.a);

        showA(a);
    }


}
