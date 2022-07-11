import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {

    static class Message {

        String[] phrase = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] event = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random random = new Random();

        void printMessage(int number) {

            for (int i = 0; i < number; i++) {
                System.out.printf("%s %s %s - %s%n",
                        this.phrase[random.nextInt(this.phrase.length)],
                        this.event[random.nextInt(this.event.length)],
                        this.author[random.nextInt(this.author.length)],
                        this.city[random.nextInt(this.city.length)]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Message message = new Message();

        message.printMessage(n);
    }

}
