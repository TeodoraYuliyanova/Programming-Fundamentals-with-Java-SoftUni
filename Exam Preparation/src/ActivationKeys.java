
import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {

            String[] tokens = input.split(">>>");

            String command = tokens[0];

            switch (command) {

                case "Contains":

                    String substring = tokens[1];
                    if (activationKey.contains(substring)) {
                        System.out.printf("%s contains %s%n", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }

                    break;

                case "Flip":

                    String upperOrLower = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);
                    String substringToBeReplaces = activationKey.substring(startIndex, endIndex);

                    if (upperOrLower.equals("Upper")) {

                        activationKey = activationKey.replace(substringToBeReplaces, substringToBeReplaces.toUpperCase());

                    } else if (upperOrLower.equals("Lower")) {

                        activationKey = activationKey.replace(substringToBeReplaces, substringToBeReplaces.toLowerCase());
                    }
                    System.out.println(activationKey);

                    break;

                case "Slice":

                    int start = Integer.parseInt(tokens[1]);
                    int end = Integer.parseInt(tokens[2]);

                    StringBuilder sb = new StringBuilder();
                    for (int i = start; i < end; i++) {

                        sb.append(activationKey.charAt(i));

                    }
                    activationKey = activationKey.replace(sb, "");
                    System.out.println(activationKey);
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s", activationKey);
    }
}
