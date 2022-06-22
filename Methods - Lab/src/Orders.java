import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double prizeForOneCoffee = 1.50;
        double prizeForOneWater = 1.00;
        double prizeForOneCoke = 1.40;
        double prizeForOneSnacks = 2.00;


        switch (input) {

            case "coffee":
                coffee(quantity, prizeForOneCoffee);
                break;

            case "water":
                water(quantity, prizeForOneWater);
                break;

            case "coke":
                coke(quantity, prizeForOneCoke);
                break;

            case "snacks":
                snacks(quantity, prizeForOneSnacks);
                break;
        }
    }

    public static void coffee(int quantity, double prize) {
        double result = quantity * prize;
        System.out.printf("%.2f" , result);

    }

    public static void water(int quantity, double prize) {
        double result = quantity * prize;
        System.out.printf("%.2f" , result);
    }

    public static void coke(int quantity, double prize) {
        double result = quantity * prize;
        System.out.printf("%.2f" , result);
    }

    public static void snacks(int quantity, double prize) {
        double result = quantity * prize;
        System.out.printf("%.2f" , result);
    }
}
