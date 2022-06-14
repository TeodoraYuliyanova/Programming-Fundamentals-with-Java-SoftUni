import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
         int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] + array[j] == number){
                    System.out.println(array[i] + " " + array[j]);
                }
            }
        }
    }
}
