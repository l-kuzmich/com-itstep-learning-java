package classwork._15_2410_CreateMyException.task;

public class MainClass {
    public static void main(String[] args) {
        MainClass mainClass = new MainClass();

        try {
            mainClass.methodWithFirstCheckedException();
            mainClass.methodWithSecondCheckedException();
            mainClass.methodWithSonOfUncheckedException();
            mainClass.methodWithUncheckedException();
        } catch (FirstCheckedException | SecondCheckedException | UncheckedException e) {
            System.out.println(e.getMessage());
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
