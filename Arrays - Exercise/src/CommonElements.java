import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String[] firstLine = scanner.nextLine().split(" ");
         String[] secondLine = scanner.nextLine().split(" ");



        for (int i = 0; i < secondLine.length; i++) {
            for (int j = 0; j < firstLine.length; j++) {

                if (Objects.equals(secondLine[i], firstLine[j])){
                    System.out.print(secondLine[i] + " ");
                }

            }
        }

    }
}
