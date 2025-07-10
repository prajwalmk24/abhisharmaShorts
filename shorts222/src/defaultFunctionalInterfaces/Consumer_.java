package defaultFunctionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumer_ {

    public Consumer_() {
        System.out.println("Coolir");
    }

    String s = "cool";

    public Consumer_(String s) {
        System.out.println("s" + s);
    }

    public Consumer_(String s,Integer i) {
        System.out.println("s" + s);
    }

    public static void main(String[] args) {
//        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
        System.out.println(new Consumer_());
        Consumer<String> printUpper = Consumer_::new;

        System.out.println("printUpper -> " + printUpper);
        printUpper.accept("hello world");

        // two arguements

        BiConsumer<String, Integer> stringStringBiConsumer = (s1, s2)-> {
            System.out.println(s1+s2);;
        };
        stringStringBiConsumer.accept("Prajwal ", 2);
    }
}
