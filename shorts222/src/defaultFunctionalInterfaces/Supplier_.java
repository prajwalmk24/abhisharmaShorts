package defaultFunctionalInterfaces;

import java.util.Random;
import java.util.function.Supplier;

class User {
    String name;
    User() {
        this.name = "Default User";
    }
    public String toString() {
        return name;
    }
}
public class Supplier_ {
    public static void main(String[] args) {


        Supplier<User> userSupplier = () -> new User();
        User user = userSupplier.get();
        System.out.println("User: " + user);


        // generating random number
        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(100); // 0 to 99
        System.out.println("Random number: " + randomSupplier.get());
    }
}
