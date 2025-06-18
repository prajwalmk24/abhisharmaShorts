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

        lemp.stream().forEach(System.out::println);

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
//        Optional<Employee> empObject = ee.stream().filter(employee -> employee != null)
//                .findFirst().get();
//        System.out.println("empObject"+empObject);


        Employee ep= ee.stream().filter(employee -> employee != null)
                .findFirst().get();
        System.out.println("ep "+ep +"\n");

      //  empObject.ifPresent(emp -> System.out.println("empObject: " + emp));

        System.out.println("orElse"+"orElseGet"+"orElseGetThrow");
        System.out.println("Day 58 ---orElse");
        int sal=12_00_000;

/*
        Exception in thread "main" java.util.NoSuchElementException: No value present
*/
//        Employee empObj = lemp.stream().filter(employee -> employee.getSalary() > sal).findFirst().get();
//        System.out.println("empObj "+ empObj);

        // so we provided 53 line to this

        Employee empObj2 = lemp.stream()
                .filter(employee -> employee.getSalary() > sal)
                .findFirst().orElse(new Employee(0,"",0));
        System.out.println("empObj2 "+ empObj2);

        System.out.println("Day 58 --- how to get default value orElseGet()");
        Employee empObj3 = lemp.stream()
                .filter(employee -> employee.getSalary() > sal)
                .findFirst().orElseGet(() -> EmployeeCustome.dummyMehtod());

        System.out.println("empObj3 "+ empObj3);


        Employee empObj4 = null;
        try {
            empObj4 = lemp.stream()
                    .filter(employee -> employee.getSalary() > sal)
                    .findFirst().orElseThrow(() -> new MyCustomException());
        } catch (MyCustomException e) {
            System.out.println("Message exact "+ e.getMessage());
        }

        System.out.println("empObj4 "+ empObj4);


        System.out.println("DAY 61 ------");
        System.out.println("isEmpty()"+"isPresent()");

        boolean ee2 = lemp.stream()
                .filter(employee -> employee.getSalary() > sal)
                .findFirst().isEmpty();
        System.out.println("ee2"+ee2 );
        boolean ee3= lemp.stream()
                .filter(employee -> employee.getSalary() > sal)
                .findFirst().isPresent();

        System.out.println("ee3"+ee3);


        System.out.println("ifPresnt()" +"  and  "+ "ifPresntOrElse()");
        int s=10_000;
//        lemp.stream()
//                .filter(employee -> employee.getSalary() > s)
//                .findFirst().ifPresent(employee -> System.out.println("employee "+employee));

        lemp.stream()
                .filter(employee -> employee.getSalary() > s)
                .findFirst().ifPresentOrElse(employee -> System.out.println("employee"+employee),() -> System.out.println("No such element is present"));


        System.out.println("Day 65 filter() in Optional");

        Employee opptEmppp=EmployeeCustome.getEmployees4();
        Optional<Employee> ooo = Optional.ofNullable(opptEmppp);

        ooo.ifPresentOrElse(employee -> System.out.println("emp"+employee),() -> System.out.println("No emp"));


        System.out.println("66 Map () and flatMap() in Optional");
ooo.map(employee -> employee.getName()).ifPresentOrElse(employee -> System.out.println("Map employee"+employee),() -> System.out.println(" Map No such element is present"));
        System.out.println("Or() in Optional ");
        System.out.println("");


    }
}
