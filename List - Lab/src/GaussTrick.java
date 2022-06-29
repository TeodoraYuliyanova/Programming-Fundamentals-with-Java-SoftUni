import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int size = numList.size();
        for (int i = 0; i < size / 2; i++) {
            numList.set(i, numList.get(i) + numList.get(numList.size() - 1));
            numList.remove(numList.size() - 1);


        }
        System.out.print(joinElementsByDelimiter(numList, " "));




    }

    public static String joinElementsByDelimiter(List<Integer> list, String delimiter) {
        String output = "";

        for (Integer item : list) {

            DecimalFormat df = new DecimalFormat("0.#");
            String numDF = df.format(item) + delimiter;

            output += numDF;
        }

        return output;
    }
}
