package classwork._15_2410_CreateMyException.task;

public class MainClass {
    public static void main(String[] args) {
        MainClass mainClass = new MainClass();

        try {
            mainClass.methodWithFirstCheckedException();
        } catch (FirstCheckedException e) {
            System.out.println(e.getMessage());
        }

        try {
            mainClass.methodWithSecondCheckedException();
        } catch (SecondCheckedException e) {
            System.out.println(e.getMessage());
        }

        try {
            mainClass.methodWithUncheckedException();
        } catch (SonOfUncheckedException e){
            System.out.println(e.getMessage());
        } catch (UncheckedException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void methodWithFirstCheckedException () throws FirstCheckedException{
        throw new FirstCheckedException("methodWithFirstCheckedException");
    }

    public void methodWithSecondCheckedException () throws SecondCheckedException{
        throw new SecondCheckedException("methodWithSecondCheckedException");
    }

    public void methodWithUncheckedException () throws UncheckedException{
        throw new UncheckedException("methodWithUncheckedException");
    }

    public void methodWithSonOfUncheckedException () throws SonOfUncheckedException{
        throw new SonOfUncheckedException("methodWithUncheckedException");
    }
}
