package classwork._17_3110_ArrayList_And_Set.task1;

import java.util.*;

public class ArrayListMain {
    public static void main(String[] args) {

        ArrayListMain obj = new ArrayListMain();
        List<Person> people = new ArrayList<>(4);

        people.add(new Person("Ivan", "Ivanov", 34));
        people.add(null);
        people.add(new Person("Petr", "Petrov", 23));
        people.add(new Person("Pavel", "Pavlov", 19));
        people.add(new Person("Pavel", "Pavlov", 19));

        System.out.println("ArrayList: ");
        obj.showArray(people);

        people.add(2, new Person("Novik", "Novikov", 13));

        System.out.println("\nChanged ArrayList: ");
        obj.showArray(people);


        List<Person> linkedPeople = new LinkedList<>();
        linkedPeople.add(new Person("Roman", "Romanov", 56));
        linkedPeople.add(new Person("Roman", "Romanov", 56));
        linkedPeople.add(new Person("Michail", "Michailov", 6));

        System.out.println("\nLinkedList: ");
        obj.showArray(linkedPeople);

        linkedPeople.add(2, null);

        System.out.println("\nChanged LinkedList: ");
        obj.showArray(linkedPeople);


        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Person("Ari2", "Arinov", 23));
        personSet.add(new Person("Ari1", "Arinov", 23));
        //personSet.add(null);

        System.out.println("\nHashSet: ");
        obj.showSet(personSet);

        personSet.add(new Person("Eva", "Arinova", 25));

        System.out.println("\nChanged HashSet: ");
        obj.showSet(personSet);
    }

    public void showArray (List<Person> people){

        for (Person person : people) {
            System.out.println(person);

        }
    }

    public void showSet (Set<Person> people){

        for (Person person : people) {
            System.out.println(person);

        }
    }
}
