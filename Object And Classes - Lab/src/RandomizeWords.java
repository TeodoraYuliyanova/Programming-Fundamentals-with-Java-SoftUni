import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] words = input.split("\\s+");

        Random randomWord = new Random();
        for (int i = 0; i < words.length; i++) {
            int x = randomWord.nextInt(words.length);
            int y = randomWord.nextInt(words.length);

            String oldWord = words[x];
            words[x] = words[y];
            words[y] = oldWord;



        }

        System.out.println(String.join(System.lineSeparator() , words));



    }
}
