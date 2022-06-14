import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int currentCounter = 1;
        int max = 1;
        int sequences = 0;

        for (int i = 0; i < numbers.length -1; i++) {
            if(numbers[i] == numbers[i + 1]){
                currentCounter ++;
                if(currentCounter > max){
                    max = currentCounter;
                    sequences = numbers[i];
                }
            }else {
                currentCounter = 1;
            }
        }
        for (int i = 0; i < max; i++) {
            System.out.print(sequences + " ");
        }

    }
}