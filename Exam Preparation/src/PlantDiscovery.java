import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                    // NE E RESHENA PRAVILNO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantsRarityMap = new HashMap<>();
        Map<String, Double> ratePlantsMap = new HashMap<>();



        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] tokens = line.split("<->");
            String plant = tokens[0];
            int rarity = Integer.parseInt(tokens[1]);

            plantsRarityMap.putIfAbsent(plant, 0);
            ratePlantsMap.putIfAbsent(plant, 0.0);
            if (plantsRarityMap.get(plant) < rarity){
                plantsRarityMap.put(plant, rarity);
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] tokens2 = input.split("[: -]+");
            String command = tokens2[0];
            String plant = tokens2[1];

            if (!ratePlantsMap.containsKey(plant)){
                System.out.println("error");
            }else {

                switch (command) {

                    case "Rate":
                        double rate = Double.parseDouble(tokens2[2]);
                        if (ratePlantsMap.get(plant) == 0) {
                            ratePlantsMap.put(plant, rate);
                        } else {
                            double newRate = (ratePlantsMap.get(plant) + rate) / 2;
                            ratePlantsMap.put(plant, newRate);
                        }


                        break;

                    case "Update":
                        int newRarity = Integer.parseInt(tokens2[2]);
                        plantsRarityMap.put(plant, newRarity);


                        break;

                    case "Reset":
                        if (ratePlantsMap.containsKey(plant)) {
                            ratePlantsMap.replace(plant, 0.0);
                        }
                        break;

                    default:
                        System.out.println("error");

                }
            }

            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantsRarityMap.entrySet()
                .stream()
                .sorted((p1, p2) -> {
                    int result = p2.getValue() - p1.getValue();
                    if (result == 0){
                        double result2 = (ratePlantsMap.get(p2.getKey()) - ratePlantsMap.get(p1.getKey()));
                        return (int) result2;
                   }
                    return result;
                })
                .forEach(entry -> {
                    System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), ratePlantsMap.get(entry.getKey()));
                });
    }
}
