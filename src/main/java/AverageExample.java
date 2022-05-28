import java.util.Arrays;
import java.util.List;

public class AverageExample {
    public static void main(String[] args) {
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println); // 44.0

        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Mami");
        people.stream()
                .map(String::toLowerCase)
                .filter(name -> name.startsWith("a"))
                .forEach(System.out::println); // al ankit

    }
}
