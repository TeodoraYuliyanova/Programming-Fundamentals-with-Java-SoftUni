import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double sumWithoutTaxes = 0.0;
        double taxes = 0.0;


        String line = scanner.nextLine();
        while (!line.equals("special") && !line.equals("regular")) {

            double price = Double.parseDouble(line);
            if (price < 0){
                System.out.println("Invalid price!");
                line = scanner.nextLine();
                continue;
            }
            sumWithoutTaxes += price;

            taxes += price * 0.2;


            line = scanner.nextLine();
        }

        double sum = sumWithoutTaxes + taxes;

        if (line.equals("special")){
          sum = sum - (sum * 10/100);

        }

        if (sum == 0){
            System.out.println("Invalid order!");
        }
        else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n" , sumWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n" , taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$" , Math.abs(sum));
        }
    }
}
