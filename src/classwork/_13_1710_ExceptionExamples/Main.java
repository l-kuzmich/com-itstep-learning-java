package classwork._13_1710_ExceptionExamples;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(4 / 0);
        }
        catch (ArithmeticException e){
            System.out.println("It's exception " + e.getMessage());
        }
        finally {
            System.out.println("finally");
        }


    }
}
