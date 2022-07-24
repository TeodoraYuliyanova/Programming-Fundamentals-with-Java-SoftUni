import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split("\\s+");

        List<String> result = new ArrayList<>();

        for (String word : input) {

            result.add(repeatingString(word, word.length()));

        }

        System.out.println(String.join("" , result));


    }

    public static String repeatingString(String word, int count) {

        String[] repeatArr = new String[count];

        for (int i = 0; i < count; i++) {

            repeatArr[i] = word;
        }

        return String.join("", repeatArr);
    }


}
