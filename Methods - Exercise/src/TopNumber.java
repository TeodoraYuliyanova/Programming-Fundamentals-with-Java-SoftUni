import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= num; number++) {

            if (sumOfDigits(number) && oddDigit(number)){
                System.out.println(number);
            }
            
        }
    }

    public static boolean sumOfDigits(int number){
        int sum = 0;
        while(number > 0){

            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        if (sum % 8 == 0){
            return true;
        }
        return false;
    }

    public static boolean oddDigit (int number){

        while (number > 0){

            int digit = number % 10;

            if (digit % 2 != 0){
                return  true;
            }

            number = number / 10;
        }
        return false;
    }
}
