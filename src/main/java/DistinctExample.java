import java.util.Arrays;
import java.util.List;

public class DistinctExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Sam","Turkish", "Taiwan", "Greg", "Ryan", "Turkish");

        List<String> sortedNames = names.stream()
                .filter(text -> text.startsWith("T"))
                .map(text -> text.substring(0, 5))
                .distinct()
                .sorted().toList();

        System.out.println(sortedNames); // [Taiwa, Turki]
    }
}
