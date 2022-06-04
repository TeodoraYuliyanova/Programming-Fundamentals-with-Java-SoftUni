import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyHeHas = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());
        int freeBelts = countOfStudents - countOfStudents / 6;


        double money = priceOfLightsabers * Math.ceil(countOfStudents * 1.10) + priceOfRobes * countOfStudents + priceOfBelts * freeBelts;

        if (money <= moneyHeHas) {
            System.out.printf("The money is enough - it would cost %.2flv.", money);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", money - moneyHeHas);
        }


    }
}
