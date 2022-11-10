package homework.Module13_PR8.task2;

/*Make a class "Employee" with at list 5 fields applying
the encapsulation. Make to of the fields read only.
Check the age to be positive and less then 100 years.

Создайте класс "Employee" по крайней мере с 5 полями, применяющими
инкапсуляцию. Сделайте одно из полей доступным только для чтения.
Проверьте, чтобы возраст был положительным и не превышал 100 лет.*/
public class MainClass {
    public static void main(String[] args) {

        try {
            Employee employee = new Employee("Iv", "Ivan", 34, "Engineer", 74000);
            System.out.println(employee);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
