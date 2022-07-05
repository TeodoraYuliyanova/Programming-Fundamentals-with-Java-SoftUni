import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> sequenceOfElements = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        int moves = 0;

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            List<Integer> theIndexesOfTheElements = Arrays.stream(line.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
            moves++;
            String outputForMoves = "-" + moves + "a";


            int firstIndex = theIndexesOfTheElements.get(0);
            int secondIndex = theIndexesOfTheElements.get(1);

            int middleOfTheSequence = sequenceOfElements.size() / 2;
            if ((firstIndex == secondIndex) || (theIndexesOfTheElements.get(0) < 0 || theIndexesOfTheElements.get(1) < 0) ||
                    (theIndexesOfTheElements.get(0) > sequenceOfElements.size() || theIndexesOfTheElements.get(1) > sequenceOfElements.size())) {
                System.out.println("Invalid input! Adding additional elements to the board");
                sequenceOfElements.add(middleOfTheSequence, outputForMoves);
                sequenceOfElements.add(middleOfTheSequence, outputForMoves);
                line = scanner.nextLine();
                continue;

            }


            if (sequenceOfElements.get(firstIndex).equals(sequenceOfElements.get(secondIndex))) {
                System.out.println("Congrats! You have found matching elements - " + sequenceOfElements.get(theIndexesOfTheElements.get(0)) + "!");
                sequenceOfElements.remove(firstIndex);
                if (secondIndex > 0 ){
                    sequenceOfElements.remove(secondIndex - 1);
                }else {
                    sequenceOfElements.remove(secondIndex);
                }
                if (sequenceOfElements.size() == 0) {
                    System.out.printf("You have won in %d turns!%n", moves);
                    break;
                }
                line = scanner.nextLine();
                continue;
            }





            if (!sequenceOfElements.get(firstIndex).equals(sequenceOfElements.get(secondIndex))) {
                System.out.println("Try again!");
                line = scanner.nextLine();
                continue;
            }


            line = scanner.nextLine();
        }

        if (sequenceOfElements.size() != 0){
            System.out.println("Sorry you lose :(");
            System.out.println(sequenceOfElements.toString().replaceAll("[\\[,\\]]" , ""));
        }

    }
}
