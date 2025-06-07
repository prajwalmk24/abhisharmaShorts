package defaultFunctionalInterfaces;

import java.util.function.Function;

// @FunctionalInterface
// public interface Function<T, R> {
//     R apply(T t);
// }

class Custom_function2 implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer t) {
        return ++t;
    }
}

public class Function_ {
    public static void main(String[] args) {
        Custom_function2 operation = new Custom_function2();
        System.out.println(operation.apply(2));

    }
}