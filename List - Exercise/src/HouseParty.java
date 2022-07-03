import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<String> namesOfGuests = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String namesIfOrNotGoing = scanner.nextLine();
            String[] data = namesIfOrNotGoing.split("\\s+");
            String name = data[0];

            if (namesIfOrNotGoing.contains("not")) {
                if (!namesOfGuests.contains(name)) {
                    System.out.printf("%s is not in the list!%n", name);
                } else {
                    namesOfGuests.remove(name);
                }
            } else {
                if (namesOfGuests.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    namesOfGuests.add(name);
                }
            }


        }

        namesOfGuests.forEach(System.out::println);


    }
}
