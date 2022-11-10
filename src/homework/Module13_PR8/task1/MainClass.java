package homework.Module13_PR8.task1;

public class MainClass extends Detergent {

    public void scrub(int a){
        System.out.println("Overload scrub with number " + a);
    }
    @Override
    public void scrub() {
        System.out.println("Override scrub");
    }

    public void sterilize(){
        System.out.println("sterilize");
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();

        mainClass.scrub(3);
        mainClass.scrub();
        mainClass.sterilize();
    }
}
