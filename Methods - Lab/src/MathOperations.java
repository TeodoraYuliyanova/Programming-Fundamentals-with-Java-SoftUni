import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (operator){

            case "/":
                System.out.printf("%.0f" , divide(num1 , num2));
                break;

            case "*":
                System.out.printf("%.0f" , multiply(num1 , num2));
                break;

            case "+":
                System.out.printf("%.0f" , add(num1 , num2));
                break;

            case"-":
                System.out.printf("%.0f" , minus(num1 , num2));
                break;


        }
    }

    public static double divide(int number, int number2){
        double result = number * 1.0 / number2;
        return result;
    }

    public static double multiply(int number, int number2){
        double result = number * number2 * 1.0;
        return result;
    }

    public static double add(int number, int number2){
        double result = number + number2;
        return result;
    }

    public static double minus(int number, int number2){
        double result = number - number2;
        return result;
    }




}
