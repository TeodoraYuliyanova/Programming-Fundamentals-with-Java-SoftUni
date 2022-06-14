import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isTop = false;


        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (index == numbers.length - 1){
                System.out.print(currentNumber + " ");
                break;
            }

            for (int j = index + 1; j < numbers.length; j++) {
                int nextNumber = numbers[j];
                if (currentNumber > nextNumber){
                    isTop = true;

                }else {
                    isTop = false;
                    break;
                }

            }
            if (isTop) {
               System.out.print(currentNumber + " ");
           }
        }




    }
}
