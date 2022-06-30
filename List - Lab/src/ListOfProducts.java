import java.util.*;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<String> input = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            String product = scanner.nextLine();

            input.add(product);
            
        }

        Collections.sort(input);

        for (int i = 0; i < input.size(); i++) {
            System.out.printf("%d.%s%n" , i + 1 , input.get(i));
        }
    }


}
