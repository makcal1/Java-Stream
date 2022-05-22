import java.util.Arrays;
import java.util.List;

public class SumExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");

        List<MapperExample.User> userList = names.stream()
                .filter(SumExample::isNotSam)
                .map(MapperExample.User::new)
                .toList();

       int sum = userList.stream()
                .mapToInt(MapperExample.User::getAge)
                .sum();

        System.out.println(sum); // 90
    }


    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }



}