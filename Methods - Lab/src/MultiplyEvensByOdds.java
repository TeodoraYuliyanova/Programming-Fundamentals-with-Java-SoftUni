import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(multiplySums(num));
    }

    public static int multiplySums(int num){
        int even = evenSum(num);
        int odd = oddSum(num);
        return even * odd;
    }

    public static int evenSum(int num){

        String integerToString = Integer.toString(num);

        int [] arr = Arrays.stream(integerToString.split("")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 ==0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int oddSum(int num){
        String integerToString = Integer.toString(num);
        int[] arr = Arrays.stream(integerToString.split("")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }

        return sum;
    }


}
