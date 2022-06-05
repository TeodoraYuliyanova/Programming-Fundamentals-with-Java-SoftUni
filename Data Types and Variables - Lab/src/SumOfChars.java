import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        for (int i = 0; i < numberOfLines; i++) {
            char letters = scanner.nextLine().charAt(0);


            sum += letters;
        }
        System.out.printf("The sum equals: %d", sum);

    }
}
