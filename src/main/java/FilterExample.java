import java.util.Arrays;
import java.util.List;

public class FilterExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");

        names.stream()
                .filter(FilterExample::isNotSam)
                .filter(name -> !name.equals("Sam"))
                .forEach(System.out::println); // Peter Greg Ryan
    }

    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }

}
