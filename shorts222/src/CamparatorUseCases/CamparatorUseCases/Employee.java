package CamparatorUseCases.CamparatorUseCases;

import CamparatorUseCases.MyComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Employee {


    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        // Creating 5 records
        people.add(new Person(22, "Bob"));
        people.add(new Person(4, "Diana"));
        people.add(new Person(35, "Ethan"));
        people.add(new Person(21, "Alice"));
        people.add(new Person(13, "Charlie"));


//        Collections.sort(people, (o1, o2) -> {
//            return MyComparator.compareByName(o1,o2);
//        });

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return MyComparator.compareByName(o1,o2);
            }
        });


        // Display all records
        for (Person person : people) {
            person.display();
        }

        List<String> names = new ArrayList<>();

        // Add 5 names to the list
        names.add("Diana");
        names.add("Ethan");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Print the list
        for (String name : names) {
            System.out.println(name);
        }

//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        Collections.sort(names,String::compareTo);
        System.out.println("After sorting ' ");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
