package homework.Module10_PR6.Task1;

/*Create a class with a method that is overloaded three times. Inherit a new class,
add a new overloading of the method, and show that all four methods are available in the
derived class.
*/

public class Creatable {
    public void print (){
        System.out.println("Hello");
    }

    public void print (int a){
        System.out.println(a);
    }

    public void print (String s){
        System.out.println(s);
    }
    
    
}
