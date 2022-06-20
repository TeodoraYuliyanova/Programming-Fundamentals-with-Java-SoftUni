import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

     double output = mathPower(num, num2);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(output));

    }

    public static double mathPower(double num, int num2){
        double result = 1;
        for (int i = 0; i < num2; i++) {
            result *= num;
        }
        return result;
    }
}
