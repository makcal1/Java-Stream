import java.util.Arrays;
import java.util.List;


public class MapperExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");

        names.stream()
                .filter(MapperExample::isNotSam)
                .map(User::new)
                .forEach(System.out::println);
            /*
            name : Peter age : 30
            name : Greg  age : 30
            name : Ryan  age : 30
             */

    }


    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }

    static class User {
        private final String name;
        private final Integer age = 30;

        public User(String name) {
            this.name = name;
        }

        public Integer getAge() {

            return age;
        }


        @Override
        public String toString() {
            return "name : " + name + " age : " + age;
        }
    }
}

