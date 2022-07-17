import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> countsNumbers = new TreeMap<>();

        for (int i = 0; i < numbers.size(); i++) {

            double currentNum = numbers.get(i);

            if (countsNumbers.containsKey(currentNum)) {
                countsNumbers.put(currentNum, countsNumbers.get(currentNum) + 1);
            } else {
                countsNumbers.put(currentNum, 1);
            }

        }

        for (Map.Entry<Double, Integer> entry : countsNumbers.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
