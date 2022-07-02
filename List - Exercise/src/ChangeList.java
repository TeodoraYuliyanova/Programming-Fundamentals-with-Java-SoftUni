import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> listInteger = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] data = line.split("\\s+");

            String input = data[0];
            switch (input) {

                case "Delete":
                    for (int i = 0; i < listInteger.size(); i++) {
                        if (listInteger.get(i) == Integer.parseInt(data[1])){
                            listInteger.remove(i);
                            i--;
                        }
                    }
                    //listInteger.remove(Integer.valueOf(data[1]));

                    break;


                case "Insert":
                    //index,element
                    listInteger.add(Integer.parseInt(data[2]), Integer.parseInt(data[1]));
                    break;
            }


            line = scanner.nextLine();
        }

        listInteger.forEach(el -> System.out.print(el + " "));
    }
}
