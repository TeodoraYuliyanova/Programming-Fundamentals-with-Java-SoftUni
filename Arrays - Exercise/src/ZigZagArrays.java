import com.sun.source.tree.UsesTree;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (i % 2 != 0) {
                firstArr[i - 1] = input[0];
                secondArr[i - 1] = input[1];
            } else {
                firstArr[i - 1] = input[1];
                secondArr[i - 1] = input[0];

            }


        }
        for (int j = 0; j < firstArr.length; j++) {
            System.out.print(firstArr[j] + " ");
        }
        System.out.println();
        for (int j = 0; j < secondArr.length; j++) {
            System.out.print(secondArr[j] + " ");
        }

    }
}
