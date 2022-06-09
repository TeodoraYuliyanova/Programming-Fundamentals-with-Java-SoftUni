import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int pokeTargetM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        double halfOfN = pokePowerN * 0.50;

        int target = 0;

        while (pokePowerN >=  pokeTargetM) {
             pokePowerN -= pokeTargetM;
            target++;

            if (pokePowerN == halfOfN && exhaustionFactorY != 0) {
                pokePowerN /= exhaustionFactorY;
            }

        }
        System.out.println(pokePowerN);
        System.out.println(target);


    }
}
