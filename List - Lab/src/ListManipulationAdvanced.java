import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(console.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command;
        while (!"end".equals(command=console.nextLine())){
            String[] commandWhitArgument = command.split(" ");
            switch (commandWhitArgument[0]){
                case "Contains":
                    String haveNumber = contains(numbers, Integer.parseInt(commandWhitArgument[1]));
                    System.out.println(haveNumber);
                    break;
                case "Print":
                    printEvenOdd(numbers, commandWhitArgument[1]);
                    break;
                case "Get":
                    getSum(numbers);
                    break;
                case "Filter":
                    printFiltered(numbers, commandWhitArgument[1], Integer.parseInt(commandWhitArgument[2]));
                    break;
            }
        }
    }

    private static void printFiltered(List<Integer> numbers, String condition, int number) {
        switch (condition){
            case "<":
                for (int n : numbers) {
                    if (n < number) System.out.print(n + " ");
                }
                System.out.println();
                break;
            case ">":
                for (int n : numbers) {
                    if (n > number) System.out.print(n + " ");
                }
                System.out.println();
                break;
            case ">=":
                for (int n : numbers) {
                    if (n >= number) System.out.print(n + " ");
                }
                System.out.println();
                break;
            case "<=":
                for (int n : numbers) {
                    if (n <= number) System.out.print(n + " ");
                }
                System.out.println();
                break;
        }
    }

    private static void getSum(List<Integer> numbers) {
        long sum=0;
        for (int n : numbers) {
            sum +=n;
        }
        System.out.println(sum);
    }

    private static void printEvenOdd(List<Integer> numbers, String s) {
        int a=0;
        if(s.equals("odd")) a=1;
        for (int n : numbers) {
            if (n%2 == a) System.out.print(n + " ");
        }
        System.out.println();
    }

    private static String contains(List<Integer> numbers, int number) {
        for (int n : numbers) {
            if (n == number) return "Yes";
        }
        return "No such number";
    }
}
 