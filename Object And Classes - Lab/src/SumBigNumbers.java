import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        BigInteger line1 = new BigInteger(scanner.nextLine());
        BigInteger line2 = new BigInteger(scanner.nextLine());

        BigInteger result = line1.add(line2);

        System.out.println(result);
    }
}
