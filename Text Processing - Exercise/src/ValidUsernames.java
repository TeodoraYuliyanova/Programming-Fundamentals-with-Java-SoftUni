import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] usernames = scanner.nextLine().split(", ");

        StringBuilder sb = new StringBuilder();

        for (String username : usernames) {

            if (username.length() >= 3 && username.length() <= 16){

                for (int i = 0; i < username.length(); i++) {

                    char symbol = username.charAt(i);

                    if (Character.isDigit(symbol) || Character.isLetter(symbol) || symbol == 45 || symbol == 95){

                        sb.append(symbol);
                    }else {
                        break;
                    }
                }
            }

            if (sb.length() == username.length()){

                System.out.println(sb);
            }
            sb.setLength(0);

        }


    }
}
