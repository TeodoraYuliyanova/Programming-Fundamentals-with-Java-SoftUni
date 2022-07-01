import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String line = scanner.nextLine();

        List <String> inputSeparatedByPipe = Arrays.stream(line.split("\\|")).collect(Collectors.toList());

        Collections.reverse(inputSeparatedByPipe);

        System.out.println(inputSeparatedByPipe.toString().replace("[" , "").replace("]" , "").replace("," , "")
                .trim().replaceAll("\\s+" , " "));
    }
}
