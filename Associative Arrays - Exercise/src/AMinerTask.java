import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> combination = new LinkedHashMap<>();

        String resource = scanner.nextLine();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!combination.containsKey(resource)) {
                combination.put(resource, quantity);
            } else {
                combination.put(resource, combination.get(resource) + quantity);
            }


            resource = scanner.nextLine();
        }

        combination.forEach((k,v) -> System.out.printf("%s -> %d%n" , k,v));
    }
}
