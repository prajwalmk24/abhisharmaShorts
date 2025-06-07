package defaultFunctionalInterfaces;

import java.util.function.BiConsumer;

public class biconsumer_ {
    public static void main(String[] args) {
        BiConsumer<String, String> stringStringBiConsumer = (s1, s2)-> {
            System.out.println(s1+s2);;
        };
        stringStringBiConsumer.accept("Prajwal ", "MK");

    }
}
