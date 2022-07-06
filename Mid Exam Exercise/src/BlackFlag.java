import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfThePlunder = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double total = 0.0;
        for (int i = 1; i <= daysOfThePlunder; i++) {

            total += dailyPlunder;

            if (i % 3 == 0){

                total =  total + (dailyPlunder * 0.5);
            }

            if (i % 5 == 0){

                total = total - (total * 0.30);
            }


        }

        if (total >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained." , total);

        }

       if (total < expectedPlunder){

            System.out.printf("Collected only %.2f%% of the plunder.", total / expectedPlunder * 100);
        }
    }
}
