package STREAMS_EXAMPLES;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapstrema {
    public static void main(String[] args) {
        List<Employee> lemp=EmployeeCustome.getEmployees();
        List<Employee> lemp2=EmployeeCustome.getEmployees2();
        List<Employee> lemp3=EmployeeCustome.getEmployees2();

        // check for maps condition
        List<Employee>  lemp4=EmployeeCustome.getEmployees3();



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
        System.out.println(lemp.parallelStream().findAny()); //works 100% perfect

        System.out.println("Days 45 --- sum of all slary"); //

        lemp.stream().map(employee -> employee.getSalary()).min((o1, o2) -> o1-o2);

        System.out.println(        lemp.stream().map(employee -> employee.getSalary()).reduce((integer, integer2) -> integer+integer2));

        System.out.println("-----------day 47 --- creating Employee[] array from streams----------");

        System.out.println(lemp.stream().toArray(value -> new Employee[value]));

        Employee[] emplStreamObj = lemp.stream().toArray(value -> new Employee[value]);
        System.out.println(Arrays.toString(emplStreamObj));

        // or

        Employee[] fromMehtodRef = lemp.stream().toArray(Employee[]::new);
        System.out.println("fromMehtodRef"+ Arrays.toString(fromMehtodRef));


        System.out.println("Crate list from Stream --> modifiable list");

        List<Employee> listFromStream = lemp.stream().collect(Collectors.toList());// works for all java 8+
        print(listFromStream);
        System.out.println("listFromStream"+listFromStream);

        System.out.println("some codition  ");

//        List<Employee> ee = lemp.stream().toList();//// ❌ Only Java 16+
//        print(ee);//Exception in thread "main" java.lang.UnsupportedOperationException

        //System.out.println("ee"+ee);//
        //changed to java 17 it worked and it unmodifable list

        //day 50 convert to Set
        // call toSet() similar to toList()


        System.out.println("Day 51 create map from stream");
        Map<Integer, Employee > creatingMap= new HashMap<>();

        lemp4.stream().map(employee ->employee.getId());
        //  <R> Stream<R> map(Function<? super T, ? extends R> mapper);

//        creatingMap =lemp4.stream().collect(Collectors.toMap(employee -> employee.getId(),employee -> employee));
//        Collector<T, ?, Map<K,U>> toMap(Function<? super T, ? extends K> keyMapper,
//                Function<? super T, ? extends U> valueMapper) {

        System.out.println("creatingMap"+creatingMap);
        //Exception in thread "main" java.lang.IllegalStateException: Duplicate key 3 (attempted merging values Employee{id=3, name='Pharlie', salary=60000} and Employee{id=3, name='Bob Duplicate', salary=57000})
        // the line 181 throws error if there is duplicate values of key

        creatingMap=  lemp4
                .stream()
                .collect(Collectors.toMap(employee -> employee.getId(), employee -> employee,(o, o2) -> o2));
        System.out.println("creatingMap"+creatingMap);

        System.out.println("creatingMap"+creatingMap);
//        creatingMap.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("-52--------------Group by Elements usng streams-----------");
// req , group the mployees based on salary
        Map<Integer, List<Employee>> er = lemp4.stream()
                .collect(Collectors.groupingBy(employee -> employee.getSalary(), Collectors.toList()));
        System.out.println("er"+er);

        System.out.println("-53--------------Partioning Elements usng streams-----------");

        Map<Boolean, List<Employee>> partiningBySalary = new HashMap<>();

        partiningBySalary=lemp4.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary() >50_000,Collectors.toList()));
        System.out.println("partiningBySalary"+partiningBySalary);
        System.out.println("-55--------------Streams or Parallel streams-----------");

    }

    private static void print(List<Employee> listFromStream) {
        System.out.println("Before removal element in list ");
        listFromStream.remove(0);

        listFromStream.stream().forEach(System.out::println);
        System.out.println("After removal element in list ");

    }
}
