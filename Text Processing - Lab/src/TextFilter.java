import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] wordsToBan = scanner.nextLine().split(", ");

        String text = scanner.nextLine();

      for (String wordToBan : wordsToBan){

          if (text.contains(wordToBan)){

              String replacement = replaceString("*" ,wordToBan.length());

              text = text.replace(wordToBan, replacement);

          }
      }
        System.out.println(text);


    }

    public static String replaceString (String word, int count){

        String [] result = new String[count];

        for (int i = 0; i < count; i++) {

            result [i] = word;
        }
        return String.join("" , result);
    }
}
