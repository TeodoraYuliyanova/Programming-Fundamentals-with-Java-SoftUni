import java.util.*;

public class Pirates {

    static class Town {
        String cityName;
        int population;
        int gold;

        public Town(String cityName, int population, int gold) {
            this.cityName = cityName;
            this.population = population;
            this.gold = gold;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }

        @Override
        public String toString() {
            return String.format("%s -> Population: %d citizens, Gold: %d kg", getCityName() , getPopulation(), getGold());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Town> townsMap = new LinkedHashMap<>();

        String line = scanner.nextLine();
        while (!line.equals("Sail")) {
            String[] tokens = line.split("\\|\\|");
            String townName = tokens[0];
            int population = Integer.parseInt(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);

            if (townsMap.containsKey(townName)) {
                Town town = townsMap.get(townName);
                town.setGold(town.getGold() + gold);
                town.setPopulation(town.getPopulation() + population);

            } else {
                Town town = new Town(townName, population, gold);
                townsMap.put(townName, town);
            }


            line = scanner.nextLine();
        }

        line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = line.split("=>");

            String command = data[0];
            String city = data[1];

            Town town = townsMap.get(city);

            switch (command) {

                case "Plunder":
                    int people = Integer.parseInt(data[2]);
                    int gold = Integer.parseInt(data[3]);

                    town.setPopulation(town.getPopulation() - people);
                    town.setGold(town.getGold() - gold);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, gold, people);

                    if (town.getGold() == 0 || town.getPopulation() == 0) {
                        System.out.printf("%s has been wiped off the map!%n", city);
                        townsMap.remove(town.getCityName());
                    }
                    break;

                case "Prosper":
                    gold = Integer.parseInt(data[2]);

                    if (gold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        line = scanner.nextLine();
                        continue;
                    }
                        town.setGold(town.getGold() + gold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, city, town.getGold());

                    break;


            }


            line = scanner.nextLine();
        }

        if (townsMap.isEmpty()){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n" , townsMap.size());
            townsMap.values().forEach(System.out::println);
        }


    }
}
