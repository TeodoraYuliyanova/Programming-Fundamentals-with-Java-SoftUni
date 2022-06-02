import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;


        switch (day) {

            case "Friday":
                if (typeOfGroup.equals("Students")) {
                    price = groupOfPeople * 8.45;
                    if (groupOfPeople >= 30) {
                        price = price - price * 0.15;
                    }
                } else if (typeOfGroup.equals("Business")) {
                    price = 10.90;//тук има корекция
                    if (groupOfPeople >= 100) {
                        price = price * (groupOfPeople - 10);
                    } else {//добавен else
                        price = groupOfPeople * price;
                    }
                } else if (typeOfGroup.equals("Regular")) {
                    price = groupOfPeople * 15.00;
                    if (groupOfPeople >= 10 && groupOfPeople <= 20) {
                        price = price - price * 0.05;
                    }
                }
                break;
            case "Saturday":
                if (typeOfGroup.equals("Students")) {
                    price = groupOfPeople * 9.80;
                    if (groupOfPeople >= 30) {
                        price = price - price * 0.15;
                    }
                } else if (typeOfGroup.equals("Business")) {
                    price = 15.60;//тук има корекция
                    if (groupOfPeople >= 100) {
                        price = price * (groupOfPeople - 10);
                    } else {//добавен else
                        price = groupOfPeople * price;
                    }
                } else if (typeOfGroup.equals("Regular")) {
                    price = groupOfPeople * 20.00;
                    if (groupOfPeople >= 10 && groupOfPeople <= 20) {
                        price -= price * 0.05;
                    }
                }
                break;
            case "Sunday":
                if (typeOfGroup.equals("Students")) {
                    price = groupOfPeople * 10.46;
                    if (groupOfPeople >= 30) {
                        price = price - price * 0.15;
                    }
                } else if (typeOfGroup.equals("Business")) {
                    price = 16.00;//тук има корекция
                    if (groupOfPeople >= 100) {
                        price = price * (groupOfPeople - 10);
                    } else {//добавен else
                        price = groupOfPeople * price;

                    }
                } else if (typeOfGroup.equals("Regular")) {
                    price = groupOfPeople * 22.50;
                    if (groupOfPeople >= 10 && groupOfPeople <= 20) {
                        price = price - price * 0.05;
                    }
                }
                break;
        }
        System.out.printf("Total price: %.2f", price);
    }
}