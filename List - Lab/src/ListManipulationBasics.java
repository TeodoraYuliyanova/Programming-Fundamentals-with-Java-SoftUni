import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer>  numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!command.equals("end")){

            List<String> commandLine = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            String input = commandLine.get(0);

            switch (input){

                case"Add":
                    int numToAdd = Integer.parseInt(commandLine.get(1));

                    numList.add(numToAdd);
                    break;

                case"Remove":
                    int numToRemove = Integer.parseInt(commandLine.get(1));
                    numList.remove(Integer.valueOf(numToRemove));
                    break;

                case"RemoveAt":
                    int numToRemoveAt = Integer.parseInt(commandLine.remove(1));
                    numList.remove(numToRemoveAt);
                    break;

                case"Insert":
                   int numToInsert = Integer.parseInt(commandLine.get(1));
                   int indexToInsert = Integer.parseInt(commandLine.get(2));
                   numList.add(indexToInsert, numToInsert);
                    break;


            }



            command = scanner.nextLine();
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]",""));
    }
}
