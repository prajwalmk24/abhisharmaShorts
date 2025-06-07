package defaultFunctionalInterfaces;

import java.util.function.Consumer;

public class Consumer_ {

    public Consumer_(){
        System.out.println("Coolir");
    }
String s="cool";
    public Consumer_(String s) {
        System.out.println("s"+s);
    }

    public static void main(String[] args) {
//        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());

        Consumer<String> printUpper= Consumer_::new;

        System.out.println("printUpper"+printUpper);
        printUpper.accept("hello world");
    }
}
