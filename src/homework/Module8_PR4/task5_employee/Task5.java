package homework.Module8_PR4.task5_employee;

/*The problem gives you a sample input data string containing all employee information of a company.
For example "Peter, 2013, software developer--John, 2012, CEO--David, 2014, technician..." means
there are 3 people in this company (segmented by '--' ), the first is Peter, he entered the company in 2013
as a software developer. The second is John as CEO, the third is David as technician.
1. Parse the string and save the information in the objects of corresponding structure.
2. The issue is asking to output information in an array.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {

    private List<Employee> employeeList (String stringOfEmployees){
        String [] arrayOfString = stringOfEmployees.split("--");

        List<Employee> employees = new ArrayList<>(arrayOfString.length);
        for (int i = 0; i < arrayOfString.length; i++) {
            String[] temp = arrayOfString[i].split(", ");

            Employee employee = new Employee();
            employee.name = temp[0];
            employee.yearOfEntered = Integer.parseInt(temp[1]);
            employee.position = temp[2];

            employees.add(employee);
        }

        return employees;
    }

    public void displayList(List<Employee> employees){
        System.out.print("Name\t\tYear\t\tPosition\n");
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).name + "\t\t" + employees.get(i).yearOfEntered + "\t\t"
                    + employees.get(i).position + "\n");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Task5 obj = new Task5();
        File file = new File("D:\\QA\\Java\\com-itstep-learning-java\\learning_java\\src\\homework\\Module8_PR4\\task5_employee\\employee.txt");
        Scanner sc = new Scanner(file);

        String stringOfEmployees = "";

        while (sc.hasNextLine()) {
            stringOfEmployees = sc.nextLine();
        }

        System.out.println(stringOfEmployees + "\n");
        List<Employee> employees = obj.employeeList(stringOfEmployees);
        obj.displayList(employees);
    }
}

class Employee {
    String name;
    int yearOfEntered;
    String position;
}
