import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> statusOfPirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> statusOfWarship = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maxHealthOfSection = Integer.parseInt(scanner.nextLine());




        String line = scanner.nextLine();
        while (!line.equals("Retire")) {

            String[] tokens = line.split("\\s+");
            String command = tokens[0];


            switch (command) {

                case "Fire":
                    int index = Integer.parseInt(tokens[1]);
                    int damage = Integer.parseInt(tokens[2]);

                    if (index < 0 || index >= statusOfWarship.size()) {
                        line = scanner.nextLine();
                        continue;
                    } else {
                        statusOfWarship.set(index, statusOfWarship.get(index) - damage);
                    }

                    if (statusOfWarship.get(index) <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    }


                    break;

                case "Defend":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    damage = Integer.parseInt(tokens[3]);

                    if ((startIndex < 0 || startIndex >= statusOfPirateShip.size()) || (endIndex >= statusOfPirateShip.size() || endIndex <= 0)) {
                        line = scanner.nextLine();
                        continue;
                    } else {
                        for (int i = startIndex; i <= endIndex; i++) {
                            statusOfPirateShip.set(i, statusOfPirateShip.get(i) - damage);
                            if (statusOfPirateShip.get(i) <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");

                                return;
                            }
                        }
                    }

                    break;

                case "Repair":
                    index = Integer.parseInt(tokens[1]);
                    int health = Integer.parseInt(tokens[2]);

                    if (index < 0 || index >= statusOfPirateShip.size()) {
                        line = scanner.nextLine();
                        continue;
                    } else {
                        statusOfPirateShip.set(index, statusOfPirateShip.get(index) + health);
                        if (statusOfPirateShip.get(index) > maxHealthOfSection) {
                            statusOfPirateShip.set(index, maxHealthOfSection);
                        }
                    }


                    break;

                case "Status":
                    int counter = 0;
                    int sectionsThatNeedRepair = (20 * maxHealthOfSection) / 100;
                    for (int i = 0; i < statusOfPirateShip.size(); i++) {

                        if (statusOfPirateShip.get(i) < sectionsThatNeedRepair) {
                            counter++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", counter);
                    break;



            }

            line = scanner.nextLine();
        }

        int sumForPirates = 0;
        for (int i = 0; i < statusOfPirateShip.size(); i++) {
            sumForPirates += statusOfPirateShip.get(i);
        }


        int sumForWarship = 0;
        for (int i = 0; i < statusOfWarship.size(); i++) {
            sumForWarship += statusOfWarship.get(i);
        }

        if (sumForPirates > 0 && sumForWarship > 0){
            System.out.printf("Pirate ship status: %d%n" , sumForPirates);
            System.out.printf("Warship status: %d%n" , sumForWarship);
        }

    }
}
