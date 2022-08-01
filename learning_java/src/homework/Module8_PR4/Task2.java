package homework.Module8_PR4;

/*Find the maximum mark in a group of students. Print this mark itself and its index.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public void maxMark (List<Student> s){
        double maxMark = 0;
        int maxIndex = 0;
        for (int i = 0; i < s.size() - 1; i++) {
            if(s.get(i + 1).mark > s.get(i).mark){
                maxMark = s.get(i + 1).mark;
                maxIndex = i + 1;
            }
        }
        System.out.println("The maximum mark in a group has " + s.get(maxIndex).lastName + " "
                + s.get(maxIndex).firstName + ": " + maxMark);
    }

    public void displayList(List<Student> s){
        System.out.print("Last name\t\tFirst name\t\tMark\n");
        for (int i = 0; i < s.size(); i++) {
            System.out.print(s.get(i).lastName + "\t\t\t" + s.get(i).firstName + "\t\t\t" + s.get(i).mark + "\n");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Task2 obj = new Task2();
        File file = new File("D:\\QA\\Java\\com-itstep-learning-java\\learning_java\\src\\homework\\Module8_PR4\\Students.txt");
        Scanner sc = new Scanner(file);

        int n = sc.nextInt();
        System.out.print("Numbers of students: " + n + "\n");

        List<Student> studentList = new ArrayList<Student>(n);
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.lastName = sc.next();
            student.firstName = sc.next();
            student.mark = sc.nextInt();
            studentList.add(student);
        }

        obj.displayList(studentList);
        obj.maxMark(studentList);
    }
}
class Student{
    String lastName;
    String firstName;
    double mark;
}