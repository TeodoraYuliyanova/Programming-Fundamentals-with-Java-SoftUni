import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hasWinner = false;

        Map<String, Integer> legendary = new LinkedHashMap<>();
        legendary.put("shards", 0);
        legendary.put("fragments", 0);
        legendary.put("motes", 0);

        String winner = "";

        while (!hasWinner) {
            String[] line = scanner.nextLine().split("\\s+");

            for (int i = 0; i < line.length - 1; i += 2) {
                int quantity = Integer.parseInt(line[i]);
                String material = line[i + 1].toLowerCase();

                legendary.putIfAbsent(material, 0);
                legendary.put(material, legendary.get(material) + quantity);

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {

                    if (legendary.get(material) >= 250) {
                        legendary.put(material, legendary.get(material) - 250);
                        winner = material;
                        hasWinner = true;
                        break;
                    }
                }

            }
        }

        switch (winner) {

            case "shards":
                System.out.println("Shadowmourne obtained!");
                break;

            case "fragments":
                System.out.println("Valanyr obtained!");
                break;

            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;
        }

        legendary.forEach((k, v) -> System.out.printf("%s: %d%n", k, v));


    }
}
