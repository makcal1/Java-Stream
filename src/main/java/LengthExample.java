import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class LengthExample {
    public static void main(String[] args) throws IOException {
        Stream<String> bands =  Files.lines(Paths.get("src/main/java/bands.txt"));
//
//        bands
//                .sorted()
//                .filter(x -> x.length() > 3)
//                .forEach(System.out::println);
//        bands.close();

        // Stream rows from txt file and count
        int rowCount = (int)bands
                .count()-1;

        System.out.println(rowCount + " rows.");
        bands.close();
    }
}
