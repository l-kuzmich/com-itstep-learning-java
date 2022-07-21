package Module5_PR1;

/*1. Turn the DataOnly code fragments into a program that compiles and runs.
Here is an example of a class with some fields:

        class DataOnly {
                int i;
                double d;
                boolean b;
        }

2. Modify the exercise so the values of the data in DataOnly are assigned to and printed in main().*/

public class Task3 {
    public static void main(String[] args) {

        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 12;
        dataOnly.d = 8.6;
        dataOnly.b = true;
        System.out.println(dataOnly.i + " " + dataOnly.d + " " + dataOnly.b);
    }
}

class DataOnly {
    int i;
    double d;
    boolean b;
}
