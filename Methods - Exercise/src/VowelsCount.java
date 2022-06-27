import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(countVowels(input));

    }

    public static int countVowels(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.toLowerCase().charAt(i);

            if (letter == 97 || letter == 101 || letter == 105 || letter == 111 || letter == 117 || letter == 121){
                count++;
            }
        }
        return count;
    }
}
