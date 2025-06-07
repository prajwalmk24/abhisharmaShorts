package defaultFunctionalInterfaces;

import java.util.function.BiFunction;


class Custom_function implements BiFunction<Integer, Integer,Integer> {
    @Override
    public Integer apply(Integer t1,Integer t2) {
        return t1+ t2;
    }
}
public class BiFunction_{
    public static void main(String[] args) {
        Custom_function biFunction= new Custom_function();
        Integer result =biFunction.apply(10,20);
        System.out.println("result "+ result);

        BiFunction<Integer, Integer,Integer> integerIntegerIntegerBiFunction = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };

        System.out.println("integerIntegerIntegerBiFunction "+ integerIntegerIntegerBiFunction.apply(2,3));

    }
}
