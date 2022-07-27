import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     char [] input = scanner.nextLine().toCharArray();

     StringBuilder sb = new StringBuilder();


        for (int i = 0; i < input.length; i++) {

            char symbol = (char) (input[i] + 3);

            sb.append(symbol);

        }
        System.out.println(sb);

    }
}
