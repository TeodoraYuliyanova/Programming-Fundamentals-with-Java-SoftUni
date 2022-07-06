import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> listOfGroceries = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());


        String line = scanner.nextLine();

        while (!line.equals("Go Shopping!")) {

            String[] data = line.split(" ");
            String command = data[0];

            switch (command) {

                case "Urgent":
                    String itemToAdd = data[1];
                    if (!listOfGroceries.contains(itemToAdd)) {
                        listOfGroceries.add(0, itemToAdd);
                    }
                    break;

                case "Unnecessary":
                    String itemToRemove = data[1];
                    if (listOfGroceries.contains(itemToRemove)) {
                        listOfGroceries.remove(itemToRemove);
                    }
                    break;

                case "Correct":
                    String oldItem = data[1];
                    String newItem = data[2];

                    if (listOfGroceries.contains(oldItem)) {
                        int index = listOfGroceries.indexOf(oldItem);
                        listOfGroceries.set(index, newItem);
                    }
                    break;

                case "Rearrange":
                    String item = data[1];
                    if (listOfGroceries.contains(item)) {
                        listOfGroceries.remove(item);
                        listOfGroceries.add(item);
                    }
                    break;


            }


            line = scanner.nextLine();
        }

        System.out.println(String.join(", " , listOfGroceries));
    }
}
