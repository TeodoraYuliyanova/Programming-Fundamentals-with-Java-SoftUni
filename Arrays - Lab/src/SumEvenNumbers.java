import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        int[] numArr = Arrays.stream(inputLine.split(" ")).mapToInt(Integer::parseInt).toArray();
         int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            int currentE = numArr[i];

            if (currentE % 2 == 0){
                sum += currentE;
            }
        }
        System.out.print(sum);

    }
}
