import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = line.split("\\s+");
            String input = data[0];

            switch (input) {

                case "Add":
                    int num1 = Integer.parseInt(data[1]);
                    numbers.add(num1);
                    break;

                case "Insert":
                    int numToInsert = Integer.parseInt(data[1]);
                    int index = Integer.parseInt(data[2]);
                    if (index < 0 || index >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        //index,element
                        numbers.add(index, numToInsert);
                    }
                    break;

                case "Remove":
                    int indexToRemove = Integer.parseInt(data[1]);
                    if (indexToRemove < 0 || indexToRemove >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(indexToRemove);
                    }
                    break;

                case "Shift":
                    int count = Integer.parseInt(data[2]);

                    if (data[1].equals("left")) {
                        for (int i = 0; i < count; i++) {
                            numbers.add(numbers.get(0));
                            numbers.remove(0);
                        }
                    } else {

                        for (int i = 0; i < count; i++) {
                            numbers.add(0, numbers.get(numbers.size() - 1));
                            numbers.remove(numbers.size() - 1);
                        }
                    }


                    break;


            }


            line = scanner.nextLine();
        }

        numbers.forEach(el -> System.out.print(el + " "));
    }
}
