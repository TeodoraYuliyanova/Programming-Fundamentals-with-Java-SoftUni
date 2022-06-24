import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

      characters(start, end);
    }
    public static  void characters(char start, char end){

        if (start > end){
            int temp = start;
            start = end;
            end = (char) temp;
        }
        for (int i = start + 1; i < end ; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");

        }
    }
}
