import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List <Integer> hand1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List <Integer> hand2 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        while(hand1.size() != 0 && hand2.size() != 0){

            int firstPlayerHand = hand1.get(0);
            int secondPlayerHand = hand2.get(0);

            hand1.remove(0);
            hand2.remove(0);

            if (firstPlayerHand > secondPlayerHand){
                hand1.add(firstPlayerHand);
                hand1.add(secondPlayerHand);
            }else if (secondPlayerHand > firstPlayerHand){
                hand2.add(secondPlayerHand);
                hand2.add(firstPlayerHand);
            }

        }

        if (hand1.size() == 0){
            System.out.printf("Second player wins! Sum: %d" , sum(hand2));
        }

        if (hand2.size() == 0){
            System.out.printf("First player wins! Sum: %d" , sum(hand1));
        }

    }

    public static int sum(List <Integer> sum){
        int summ = 0;

        for (int element : sum) {
            summ += element;
        }
        return summ;

    }
}
