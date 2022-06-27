import java.util.Locale;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (checksForHowManyCharacters(password) && checksForOnlyLetterAndDigits(password) && checksForDigits(password)){
            System.out.println("Password is valid");
        }

        if (!checksForHowManyCharacters(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!checksForOnlyLetterAndDigits(password)){
            System.out.println("Password must consist only of letters and digits");
        }

        if (!checksForDigits(password)){
            System.out.println("Password must have at least 2 digits");
        }


    }

    public static boolean checksForHowManyCharacters(String pass) {

        if (pass.length() >= 6 && pass.length() <= 10) {
            return true;
        }
        return false;
    }

    public static boolean checksForOnlyLetterAndDigits(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.toLowerCase().charAt(i);
            if ((symbol < 97 || symbol > 122) && (symbol < 48 || symbol > 57)) {
                return false;
            }

        }
        return true;
    }

    public static boolean checksForDigits (String pass){
     int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);

            if ((symbol >= 48 && symbol <= 57)){
                count++;
            }
          if (count >= 2){
              return true;
          }
        }
        return false;
    }
}
