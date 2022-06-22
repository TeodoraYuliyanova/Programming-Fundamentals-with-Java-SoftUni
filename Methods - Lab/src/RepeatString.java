import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int input2 = Integer.parseInt(scanner.nextLine());

        String output = printString(input, input2);

        System.out.println(output);

    }

    public static String printString (String input, int input1){
        String output = "";
        for (int i = 0; i < input1; i++) {
            output += input;
        }
        return output;
    }
}
