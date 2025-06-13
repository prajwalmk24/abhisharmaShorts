package STREAMS_EXAMPLES;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalClaases_56 {
    public static void main(String[] args) {
        List<Employee> lemp=EmployeeCustome.getEmployees();
        List<Employee> lemp2=EmployeeCustome.getEmployees2();
        Employee lemp3=EmployeeCustome.getEmployees4();

        // check for maps condition
        List<Employee>  lemp4=EmployeeCustome.getEmployees3();

        System.out.println("day 56 ---------varius ways to create Optional classes");
//        Optional<Employee> opObj = Optional.of(lemp3); //hread "main" java.lang.NullPointerException
//        System.out.println("opObj"+opObj);

        Optional<Employee> opObj2 = Optional.ofNullable(lemp3);

        System.out.println("avoids Null Pointer Exception -> "+opObj2);

        /////////////////////////////////////////////////
        System.out.println("Day-57: How to get value out of Optional in Java #shorts #java");
        Optional<List<Employee>> oppp = Optional.of(lemp2);
        System.out.println("oppp"+oppp);
        List<Employee> ee = oppp.get(); // getting List from Optional 
        System.out.println("ee"+ee);
        Optional<Employee> empObject = ee.stream().filter(employee -> employee != null)
                .findFirst();
        System.out.println("empObject"+empObject);
      //  empObject.ifPresent(emp -> System.out.println("empObject: " + emp));

        //////////////////////////////////////////////////

        System.out.println("Day 58 ---orElse");



    }
}
