package STREAMS_EXAMPLES;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class custom_filter {
    public static void main(String[] args) {
        List<Employee> lemp=EmployeeCustome.getEmployees();
        for (Employee emp : lemp) {
//            emp.display();
        }

//        System.out.println("OUTPUT----------------------------");
//
//        List<Employee> filtered = new ArrayList<>();
//
//        for (Employee emp : lemp) {
//            if(emp.getSalary() >= 60000){
//                filtered.add(emp);
//            }
//        }
//
//        for (Employee emp2 : filtered) {
//            emp2.display();
//            emp2.display();
//        }
//
//        System.out.println("OUTPUT------sort---------------");
//
//        filtered.sort(Comparator.comparing(Employee::getName));
//
//        // Display sorted list
//        for (Employee emp : filtered) {
//            emp.display();
//        }


        System.out.println("OUTPUT------ using streams---------------");

        // using streams
        lemp.stream().filter(loadeFromlemp->
            loadeFromlemp.getSalary() >= 60000
        ).sorted((o1, o2) -> o1.getName().compareTo(o2.getName())) .forEach(Employee::display);;

        System.out.println("-------------------------------------------------------------");
        System.out.println(
                lemp.stream().map(Employee::getSalary).collect(Collectors.toList()));

        System.out.println(lemp.stream()
                .map(employee -> employee.getSalary())
                .reduce((integer, integer2) -> integer+integer2));


    }
}
