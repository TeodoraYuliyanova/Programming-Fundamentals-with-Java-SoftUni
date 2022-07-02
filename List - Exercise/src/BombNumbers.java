import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List <Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List <Integer> specialNumberAndPower = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int bomb = specialNumberAndPower.get(0);
        int power = specialNumberAndPower.get(1);

        while(numbers.contains(bomb)){
            int bombIndex = numbers.indexOf(bomb);
            int start = bombIndex - power;
            int end = bombIndex + power;

            if (start < 0){
                start = 0;
            }
            if (end >= numbers.size()){
                end = numbers.size() - 1;
            }

            for (int i = start; i <= end; i++) {
                numbers.remove(start);

            }


        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        System.out.print(sum);



    }
}
