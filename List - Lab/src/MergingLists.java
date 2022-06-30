import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        int minSize = Math.min(firstList.size(), secondList.size());

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < minSize; i++) {
            int firstN = firstList.get(i);
            int secondN = secondList.get(i);

            result.add(firstN);
            result.add(secondN);


        }

        if (firstList.size() > secondList.size()){
            result.addAll(firstList.subList(minSize, firstList.size()));
        }else{
            result.addAll(secondList.subList(minSize, secondList.size()));
        }

        System.out.println(result.toString().replaceAll("[\\[\\],]",""));

    }
}
