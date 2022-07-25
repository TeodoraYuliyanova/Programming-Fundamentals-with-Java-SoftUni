import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();

        String line = scanner.nextLine();

        int index = line.indexOf(wordToRemove);

        while (line.contains(wordToRemove)) {

            line = line.replace(wordToRemove, "");

            index = line.indexOf(wordToRemove);


        }

        System.out.println(line);

    }
}
