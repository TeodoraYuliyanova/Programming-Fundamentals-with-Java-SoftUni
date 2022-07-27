import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String [] line = scanner.nextLine().split("\\s+");

       char [] text1 = line[0].toCharArray();
       char [] text2 = line[1].toCharArray();

       int sum = 0;

       int smallerTextLength = Math.min(text1.length, text2.length);
       int biggerTextLength = Math.max(text1.length, text2.length);


        for (int i = 0; i < biggerTextLength; i++) {

            if (i < smallerTextLength){

                sum += text1[i] * text2[i];

            }else {

                if (text1.length > text2.length){
                    sum += text1[i];
                }else {
                    sum += text2[i];
                }
            }

        }

        System.out.println(sum);
    }
}
