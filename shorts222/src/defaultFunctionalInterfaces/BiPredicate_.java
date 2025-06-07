package defaultFunctionalInterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicate_ {
    public static void main(String[] args) {
        int num1=12, num2=1;

        BiPredicate<Integer, Integer> checkTwo =  (Integer num, Integer nu) ->{
            boolean b = num == nu;
            return b;
        };

        boolean test= checkTwo.test(num1,num2);
        System.out.println("test "+ test);
    }


}
