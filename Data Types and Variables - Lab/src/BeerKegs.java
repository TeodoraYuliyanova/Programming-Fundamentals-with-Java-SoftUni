import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int howManyBeers = Integer.parseInt(scanner.nextLine());
        String lastModelOfBeer = "";
        double max = 0;


        //π * r^2 * h

        for (int i = 1; i <= howManyBeers; i++) {
           String modelOfBeer = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double calculation = Math.PI * Math.pow(radius, 2) * height;

            if (calculation > max) {
                max =  calculation;
                lastModelOfBeer = modelOfBeer;
            }

        }
        System.out.println(lastModelOfBeer);

    }
}
