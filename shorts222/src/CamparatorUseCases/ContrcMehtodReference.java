package CamparatorUseCases;


import java.util.function.Supplier;

class PersonWithOneName {
    String name = "Default";

    public  PersonWithOneName() {
        System.out.println("Person created");
    }


}
public class ContrcMehtodReference {
    public static void main(String[] args) {
        Supplier<PersonWithOneName> personSupplier = PersonWithOneName::new;  // Constructor method reference
        PersonWithOneName person = personSupplier.get();  // Calls new Person()
        System.out.println(person.name);
    }
}
