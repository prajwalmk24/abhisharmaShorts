package STREAMS_EXAMPLES;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class creattingStreams {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add(null);
        Stream<String> listStream = fruits.stream();


        Set<String> cities = new HashSet<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("London");  // Duplicate, won't be added
        Stream<String> setCities=cities.stream();

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Alice");
        studentMap.put(2, "Bob");
        studentMap.put(3, "Charlie");
        Stream<Map.Entry<Integer, String>> mapstream = studentMap.entrySet().stream();


        int a[]={1,2,3,4,5};
        Stream.of(a);

        Stream<Integer> generateOwnStream = Stream.generate(() ->
                new Random().nextInt()
        );

        System.out.println("generateOwnStream"+generateOwnStream);

        //
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("s"+s);
            }
        });
//or
        fruits.stream().forEach(System.out::println);

       // System.out.println("fruits"+Arrays.toString(fruits.toArray()));




    }

}
