import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[\\d.]+)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> furnitureNamesList = new ArrayList<>();

        double moneySpend = 0;

        String line = scanner.nextLine();

        while (!line.equals("Purchase")) {

            Matcher matcher = pattern.matcher(line);


            while (matcher.find()) {
                String furnitureName = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                moneySpend += price * quantity ;
               furnitureNamesList.add(furnitureName);


            }


            line = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        furnitureNamesList.stream().forEach(f -> System.out.println(f.toString()));
        System.out.printf("Total money spend: %.2f", moneySpend);

    }
}
