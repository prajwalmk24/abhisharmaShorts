package testKnowledge;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class testnull {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8);
        List<Integer> result = numbers.stream()
                .map(n -> {
                    if (n == 6) return null;
                    return n * 2;
                }).collect(Collectors.toList());
        System.out.println("Result: " + result);


        List<String> list = Arrays.asList("Dhoni", "Kholi", "Rohit");
        String result2 = list.stream()
                .filter(s->s.equalsIgnoreCase("Gill"))
                .findAny()
                .get();
        System.err.println(result2); //Exception .NoSuchElementException: No value present

//        a. null
//        b. Error
    }
}
