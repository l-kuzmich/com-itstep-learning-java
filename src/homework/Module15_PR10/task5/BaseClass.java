package homework.Module15_PR10.task5;

public class BaseClass {

    private int count = 0;

    private void showCount(){
        System.out.println("count = " + count);
    }

    public void doSomething(){
        new BaseClass(){
            public void changeCount(){
                System.out.println("Hello from anonymous class");
                super.count = 15;
                super.showCount();
            }
        }.changeCount();
    }

}
