package STREAMS_EXAMPLES;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapstrema {
    public static void main(String[] args) {
        List<Employee> lemp=EmployeeCustome.getEmployees();
        List<Employee> lemp2=EmployeeCustome.getEmployees2();
        List<Employee> lemp3=EmployeeCustome.getEmployees2();


        for (Employee emp : lemp) {
            emp.display();
        }


        // day 32,33,34,35
        System.out.println("------------getting only names-------");
        lemp.stream().map(employee -> employee.getName()).forEach(System.out::println);

        System.out.println("-------Day-33: flatMap() method of Streams in Java-----");
        System.out.println("Converting to single stream from lists ");

        Stream.of(lemp,lemp2,lemp3).forEach(System.out::println);
        System.out.println("-----------");
        System.out.println("------------using map----------");
//        Stream.of(lemp,lemp2,lemp3).map(employees -> employees.stream()).forEach(Employee::display);// Not allowed
        //Here’s why
        //Employee::display implies that display is an instance method with no arguments.
        //
        //But forEach(Employee::display) means you're trying to call display() on the Employee class — which is not allowed unless display() is static.
//        Fix:
//        If display() is an instance method of Employee, you need to call it on each employee instance, not on the class.


        //solution:
        System.out.println(Stream.of(lemp, lemp2, lemp3)
                .map(List::stream).count()); // 3

        Stream.of(lemp, lemp2, lemp3)
                        .map(List::stream)
                .forEach(s -> s.forEach(Employee::display));

        System.out.println("------------using flatmap----------");

        Stream.of(lemp,lemp2,lemp3).flatMap(employees -> employees.stream()).forEach(Employee::display);

        System.out.println("-----both map and flat map_----------");
      //  Stream.of(lemp2,lemp).forEach(System.out::println);

        Stream.of(lemp,lemp2)
                .flatMap(Collection::stream)
                .map(employee -> employee.getName())
                .forEach(System.out::println);

        System.out.println("---day 35---- ");
        System.out.println("filter name start from E /sort by salary /printname  ");

        lemp.stream()
                .filter(employee -> employee.getName().startsWith("D"))
                .sorted((o1, o2) -> o1.getSalary()-o2.getSalary())
                .map(employee -> employee.getName())
                .forEach(System.out::println);


        System.out.println("---day 36---- ");
        System.out.println("counting size of a stream-----"+lemp.stream().count());

        lemp.stream().count();


        System.out.println("---day 37---- ");
        System.out.println("both printing and counting size of a stream-----");

        long countValue= lemp.stream()
                .peek(System.out::println) //it should be forced
                .filter(employee -> employee!=null)
                .count();
        System.out.println("countVal"+countValue);

        System.out.println("---day 38---- ");
        System.out.println("allMatch() method of Streams -----");

        int a=55_000;
        double d= 100_00;
        long l=1_00_000;

        System.out.println(a +"\n"+d+"\n"+l);

        // this returns a boolean value like every data insiide list should be true or false
        // so its returns false


        System.out.println(lemp.stream()
                .allMatch(employee -> employee.getSalary() <= a));


        System.out.println("---day 39----noneMatch-------- ");


        System.out.println(lemp.stream()
                .noneMatch(employee -> employee.getSalary() <= a));


        System.out.println("---Day-40: anyMatch() method of Streams i----");

        System.out.println(lemp.stream()
                .anyMatch(employee -> employee.getSalary() <= a));

        System.out.println("--Day-41/42 : Find minimum/maximum using-----------");
        Optional<Employee> optinal=lemp.stream().min(Comparator.comparing(Employee::getSalary));
        System.out.println("optinal"+optinal);


        /*Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 5)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());*/

        System.out.println("Days 43"); // find ing first
        Optional<Employee> ww = lemp.stream().findFirst();
        System.out.println(lemp.stream().findFirst());

        System.out.println("Days 44 --- finding random element"); //
//findAny() works only in parallel stream
        System.out.println(lemp.stream().findAny());
        System.out.println(lemp.parallelStream().findAny());

        System.out.println("Days 45 --- sum of all slary"); //

       // System.out.println(lemp.stream().map(employee -> employee.getSalary()).min((o1, o2) -> o1-o2));;


        System.out.println(lemp.stream().map(employee -> employee.getSalary()).reduce(Integer::sum));

        System.out.println("----------day 47---------- creating array from using streams");

        List<Employee> ee = lemp.stream().filter(employee -> employee.getSalary() > 60_000).collect(Collectors.toList());



    }
}
