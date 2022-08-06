import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String line = scanner.nextLine();
        while (!line.equals("Reveal")) {
            String[] tokens = line.split("[:\\|:]+");
            String command = tokens[0];

            switch (command) {

                case "InsertSpace":
                    int index = Integer.parseInt(tokens[1]);
                    message.insert(index, " ");
                    break;

                case "Reverse":
                    String substringToBeReversed = tokens[1];
                    StringBuilder sb = new StringBuilder();
                    if (message.toString().contains(substringToBeReversed)) {
                        int start = message.indexOf(String.valueOf(substringToBeReversed.charAt(0)));
                        int end = start + substringToBeReversed.length() - 1;

                        message.delete(start, end + 1);
                        sb.append(substringToBeReversed);
                        sb.reverse();
                        message.append(sb);


                    } else {
                        System.out.println("error");
                        line = scanner.nextLine();
                        continue;
                    }
                    break;


                case "ChangeAll":
                    String substringToBeReplaces = tokens[1];
                    String replacement = tokens[2];

                    message = new StringBuilder(message.toString().replace(substringToBeReplaces, replacement));
                    break;


            }

            System.out.println(message);


            line = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s" , message);
    }

}
