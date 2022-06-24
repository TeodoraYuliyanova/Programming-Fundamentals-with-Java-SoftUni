import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f" , factorial(num1, num2));

    }

    public static double factorial (int num1, int num2){
        double factorial1 = 1.0;
        for (int i = 1; i <= num1 ; i++) {
            factorial1 *= i;
        }

        double factorial2 = 1.0;
        for (int i = 1; i <= num2 ; i++) {
            factorial2 *= i;
        }

        return factorial1 / factorial2;
    }
}
