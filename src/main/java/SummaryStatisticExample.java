import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SummaryStatisticExample {

    public static void main(String[] args) {
        IntSummaryStatistics summary = IntStream.of(2, 5, 7, 12, 14)
                .summaryStatistics();
        System.out.println(summary);
        // IntSummaryStatistics{count=5, sum=40, min=2, average=8.000000, max=14}

    }
}



