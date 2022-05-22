import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", " Sachin" ,"Sam", "Greg", "Ryan" , "Sachin");

        Optional<String> optional = names.stream()
                .filter(filter -> filter.equalsIgnoreCase("Sachin"))
                .findAny();


    }
}
