import java.util.Arrays;
import java.util.List;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekExample {
    public static void main(String[] args) {

     List<String> strings= Stream.of("One", "Two", "Three")
             .filter(obj -> !obj.equals("One"))
             .peek(obj -> System.out.println("Peeked " + obj))
             .toList();

        IntStream.of(1,23,54,76, 100, 2,1)
                .skip(1)
                .filter(i -> i >4)
                .forEach(System.out::println); // 23 54 76 100

    String [] names = {"Alma" , "Baes", "Mami" ,"Albion"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("A"))
                .sorted()
                .forEach(System.out::println); // Albion Alma


    }
}
