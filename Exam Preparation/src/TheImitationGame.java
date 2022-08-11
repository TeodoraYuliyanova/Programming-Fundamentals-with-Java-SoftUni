import java.util.Scanner;

public class TheImitationGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();


        String instructions = scanner.nextLine();
        while (!instructions.equals("Decode")) {
            String[] tokens = instructions.split("\\|");

            String command = tokens[0];

            switch (command) {

                case "Move":
                    int numbersOfLettersToBeMoved = Integer.parseInt(tokens[1]);
                    message = move(message, numbersOfLettersToBeMoved);
                    break;

                case "Insert":
                    int index = Integer.parseInt(tokens[1]);
                    String valueToBeInsert = tokens[2];
                    message = insert(message, index, valueToBeInsert);

                    break;

                case "ChangeAll":
                    String substringToBeReplaced = tokens[1];
                    String replacement = tokens[2];

                    message = changeAll(message, substringToBeReplaced , replacement);

                    break;


            }


            instructions = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", message);
    }




    private static String move(String message, int n) {
        String partOne = message.substring(0, n);
        String partTwo = message.substring(n);

        return partTwo + partOne;

    }

    private static String insert(String message, int index, String valueToBeInsert) {
        String partOne = message.substring(0, index);
        String partTwo = message.substring(index);

        return partOne + valueToBeInsert + partTwo;
    }

    private static String changeAll(String message, String substringToBeReplaced, String replacement) {
        return message.replace(substringToBeReplaced, replacement);
    }


}
