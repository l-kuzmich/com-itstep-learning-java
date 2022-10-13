//package classwork.Pr2508.Task1;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Creator creator = new Creator();
//        List<Person> peopleList = new ArrayList<>();
//
//        while (true) {
//            System.out.println("Do you want to create a new person? (y/n)");
//            if (scanner.nextLine().equals("y")){
//                peopleList.add(creator.createNewPerson());
//            }
//            else if (scanner.nextLine().equals("n")){
//                break;
//            }
//        }
//
//        while (true){
//            System.out.println("Do you want to show people list? (y/n)");
//            if (scanner.nextLine().equals("y")){
//                for (int i = 0; i < peopleList.size(); i++) {
//                    creator.displayPerson(peopleList.get(i));
//                }
//            }
//            else if (scanner.nextLine().equals("n")){
//                break;
//            }
//        }
//    }
//}
