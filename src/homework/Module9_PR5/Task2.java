package homework.Module9_PR5;

/*Create a class, define two fields: instance and static, define two methods: instance and static,
 * access the fields from inside the main() method, draw a conclusion,
 * call the methods from the main()
 * draw a conclusion*/

public class Task2 {
    public static void main(String[] args) {
        Task2 obj = new Task2();

        Person person = new Person("Tom", 25);

        System.out.println(person.name);
        person.showName(person.name);

        System.out.println(Person.age);
        Person.showAge(Person.age);

    }

}

class Person {
    public String name;
    public static int age;

    Person(String name, int age)
    {
        this.name = name;
        Person.age = age;
    }

    public void showName (String name){
        System.out.println("Name is " + name);
    }

    public static void showAge (int age){
        System.out.println("Age is " + age);
    }


}
