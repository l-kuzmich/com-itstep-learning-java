package homework.Module8_PR4.task2;

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
            if(s.get(i).mark >= maxMark){
                maxMark = s.get(i).mark;
                maxIndex = i;
            }
        }
        System.out.println("The maximum mark in a group has " + s.get(maxIndex).lastName + " "
                + s.get(maxIndex).firstName + ": " + maxMark);
    }

    public void displayList(List<Student> s){
        System.out.print("Last name\t\tFirst name\t\tMark\n");
        for (Student student : s) {
            System.out.print(student.lastName + "\t\t\t" + student.firstName + "\t\t\t" + student.mark + "\n");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Task2 obj = new Task2();
        File file = new File("C:\\Q1822\\com-itstep-learning-java\\src\\homework\\Module8_PR4\\task2\\Students.txt");
        Scanner sc = new Scanner(file);

        int n = sc.nextInt();
        System.out.print("Numbers of students: " + n + "\n");

        List<Student> studentList = new ArrayList<>(n);
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
