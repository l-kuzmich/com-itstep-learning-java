package homework.Module13_PR8.task2;

public class Employee {
    private String lastName;
    private String firstName;
    private int age;
    private String post;
    private int salary;

    /*public void setAge (int value){
        if (value <= 0){
            throw new IllegalArgumentException("Age can't be negative");
        } else age = value;
    }*/

    public int getAge(){
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPost() {
        return post;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String lastName, String firstName, int age, String post, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;

        if (age <= 0){
            throw new IllegalArgumentException("Age can't be negative");
        } else this.age = age;

        this.post = post;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}
