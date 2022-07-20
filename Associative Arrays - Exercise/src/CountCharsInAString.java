import java.util.*;
import java.util.stream.Collectors;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> line = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Map<Character, Integer> combination = new LinkedHashMap<>();

        for (String word : line) {

            for (int i = 0; i < word.length(); i++) {
                char symbol = word.charAt(i);

                if (!combination.containsKey(symbol)){
                    combination.put(symbol, 1);
                }else {
                    combination.put(symbol, combination.get(symbol) + 1);
                }
            }
        }

        combination.forEach((k,v) -> System.out.printf("%c -> %s%n" , k, v));


    }
}
