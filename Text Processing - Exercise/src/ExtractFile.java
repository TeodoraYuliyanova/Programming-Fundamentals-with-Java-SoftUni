import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //C:\Internal\training-internal\Template.pptx

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String filePath = sb.substring(sb.lastIndexOf("\\") + 1 , sb.indexOf("."));
        String fileName = sb.substring(sb.indexOf(".") + 1);

        System.out.println("File name: " + filePath);
        System.out.println("File extension: " + fileName);

    }
}
